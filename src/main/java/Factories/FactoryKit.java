package Factories;


import Elementos.Elemento;

public interface FactoryKit {

    public void añadirElemento(Elemento elemento);
    public void eliminarElemento(Elemento elemento);
    public double getPrecio();


}
