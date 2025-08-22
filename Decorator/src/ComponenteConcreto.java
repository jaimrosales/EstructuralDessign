package Decorator.src;

public class ComponenteConcreto implements componente {
    
    private int valor = 10;

    public ComponenteConcreto(int valor) {
        this.valor = valor;
    }

    @Override
    public void metodoA() {
        System.out.println("Método A componente concreto");
    }

    @Override
    public void metodoB() {
        System.out.println("Método B componente concreto");
    }

    @Override
    public void metodoC() {
        System.out.println("Método C componente concreto");
    }

    @Override
    public int getValor() {
        return this.valor;
    }
    
}
