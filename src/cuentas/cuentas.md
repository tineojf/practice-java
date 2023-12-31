# Clases de cuenta & Subclase Corriente y Ahorro

## Clases y SubClases

Se requiere un programa que modele una cuenta bancaria que posee los
siguientes atributos:

- Nombres del titular.
- Apellidos del titular.
- Número de la cuenta bancaria.
- Tipo de cuenta: puede ser una cuenta de ahorros o una cuenta
  corriente.
- Saldo de la cuenta.

## Métodos

Se debe definir un constructor que inicialice los atributos de la clase.
Cuando se crea una cuenta bancaria, su saldo inicial tiene un valor de cero.
En una determinada cuenta bancaria se puede:

- Imprimir por pantalla los valores de los atributos de una cuenta
  bancaria.
- Consultar el saldo de una cuenta bancaria.
- Consignar un determinado valor en la cuenta bancaria, actualizan-
  do el saldo correspondiente.
  Retirar un determinado valor de la cuenta bancaria, actualizando
  el saldo correspondiente. Es necesario tener en cuenta que no se
  puede realizar el retiro si el valor solicitado supera el saldo actual
  de la cuenta.
- Comparar saldos entre cuentas bancarias. La cuenta para comparar
  es un objeto que se envía como parámetro del método. El método
  devuelve un valor booleano de verdadero si la cuenta actual es
  mayor o igual a la cuenta que se pasó como parámetro.
- Transferir dinero de una cuenta bancaria a otra. El método debe re-
  cibir como parámetro la cuenta de destino y el valor a transferir. El
  saldo de la cuenta actual debe disminuir el valor a transferir y el saldo
  de la cuenta destino debe aumentar. El método debe reutilizar el mé-
  todo retirar para evaluar si la cantidad a transferir se encuentra en la
  cuenta de origen
 