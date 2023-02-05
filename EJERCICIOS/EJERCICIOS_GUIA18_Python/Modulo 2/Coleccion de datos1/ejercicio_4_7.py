matriz = [
[1, 5, 1],
[2, 1, 2],
[3, 0, 1],
[1, 4, 4],
]

cont=0
for i in enumerate(matriz):
    matriz[cont].append(matriz[cont][0]+matriz[cont][1]+matriz[cont][2])
    cont=cont+1
    
print(matriz)    

