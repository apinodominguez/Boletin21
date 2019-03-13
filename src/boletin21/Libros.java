package boletin21;

public class Libros {
    private String nombre;
    private String titulo;
    private String ISBN;
    private int precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String nombre, String titulo, String ISBN, int precio, int unidades) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.precio = precio;
        this.unidades = unidades;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", titulo=" + titulo + ", ISBN=" + ISBN + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
    
    
    
    
}
