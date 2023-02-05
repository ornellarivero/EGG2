lista_1 = [1, 12, 123]
lista_2 = ["Bye", "Ciao", "Agur", "Adieu"]

print("Lista 1:")
lista_1.append(1234)
print(lista_1)
lista_1.append("Hola")
print(lista_1)

print("\nLista 2:")
lista_2.append( "Adios")
print(lista_2)
lista_2.append(1234)
print(lista_2)

lista_1.pop(len(lista_1)-1)
lista_3=lista_1
print("\nLista 3:\n",lista_3)

lista_2.pop(0)
lista_2.pop(len(lista_2)-1)

lista_4=lista_2
print("\nLista 4:\n",lista_4)

lista_5=[* lista_4, * lista_3]
print("\nLista 5:\n",lista_5)
