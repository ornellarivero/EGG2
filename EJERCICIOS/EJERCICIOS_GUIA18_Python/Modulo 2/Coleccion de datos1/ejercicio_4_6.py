mis_numeros=[]
lista=[]
vacio=False
while vacio==False:
    num=input("Ingrese núm.:")
    if num.isdigit():
        num=int(num)
        lista.append(num)
    else:
        vacio=True

tupla=tuple(lista)
mis_numeros.append(tupla)    
print(mis_numeros)    
