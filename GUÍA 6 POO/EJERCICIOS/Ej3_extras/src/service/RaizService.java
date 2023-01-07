/*Luego, las operaciones que se podrán realizar son las siguientes: 
• Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió ́true, imprime las 2 posibles 
soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió ́true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible. 

• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b*/
package service;

import entidad.Raiz;
import java.util.Scanner;


public class RaizService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Raiz crearRaiz(){
        Raiz r = new Raiz();
        System.out.println("Valor coef. <a>");
        r.setA(leer.nextFloat());
        
        System.out.println("Valor coef. <b>");
        r.setB(leer.nextFloat());
        
        System.out.println("Valor coef. <c>");
        r.setC(leer.nextFloat());
        
        return r;
        }
    
    //(b^2)-4*a*c 
    public float getDiscriminante(Raiz r){
        return (float) (Math.pow(r.getA(), 2))-4*r.getA()*r.getC();
    }
    
    public boolean tieneRaices(Raiz r){
        return getDiscriminante(r)>=0;
    }
    
    public boolean tieneRaiz(Raiz r){
        return getDiscriminante(r)==0;
    }
    
    public float obtenerRaices(Raiz r){
        if (tieneRaices(r)) {
            return getDiscriminante(r);
        }else{
            return 0;
        }
    }
    
    public float obtenerRaiz(Raiz r){
        if (tieneRaiz(r)) {
            return getDiscriminante(r);
        }else{
            return 0;
        }
    }
    
    //( -b±√((b^2)-(4*a*c)) )/(2*a)
    public void calcular(Raiz r){
        if (tieneRaices(r)) {
            System.out.println("Cálculo= "+ (-r.getB()+-Math.sqrt(obtenerRaices(r)))/(2*r.getA()) );
        }else{
            System.out.println("Tiene Raíces es "+tieneRaices(r));
        }
        if(tieneRaiz(r)){
            System.out.println("Cálculo= "+ (-r.getB()+-Math.sqrt(obtenerRaiz(r)))/(2*r.getA()) );
        }else{
            System.out.println("Tiene Raíz es "+tieneRaiz(r));
        }
    }
    
}
