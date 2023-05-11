package Ejercicio1;

public class FactoryElementoB implements ElementFactory{
    public Elemento crearElementoSimple(){
        return new ElementoB();
    }

}
