package com.egg.biblioteca;

import com.egg.biblioteca.service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SeguridadWeb extends WebSecurityConfigurerAdapter {

@Autowired
public UsuarioServicio usuarioServ;

//PARA MEJORAR LA SEGURIDAD DEL PASSW
@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
    //servicio q usará el objeto para autenticar un usuario y luego codificamos su contraseña 
    auth.userDetailsService(usuarioServ).passwordEncoder(new BCryptPasswordEncoder());
}
    
@Override
protected void configure(HttpSecurity http) throws Exception{
    http
            .authorizeRequests()
                .antMatchers("/admin/*").hasRole("ADMIN")
                .antMatchers("/css/*","/js/*", "/img/*", "/**" )
                .permitAll()
            //CON ESTO DECIMOS QUE EL MÉTODO CORRESPONDE AL FORMULARIO LOGIN
            .and().formLogin()
                //INDICAMOS URL DONDE SE ENCUENTRA EL LOGIN
                .loginPage("/login")
                //INDICAMOS URL CON LA Q SPRING S. VA A AUTENTICAR AL USUARIO
                .loginProcessingUrl("/logincheck")//No le hace falta método en el Controller
                //INDICAMOS LAS CREDENCIALES DE LOGEO
                .usernameParameter("mail")
                .passwordParameter("password")
                //SI TODO ES CORRECTO POR DEFECTO REDIRECCIONA A LA SIGUIENTE URL
                .defaultSuccessUrl("/index")
                .permitAll()
            //AHORA SE CONFIGURA EL LOGOUT
            .and().logout()
                .logoutUrl("/logout")//No le hace falta método en el Controller
                .logoutSuccessUrl("/")
                .permitAll()
            //DEHABILITA LO QUE TRAE SPRING SECURITY
            .and().csrf()
                .disable();
    }
}
