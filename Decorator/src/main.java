package Decorator.src;

public class main {
    public static void main(String[] args) {
        componente componente = new ComponenteConcreto(1);
        componente = new DecoradorConcreto(componente);
        componente = new decoradorConcretoB(componente);
        componente.metodoA();
        componente.metodoB();
        componente.metodoC();   
         
    
    }
       
}

