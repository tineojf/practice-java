# Movie Class

## Clases

Clase Película con los siguientes atributos privados:

- Nombre: es el nombre de la película y es de tipo String.
- Director: representa el nombre del director de la película y es de
  tipo String.
- Género: es el género de la película, un tipo enumerado con los
  siguientes valores: ACCIÓN, COMEDIA, DRAMA y SUSPENSO.
- Duración: duración de la película en minutos, esta es de tipo int.
- Año: representa el año de realización de la película.
- Calificación: es la valoración de la película por parte de sus usua-
  rios y es de tipo double.

## Métodos

Métodos get y set para cada atributo y con los derechos de acceso
privados para los set y públicos para los get.

- Un método imprimir público que muestre en pantalla los valores
  de los atributos.
- Un método privado boolean esPeliculaEpica(), el cual devuelve un
  valor verdadero si la duración de la película es mayor o igual a tres
  horas, en caso contrario devuelve falso.
- Un método privado String calcularValoración(), el cual según la ta-
  bla 2.5 devuelve una valoración subjetiva.
  ```text
  [0, 2] Muy mala
  (7, 8] Buena
  (2, 5] Mala
  (5, 7] Regular
  (8, 10] Excelente
  ```
- El método privado boolean esSimilar() compara la película actual
  con otra película que se le pasa como parámetro. Si ambas pelícu-
  las son del mismo género y tienen la misma valoración, devuelve
  verdadero; en caso contrario, devuelve falso.
