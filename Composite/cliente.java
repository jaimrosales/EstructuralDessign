package Composite;

public class cliente {
    public static void main(String[] args) {
        new cliente();
    }

    public cliente() {
        create();
    }

    public void create(){
        Project mercado = new Project("Compra de mercado");
        Project plaza = new Project("Plaza de mercado");
        Project supermercado = new Project("Supermercado");
        Project carniceria = new Project("Carniceria");

        addPlaza(plaza);
        mercado.AddItemProject(plaza);
        addSupermercado(supermercado);
        mercado.AddItemProject(supermercado);
        addCarniceria(carniceria);
        mercado.AddItemProject(carniceria);
        mercado.imprimir();

    }

    public void addPlaza(Project p){
        Todo tomate = new Todo("Tomate", "Jaim");
        Todo cebolla = new Todo("Cebolla", "Jaim");
        Todo lechuga = new Todo("Lechuga", "Jaim");
        
        p.AddItemProject(tomate);
        p.AddItemProject(cebolla);
        p.AddItemProject(lechuga);
    }
    public void addSupermercado(Project p){
        Todo arroz = new Todo("Arroz", "ricardo");
        Todo aceite = new Todo("Aceite", "ricardo");
        Todo Sal = new Todo("Sal", "ricardo");
        Todo SalRefinada = new Todo("Sal refinada", "ricardo");
        Todo LaFina = new Todo("La Fina", "ricardo");
        
        Sal.AddItemProject(SalRefinada);    //aqui un ejemplo de anadir una sub-tarea a una tarea
        SalRefinada.AddItemProject(LaFina);
        
        p.AddItemProject(arroz);
        p.AddItemProject(aceite);
        p.AddItemProject(Sal);
    }
    public void addCarniceria(Project p){
        Todo pollo = new Todo("Pollo", "hannia");
        Todo carne = new Todo("Carne", "hannia");
        Todo cerdo = new Todo("Cerdo", "hannia");
     
        p.AddItemProject(pollo);
        p.AddItemProject(carne);
        p.AddItemProject(cerdo);
    }
    

}
