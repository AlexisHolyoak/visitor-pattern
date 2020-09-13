
[TOC]


# Behavioral Design Patterns- Visitor Pattern
El libro Gang of Four define el patrón Visitor Pattern como:
"Represents an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates."

Nos permite separar los algoritmos de la estructura del objeto.
- Se tiene un objeto con una estructura definida (posee elementos).
- Conjunto de algoritmos aplicados a los elementos del objeto; que no modifican o afectan al objeto o sus elementos.

Veamos el diagrama de clases del patrón:

![](https://static.dzone.com/dz1/dz-files/visitor_pattern.png)

### Cuando usar el patrón Visitor:
- La estructura del objeto no cambia con frecuencia, pero sí podrían las operaciones que definen su comportamiento.
- Se tiene una funcionalidad específica para cada elemento de la clase y desea encapsularla.
- La operación requiere datos que el objeto no conoce.
- Desea mantener el estado dentro de las operaciones en múltiples objetos.

