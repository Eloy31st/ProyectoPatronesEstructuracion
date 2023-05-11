package Elementos;

public class ElementoA extends Elemento{
    private double precio;
    private String codigo;

    public ElementoA() {
        crear();
    }

    @Override
    public void crear(){
        setPrecio(70);
        setCodigo("AA");
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
