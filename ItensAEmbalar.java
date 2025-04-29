import java.util.ArrayList;
import java.util.List;

public class ItensAEmbalar {
    private List<ItemASerEmbaladoIF> itens;

    public ItensAEmbalar() {
        this.itens = new ArrayList<>();
    }

    public int adicionaItem(ItemASerEmbaladoIF item) {
        itens.add(item);
        return itens.size();
    }

    public double calculaQtdeTotalEmbalagem() {
        double total = 0;
        for (ItemASerEmbaladoIF item : itens) {
            total += item.calculaQtdeEmbalagem();
        }
        return total;
    }

    public String listaItensAEmbalhar() {
        StringBuilder sb = new StringBuilder();
        for (ItemASerEmbaladoIF item : itens) {
            sb.append(item.getDescricaoEmbalagem()).append("\n");
        }
        return sb.toString();
    }
}
