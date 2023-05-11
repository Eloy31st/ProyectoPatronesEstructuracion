package Elementos;

public abstract class Elemento {
    double precio;
    String codigo;

    public double getPrecio() {
        return precio;
    }
    public void crear(){

    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
