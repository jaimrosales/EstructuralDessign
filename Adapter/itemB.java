package Adapter;

public class itemB extends item {
    public itemB() {
        // Constructor logic if needed
        super();
        System.out.println("Item B created");
    }

    @Override
    public void sell() {
        // Implementation of sell for itemB
        System.out.println("Item B sold");
    }

    @Override
    public void access() {
        // Implementation of access for itemB
        System.out.println("Accessing Item B");
    }

    @Override
    public void send() {
        // Implementation of send for itemB
        System.out.println("Sending Item B");
    }
    
}
