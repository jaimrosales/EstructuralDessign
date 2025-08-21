package Adapter;

public class itemCAdapter extends item{
    private itemC itemC;

    public itemCAdapter() {
        super();
        System.out.println("itemCAdapter constructor called");
        this.itemC = new itemC();
    }


    @Override
    public void sell() {
        this.itemC.Check();
        System.out.println("itemCAdapter sell method called, and using itemC Check method");
    }

    @Override
    public void access() { 
        this.itemC.delete();
        System.out.println("itemCAdapter access method called, and using itemC delete method");
    }

    @Override
    public void send() {
        this.itemC.Check();
        this.itemC.delete();
        System.out.println("itemCAdapter send method called, and using itemC Check and delete methods");
    }

    
    
    
}
