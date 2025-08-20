package Facade;

public class Cliente {
    public static void main(String[] args) {
        new Cliente();
    }

    public Cliente() {
        Facade facade = new Facade();
        facade.realizarImpresion();
    }
}

