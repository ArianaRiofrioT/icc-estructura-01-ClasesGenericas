
public class ContenedorGenerico<T> {
    private T elemento;

    public ContenedorGenerico(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "ContenedorGenerico{" +
                "elemento=" + elemento +
                '}';
    }
}
