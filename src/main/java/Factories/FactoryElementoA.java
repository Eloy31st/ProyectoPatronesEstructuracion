package Factories;

import Elementos.Elemento;
import Elementos.ElementoA;

public class FactoryElementoA implements ElementFactory{
    public Elemento crearElementoSimple(){
        return new ElementoA();
    }

}
