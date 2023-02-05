# 1
# for n in range(10, 0, -1):
#     print(n)

# 2
# x=0
# for n in range(0, 101,2):
#      print(n+x)
#      x=n

# 3
# x=0
# num=1
# while num!=0:
#     num=int(input("ingrese num:"))
#     x=num+x
# print(x)

# 4
# num=int(input("ingrese num:"))
# longitud=len(str(num))
# print(longitud)

# 5
# es_par=True
# while es_par:
#     num=int(input("Introduce núm:"))
#     es_par=num%2==0

# 6
# x=0
# for n in range(1,101,2):
#     print(n+x)
#     x=n+x

# 7
# anio_desde=int(input("Año Desde:"))
# anio_hasta=int(input("Año Hasta:"))
# for anio in range(anio_desde, anio_hasta+1):
#     if  (anio%4==0 and anio%100 !=0) or (anio%400==0 and anio%4==0):
#         print(anio)

# 8
# corrimiento=int(input("corrimiento:"))
# abc="abcdefghijklmnñopqrstuvwxyz"
# mensaje=(input("Mensaje:"))
# lista=[]
# for i, letra_msj in enumerate(mensaje):
#     for i,letra_abc in enumerate(abc):
#         if letra_msj==letra_abc:
#             print(">>>RESTO<<<:",(i+corrimiento)%27)
#             lista.append((i+corrimiento)%27)

# for numero in lista:
#     for x, letra in enumerate(abc):
#         if numero == x:
#             print(letra)

# 9
# bandera = True
# while bandera:
#     num1 = int(input("Num 1:"))
#     num2 = int(input("Num 2:"))
#     menu = print("1)SUMAR\n2)RESTAR\n3)MULTIPLICAR\n4)SALIR\n")
#     opcion = int(input("Opción:"))

#     if opcion == 1:
#         print(num1+num2,"\n")
#         continue
#     elif opcion == 2:
#         print(num1-num2,"\n")
#     elif opcion == 3:
#         print(num1*num2,"\n")
#     elif opcion == 4:
#         print("Fin del programa")
#         bandera = False
#     else: print("ERROR")

# 10
# DATOS
usuario = str(input("Usuario:"))
password= str(input("Password:"))
repetir_password= str(input("Repetir password:"))

# BOOLEANOS
if (usuario[0] >= '0' and usuario[0] <= '9'):
    print("\n.El 1er caracter no puede ser un número.")

boolean_usuario= len(usuario) > 5
boolean_password= len(password) < 4
boolean_password2= password == repetir_password
print("\n")
# CONDICIONES
if boolean_usuario!=True:
    print(".'Usuario' debe tener más de 5 caracteres.")
if boolean_password != True:
    print(".El 'pass' debe ser menor a 4 caracteres")
if boolean_password2 != True:
    print(".Debe repetir el mismo password")    

