package Decorator.src;

public class DecoradorConcreto extends decorator {
    

    public DecoradorConcreto(componente componente) {
        super.Decorator(componente);
    }



    



     @Override
    public void metodoA() {
        getComponente().metodoA(); // Call the method from the wrapped component
        System.out.println("DecoradorConcreto: metodoA()  ");
    }

    @Override
    public void metodoB() {
        getComponente().metodoB();
        System.out.println("DecoradorConcreto: metodoB()" );
    }

    @Override
    public void metodoC() {
        getComponente().metodoC();
        System.out.println("DecoradorConcreto: metodoC() " );
    }

    @Override
    public int getValor() {
        return this.getValor(); // Return the value from the wrapped component
    }

    
}
