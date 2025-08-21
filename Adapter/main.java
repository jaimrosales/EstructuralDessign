package Adapter;

public class main {
    private static item item;
    public static void main(String[] args) {

        itemA itemA = new itemA(); //ejemplo de 
        itemB itemB = new itemB(); 
        //Esta seria la forma correcta de instanciar los objetos con el Adapter
        item = new itemCAdapter(); 
        item = new itemB();
        item = new itemA();
        
        itemA.access();
        itemB.access();
        item.access();



    }
}
