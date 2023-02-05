nombre=input("Nombre:").title()
edad=int(input("Edad:"))
direccion=input("Dirección:").title()
tel=int(input("Tel:"))

agenda={"nombre":nombre, "edad":edad, "dirección":direccion, "tel":tel}

print(agenda["nombre"], "tiene", agenda["edad"],"años, vive en", agenda["dirección"],"y su tel. es",agenda["tel"])

