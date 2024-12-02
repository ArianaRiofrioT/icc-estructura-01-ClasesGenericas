# Proyecto: Ejemplo de Clases Genéricas en Java

Este proyecto muestra cómo implementar **clases genéricas** en Java, proporcionando ejemplos prácticos mediante un contenedor genérico que gestiona distintos tipos de objetos (`Persona` y `Producto`).

## ¿Qué son los Datos y Clases Genéricas?

### Definición de Clases Genéricas

En Java, una **clase genérica** es una clase que utiliza parámetros de tipo (`<T>`) para representar un tipo de dato que se definirá más tarde, cuando se cree una instancia de la clase. Esto permite crear una única implementación que puede funcionar con diferentes tipos de datos sin perder la seguridad de tipo en tiempo de compilación.

**Sintaxis básica**:
```java
public class ClaseGenerica<T> {
    private T elemento;

    public ClaseGenerica(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
}

