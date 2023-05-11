package Ejercicio1;

public class ElementoB extends Elemento{
    private double precio;
    private String codigo;

    public ElementoB() {
        crear();
    }

    @Override
    public void crear(){
        setPrecio(25);
        setCodigo("BB");
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }

    @Override
    public String getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(String codigo) {
        super.setCodigo(codigo);
    }

}
