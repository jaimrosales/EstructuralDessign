package Bridge;
import java.util.ArrayList;

public class Unica  implements Comportamiento {
    private ArrayList<String> lista = new ArrayList<>();


    @Override
    public void addItem(String n) {
        if (!lista.contains(n)) {
            // Only add the item if it is not already in the list
            lista.add(n);
            return;
            
        }
        System.out.println("Item already exists: " + n);
    }

    @Override
    public String getItem(int i) {
       return lista.get(i);
    }

    @Override
    public int getSize() {
        return lista.size();
    }
    
}
