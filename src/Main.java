import lista.encadeada.ListaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("test1");
        minhaListaEncadeada.add("test2");
        minhaListaEncadeada.add("test3");
        minhaListaEncadeada.add("test4");

        System.out.println(minhaListaEncadeada.get(2));

    }
}