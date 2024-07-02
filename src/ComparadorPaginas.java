
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparadorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        Livro livro1 = o1.getValue();
        Livro livro2 = o2.getValue();
        return Integer.compare(livro1.getPaginas(), livro2.getPaginas());
    }

}
