package Decorator.src;

public abstract class decorator implements componente {
    private componente componente;
    
    public void Decorator(componente componente) {  // Constructor to initialize the component
        this.componente = componente;
    }

    public componente getComponente() {
        return componente;
    }
    // Implementing methods from the componente interface, Los que se quieran
    public void metodoq() {
        System.out.println("Metodo extra del decorador concreto");
    }
}
