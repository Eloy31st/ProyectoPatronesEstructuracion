package Kit;

import Elementos.Elemento;
import Factories.FactoryKit;

import java.util.ArrayList;

public class Kit implements FactoryKit {
    private ArrayList<Elemento> elementos;

    public Kit(){
        elementos = new ArrayList<>();
    }
    public void añadirElemento(Elemento elemento){
        elementos.add(elemento);
    }
    public void eliminarElemento(Elemento elemento){
        elementos.remove(elemento);
    }

    public double getPrecio(){
        double precio = 0;
        for(Elemento elemento : elementos){
            precio += elemento.getPrecio();
        }
        return precio * 0.9;
    }


}
