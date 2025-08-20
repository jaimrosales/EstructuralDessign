package Facade;

public class Facade {
    private A a;
    private B b;
    private C c;

    public Facade() {
        a = new A();
        b = new B();
        c = new C();
    }

    public void realizarImpresion() {
        a.CapturarInfo();
        b.ConocerColor();
        c.CargarHoja();
        c.Imprimir();
    }
}