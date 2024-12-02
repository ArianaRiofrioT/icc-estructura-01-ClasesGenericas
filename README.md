# Proyecto: Ejemplo de Clases Genéricas en Java

Este proyecto demuestra cómo usar **clases genéricas** en Java mediante ejemplos prácticos de uso.

## ¿Qué son las clases genéricas?

Una **clase genérica** es una clase que permite manejar múltiples tipos de datos sin necesidad de escribir código específico para cada tipo. Utilizan un **parámetro de tipo genérico** (como `<T>`) que se sustituye con un tipo real al momento de usarla.

Por ejemplo:
```java
ContenedorGenerico<String> contenedorCadena = new ContenedorGenerico<>("Hola, Mundo");
ContenedorGenerico<Integer> contenedorEntero = new ContenedorGenerico<>(123);
