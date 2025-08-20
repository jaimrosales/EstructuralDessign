package Adapter;

public class itemA extends item{
    public itemA() {
        // Constructor logic if needed
        super();
        System.out.println("Item A created");
    }

    @Override
    public void sell() {
        // Implementation of sell for itemA
        System.out.println("Item A sold");
    }

    @Override
    public void access() {
        // Implementation of access for itemA
        System.out.println("Accessing Item A");
    }

    @Override
    public void send() {
        // Implementation of send for itemA
        System.out.println("Sending Item A");
    }
    
}
