package Ejercicio1;

public class FactoryElementoA implements ElementFactory{
    public Elemento crearElementoSimple(){
        return new ElementoA();
    }

}
