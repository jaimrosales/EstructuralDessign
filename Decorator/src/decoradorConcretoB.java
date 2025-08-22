package Decorator.src;

public class decoradorConcretoB extends decorator {

    public decoradorConcretoB(componente componente) { // Constructor to initialize the component
        super.Decorator(componente);
    }

    @Override
    public void metodoA() {
        getComponente().metodoA(); // Call the method from the wrapped component
        System.out.println("DecoradorConcretoB: metodoA()  ");
    }

    @Override
    public void metodoB() {
        getComponente().metodoB();
        System.out.println("DecoradorConcretoB: metodoB()" );
    }

    @Override
    public void metodoC() {
        getComponente().metodoC();
        System.out.println("DecoradorConcretoB: metodoC() " );
    }

    @Override
    public int getValor() {
        return this.getValor(); // Return the value from the wrapped component
    }
    
    public void metodoExtra() {
        System.out.println("Metodo extra del decorador concreto B");
    }
    
}
