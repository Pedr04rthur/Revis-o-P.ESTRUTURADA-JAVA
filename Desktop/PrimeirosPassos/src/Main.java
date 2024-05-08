import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stringView();
        stringFrase();
    }

    private static void stringView() {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();

        if (frase.contains("segunda feira")) {
            if (frase.contains("seis da tarde")) {
                System.out.println("dia de alegriaaaaa");
            } else {
                System.out.println("dia mundial da preguiça");
            }

        } else if (
                frase.contains("sexta feira")
                        ||
                        frase.contains("sábado")
                        ||
                        frase.contains("domingo")
        ) {

            System.out.println("dia de alegria");
        } else {
            System.out.println("Dias normais...");
        }
    }

    private static void stringFrase() {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        if (texto.startsWith("a")){
            System.out.println("Seu texto começou com a letra a");
        }else if (texto.startsWith("b")) {
            System.out.println("Seu texto começou com a letra b");
        }
    }
}




