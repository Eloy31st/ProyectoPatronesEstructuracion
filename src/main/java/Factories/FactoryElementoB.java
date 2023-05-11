package Factories;

import Elementos.Elemento;
import Elementos.ElementoB;

public class FactoryElementoB implements ElementFactory{
    public Elemento crearElementoSimple(){
        return new ElementoB();
    }

}
