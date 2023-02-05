usuarios = { 'Brahms', 'Schubert', 'Vivaldi', 'Verdi', 'Tchaikovsky'}
administradores={'Brahms', 'Verdi'}
administradores.remove('Brahms')
administradores.add('Tchaikovsky')
print("Administradores:",administradores)
print("Usuarios:",usuarios)
usuarios_admin=usuarios.intersection(administradores)
print("Usuarios que son admins:", usuarios_admin)

