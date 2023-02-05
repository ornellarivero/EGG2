palabra=input("Ingrese palabra:")
lista_palabras=[]

while palabra!="":
    palabra_inversa=''.join(reversed(palabra))
    lista_palabras.append(palabra_inversa.upper())
    palabra=input("Ingrese palabra:")
print(lista_palabras)    

