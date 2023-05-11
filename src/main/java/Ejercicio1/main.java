package Ejercicio1;
public class main{
    public static void prueba(){
        ElementFactory factoryA = new FactoryElementoA();
        ElementFactory factoryB = new FactoryElementoB();

        Elemento elementoA1 = factoryA.crearElementoSimple();
        Elemento elementoA2 = factoryA.crearElementoSimple();
        Elemento elementoB1 = factoryB.crearElementoSimple();
        Elemento elementoB2 = factoryB.crearElementoSimple();

        Kit kit1 = new Kit();
        kit1.añadirElemento(elementoA1);
        kit1.añadirElemento(elementoA2);

        Kit kit2 = new Kit();
        kit2.añadirElemento(elementoB1);
        kit2.añadirElemento(elementoB2);

        System.out.println("Precio del kit1: " + kit1.getPrecio() + "€  --Código de productos: "+ elementoA1.getCodigo() + " "+ elementoA2.getCodigo());
        System.out.println("Precio del kit2: " + kit2.getPrecio() + "€  --Código de productos: "+ elementoB1.getCodigo() + " "+ elementoB2.getCodigo());
    }
    public static void main(String[] args) {
        prueba();
    }
}
