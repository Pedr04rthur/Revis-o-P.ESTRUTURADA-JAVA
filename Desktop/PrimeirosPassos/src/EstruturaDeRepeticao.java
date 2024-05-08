import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        ListaDePalavras();
        forClassico();
        forIvertendo();
        //palavras.forEach(palavra -> palavra.length());
    }

    private static void ListaDePalavras() {
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Açúcar");
        palavras.add("Café");
        palavras.add("Queijo");
        palavras.add("Pão");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
    private static void forClassico() {
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Açúcar");
        palavras.add("Café");
        palavras.add("Queijo");
        palavras.add("Pão");

        for(int posicao = 0; posicao<palavras.size(); posicao++){
            System.out.println(palavras.get(posicao));
        }
    }
    private static void forIvertendo() {
        String normal = "12345678";

        String invertida = "";

        for(int posicao = normal.length() - 1; posicao >= 0; posicao -- ){
            invertida = invertida + normal.charAt(posicao);
            System.out.println(invertida);
        }
//        repetição e decisão juntos
        }
}
