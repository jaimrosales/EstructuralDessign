package Bridge;

public class cliente {
    public static void main(String[] args) {
        Comportamiento comportamiento = new Unica(); // Puede ser cambiada a Repetida para probar comportamiento
        comportamiento.addItem("Jaime");
        comportamiento.addItem("Ricardo"); 
        comportamiento.addItem("Emiliano"); 
        comportamiento.addItem("Hannia"); 
        comportamiento.addItem("Hannia"); 

        Lista listaBase = new ListaBase();
        Lista listaEnumerada = new ListaEnumerada();
        Lista listaVineta = new ListaVineta();

       
        listaBase.setComportamiento(comportamiento);
        listaEnumerada.setComportamiento(comportamiento);
        listaVineta.setComportamiento(comportamiento);

        System.out.println("base");
        for (int i = 0; i < comportamiento.getSize(); i++) {
            System.out.println("Lista Base: " + listaBase.getItem(i));
        }

        System.out.println("enumerada");
        for (int i = 0; i < comportamiento.getSize(); i++) {
            System.out.println("Lista Enumerada: " + listaEnumerada.getItem(i));
        }

        System.out.println("vinetas ");
        for (int i = 0; i < comportamiento.getSize(); i++) {
            System.out.println("Lista Vineta: " + listaVineta.getItem(i));
        }
    }
}
