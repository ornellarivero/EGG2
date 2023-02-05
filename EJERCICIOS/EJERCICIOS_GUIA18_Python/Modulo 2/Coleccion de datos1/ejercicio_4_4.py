agregar_tarea="s"
coleccion_tareas=set()
cantidad_tareas=int(input("Cuántas tareas agregará?:"))
cont=0
while cont<cantidad_tareas:
    cont=cont+1
    tarea=input("Tarea:")
    coleccion_tareas.add(tarea)
print(sorted(coleccion_tareas))    