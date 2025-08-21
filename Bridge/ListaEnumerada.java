package Bridge;

public class ListaEnumerada  extends Lista {
    @Override
    public String getItem(int i) {
        if (i < super.getSize() && i >= 0) {
            return (i + 1) + "- " + super.getItem(i);
        }
        return "Index out of bounds";
    }
}
