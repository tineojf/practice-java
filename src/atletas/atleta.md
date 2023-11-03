# Clase Atleta

Enunciado: clase Atleta
Realizar un programa en Java que permita modelar un atleta, el cual tiene
los siguientes atributos de instancia:

## Atributos

- Identificador del atleta de tipo int.
- Nombre del atleta de tipo String.
- Tiempo en realizar una prueba de 400 metros por relevos, de tipo
  double.

Además, se tienen los siguientes atributos estáticos:

- Un contador con la cantidad de atletas creados, el cual servirá
  como identificador de un atleta.
- Un atributo estático denominado selección de tipo String con el
  valor “Colombia”.
- Un atributo estático denominado tiempoEquipo que sume los valo-
  res de tiempo obtenidos por un equipo de atletas.
  Es necesario crear un constructor para la clase con los parámetros:
  nombre y tiempo de cada atleta. En el constructor se debe inicializar el iden-
  tificador del atleta con base en el contador estático.

## Metodos

- Correr 400 metros: este método actualiza el tiempo total de carrera
  del equipo sumando el tiempo de carrera de cada atleta.
- Un método estático que imprima el nombre de la selección de
  atletismo, el cual es un atributo estático.
- Un método estático que imprima el tiempo total obtenido por el
  equipo de atletismo.