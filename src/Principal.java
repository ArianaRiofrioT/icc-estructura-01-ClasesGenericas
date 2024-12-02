// src/Principal.java
public class Principal implements Escape {
    public static void main(String[] args) {
        // Contenedor genérico para una persona
        ContenedorGenerico<Persona> contenedorPersona = new ContenedorGenerico<>(new Persona( "Alicia",  30));
        System.out.println(contenedorPersona);

        // Contenedor genérico para un producto
        ContenedorGenerico<Producto> contenedorProducto = new ContenedorGenerico<>(new Producto("Portátil", 1200.99));
        System.out.println(contenedorProducto);

        // Cambiando el contenido del contenedor
        contenedorPersona.setElemento(new Persona( "Roberto" , 25));
        System.out.println("Actualizado:  " +  contenedorPersona);
    }
}
