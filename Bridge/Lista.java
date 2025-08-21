package Bridge;

public abstract class Lista {
    protected Comportamiento comportamiento;

    public void setComportamiento(Comportamiento c) {
        this.comportamiento = c;
    }
    
    public String getItem(int i) {
        if (i< comportamiento.getSize() && i >= 0) {
            return comportamiento.getItem(i);
        }
        return "Index out of bounds";
            
        
        
    }

    public int getSize() {
        return comportamiento.getSize();
    }

}
