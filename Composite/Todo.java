package Composite;

import java.util.ArrayList;

public class Todo implements ItemProject {
    private String name;
    private String responsable;
    private ArrayList<ItemProject> children;


    public Todo(String n, String r) {
        this.name = n;
        this.responsable = r;
        this.children = new ArrayList<ItemProject>();

    }

    @Override
    public void AddItemProject(ItemProject ip) {
        children.add(ip);
    }

    @Override
    public void imprimir() {
        System.out.println("ToDo: " + name + " Responsable: " + responsable);
        for (ItemProject ip : children) {
            System.out.print("\t\t ");
            ip.imprimir();
        }
        
    }
    
}
