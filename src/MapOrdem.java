import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapOrdem {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória:");

        Map<String, Livro> meusLivros = new HashMap<>();
        meusLivros.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 238));
        meusLivros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem de inserção:");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>();

        meusLivros1.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 238));
        meusLivros1.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros1.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        for (Map.Entry<String, Livro> livro1 : meusLivros1.entrySet())
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());

        System.out.println("Ordem alfabética autores:");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro2 : meusLivros2.entrySet())
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());

        System.out.println("Ordem alfabética nomes dos livros:");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro1 : meusLivros3)
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());

        System.out.println("Ordem de numeros:");
        Set<Map.Entry<String, Livro>> livrosOrdenadosPorPaginas = new TreeSet<>(new ComparadorPaginas());
        livrosOrdenadosPorPaginas.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> entrada : livrosOrdenadosPorPaginas) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue().getNome() + " - "
                    + entrada.getValue().getPaginas());
        }

    }

}
