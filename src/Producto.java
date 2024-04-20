public abstract class Producto implements MetodosProductos{
    private String nombre, modelo, descripcion;
    private float precio;
    private char tipoProducto;

    //Constructores
    public Producto(String nombre, String modelo, String descripcion, float precio, char tipoProducto) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
    }

    public Producto() {}

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public char getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(char tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
