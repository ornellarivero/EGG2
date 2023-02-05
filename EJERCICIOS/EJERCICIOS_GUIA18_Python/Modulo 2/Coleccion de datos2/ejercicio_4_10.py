import pprint

articulos = {"articulo": {}}
while True:
    respuesta = input("Agragar artículo? s/n:").lower()
    if respuesta == "n":
        break
    else:
        codigo = int(input("Código:"))
        nombre = input("Nombre:")
        precio = float(input("Precio:"))
        stock = int(input("Stock:"))

        datos = {"nombre": nombre, "precio": precio, "stock": stock}
        articulos["articulo"][codigo] = datos

        print(articulos)

        compra = {"articulo": [], "total": 0}

        while True:
            respuesta = input("Desea comprar? s/n:")
            if respuesta == "s":
                codigo = int(input("Ingrese código de producto:"))
                if codigo not in articulos["articulo"]:
                    print("El producto no existe")
                    print(articulos)
                else:
                     nombre = articulos["articulo"][codigo]["nombre"]
                     precio = articulos["articulo"][codigo]["precio"]
                     stock = articulos["articulo"][codigo]["stock"]
                     if stock > 0:
                        cantidad = int(
                            input("Cuánto llevará?: (máximo {stock}):"))
                        articulos["articulo"][codigo]["stock"] -= cantidad
                        compra["articulo"].append(
                            {"nombre": nombre, "precio": precio})
                        compra["total"] += precio*cantidad
                        print("SU COMPRA:")
                        print(compra)
                     else:
                        input("no hay suficiente stock.")
                        print(articulos)    
            elif respuesta == "n":
                break        
