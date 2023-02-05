numeros_validos = [1, 3, 6, 9]
cont=0
esta=0
while cont<4:
    num=int(input("Ingrese num. entre 0 y 9:"))
    if num >=0 and num <= 9:
        for i, elemento in enumerate(numeros_validos):
            if num==numeros_validos[i]:
                esta=esta+1 
    else:
        print("El núm no está entre 0 y 9")
        break            
    if esta==1:
        print("El núm está.\n")
    else: 
        print("El núm. no está.\n")  
    esta=0                  
    cont=cont+1 

                 
