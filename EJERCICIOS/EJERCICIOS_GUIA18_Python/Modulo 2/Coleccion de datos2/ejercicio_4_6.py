lista_1 = ["h", "o", "r", "o", " ", "s", "o", "l", "a"]
lista_2 = ["h", "o", "l", "a", " ", "l", "u", "n", "a"]
letras = []
lista_3 = []

letras.extend(lista_1)
letras.extend(lista_2)
letras.remove(' ')

for elemento in letras:
    if letras.count(elemento) > 1 and elemento not in lista_3:
        lista_3.append(elemento)

print(lista_3)
