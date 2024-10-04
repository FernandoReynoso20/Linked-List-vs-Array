# Linked-List-vs-Array

Ejercicio #1

El primer programa es el encargado de tomar un arreglo proporcionado por el usuario y desplazar hacia la derecha dependiendo del valor de t, tanto la primera mitad como la segunda. La cantidad de elementos en el arreglo siempre debe ser par; cuando el usuario ingresa el valor de t, el programa va iterando la primera mitad si el conteo para t es impar o itera la segunda mitad si t es par. Un ejemplo para aclarar el funcionamiento de t seria: Para t = 3, el programa va a iterar 3 veces, ordenando la primera mitad 2 veces (cuando t = 1 y t = 3) y la segunda mitad 1 vez (solo para t = 2).

Para empezar a compilar el programa, el usuario primero debe ingresar el valor para la cantidad de posiciones del arreglo:

Ingrese la cantidad de datos que se van a agregar en la secuencia: 
8

Luego, el programa pide que el usuario ingrese la secuencia deseada, separando por espacios cada elemento:

Ingrese la secuencia de datos (Separados por espacios): 
A B C D E F G H

Por ultimo, el programa pide que se digite el valor para t, para que se conozca la cantidad de iteraciones que se van a hacer:

Ingrese el valor de T: 
3

Siguiendo estos pasos, el programa ejecutara de manera efectiva el ordenamiento y proceso deseado.


Ejemplos:

Entrada:
Ingrese la cantidad de datos que se van a agregar en la secuencia: 
8

Ingrese la secuencia de datos (Separados por espacios): 
A B C D E F G H

Ingrese el valor de T: 
3

Salida:
C D A B H E F G


Entrada:
Ingrese la cantidad de datos que se van a agregar en la secuencia: 
8

Ingrese la secuencia de datos (Separados por espacios): 
df 23 45 34 33 h 5 2

Ingrese el valor de T: 
4

Salida:
45 34 df 23 5 2 33 h

El rendimiento del programa depende linealmente de dos factores: el número de elementos en la secuencia (n) y el número de iteraciones (T). Cada iteración implica una operación de rotación que recorre aproximadamente la mitad del arreglo, lo que toma tiempo O(n), y este se repite t veces.

Ejercicio #2

Este programa permite generar una lista de estudiantes con valores aleatorios para matrícula e índice académico. Luego, utiliza el algoritmo de ordenamiento burbuja para ordenar la lista en función del índice académico en orden ascendente o descendente, según lo indicado por el usuario.

El programa solicita la cantidad de estudiantes a generar, depueés genera los datos aleatoriamente (nombre, matrícula e índice académico), y después pregunta al usuario si desea ordenar los estudiantes de forma ascendente o descendente según el índice académico.


