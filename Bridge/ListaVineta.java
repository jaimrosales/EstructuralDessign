package Bridge;

public class ListaVineta extends Lista {
    @Override
    public String getItem(int i) {
        if (i < super.getSize() && i >= 0) {
            return "• " + super.getItem(i);
        }
        return "Index out of bounds";
    }
}
