import random

while True:
    # Generar lista de 4 números aleatorios
    numeros = random.sample(range(1, 100), 4)
    print("Lista original:", numeros)

    swapped = True
    while swapped:
        swapped = False
        for i in range(len(numeros) - 1):
            if numeros[i] > numeros[i + 1]:
               
               
                numeros[i], numeros[i + 1] = numeros[i + 1], numeros[i]
                swapped = True

    print("Lista ordenada:", numeros)

    
    opcion = input("¿Quieres generar y ordenar otra lista? (S/N): ")
    if opcion.lower() != "s":
        break
