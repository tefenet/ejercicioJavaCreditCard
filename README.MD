las clases ejecutables Ejercicio1 y Ejercicio5 no estan empaquetadas como ejecutables, se corren en el IDE,
ya que estoy usando una librería externa para logging

## ejercicio 1
### crea una clase ejecutable con 3 objetos...
la clase Ejercicio1 es ejecutable, inicialmente tenia una instancia de cada tarjeta, pero luego la adapté para que reciba por parametro
nombre de tarjeta y monto ej.
Ejercicio1 visa 23.45

## ejercicio 2
se levanta en localhost, no pude hostearlo
desde el ide se corre la clase Ejercicio2, o bien se compila con ```mvn clean package```
y luego se ejecuta el .jar generado dentro de la carpeta target con ```java -jar eldar-1.0-SNAPSHOT.jar```
está compilado para java 17
recibe parametros del get en el body formato json url /tasa, ejemplo http://localhost:8080/tasa
body {"marca":"visa","monto":1000}
las marcas disponibles son visa, nara o amex. si se ingresa otra marca lanza una excepcion.

## ejercicio 3 PL/SQL

La consulta **trae los primeros 10** nombres de la tabla de empleados y los imprime utilizando DBMS_OUTPUT.PUT_LINE.  
Si hubiera menos de 10 registros en la tabla, imprimirá solo los que estén disponibles.  
Si se desea imprimir más de 10 registros, debe modificarse el límite LIMIT en la instrucción FETCH o eliminarlo.  
  
## ejercicio 4 PL/SQL
  
sin la instruccion RETURN en el cuerpo de la funcion, la misma no puede devolver ningún valor y, por lo tanto, **no compilará correctamente**  
En PL/SQL, la diferencia principal entre un procedimiento y una función radica en que una función siempre debe devolver un valor,  
mientras que un procedimiento puede no devolver ningún valor en absoluto.  

## ejercicio 5

la clase Ejercicio5 tiene el script para resolver lo solicitado, recibe la lista de palabras por parametro
y la convierte al array inicial del problema ej.
Ejercicio5 "word come as you are and etc"