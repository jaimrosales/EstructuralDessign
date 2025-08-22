package Composite;

import java.util.ArrayList;



public class Project implements ItemProject {

    private String name;
    private ArrayList<ItemProject> children;

    public Project(String n) {
        this.name = n;
        this.children = new ArrayList<ItemProject>();
    }

    @Override
    public void AddItemProject(ItemProject ip) {
        children.add(ip);
    }

    
    @Override
    public void imprimir() {
        System.out.println("Project: " + name);
        for (ItemProject ip : children) {
            System.out.print("\t ");
            ip.imprimir();
        }
        
    }
    
}
