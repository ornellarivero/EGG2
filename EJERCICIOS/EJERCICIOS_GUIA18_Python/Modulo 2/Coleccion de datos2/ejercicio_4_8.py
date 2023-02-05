diccionario={"Euro": "€", "Dólar": "$", "Yen": "¥"}

simbolo_moneda=input("Introduzca una moneda para ver su símbolo:").title()

if simbolo_moneda in diccionario:
    print(diccionario[simbolo_moneda])
else:
    print("Esa moneda no está registrada")    