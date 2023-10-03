import math

a = int(input('Introduce el numero de elementos: '))
b = int(input('Introduce la agrupacion: '))

resultado = math.comb(a,b)

print(f'El resultado la combinatoria de {a} y {b} es {resultado}')