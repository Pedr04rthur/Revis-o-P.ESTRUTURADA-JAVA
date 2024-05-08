import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        // Obtendo a data atual do sistema
        Date dataAtual = new Date();

        // Criando um objeto SimpleDateFormat para formatar datas
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Exibindo a data atual
        System.out.println("Data atual: " + dateFormat.format(dataAtual));

        // Usando o Scanner para obter uma data inserida pelo usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma data (formato dd/MM/yyyy):");
        String dataInserida = scanner.nextLine();

        try {
            // Convertendo a data inserida para um objeto Date
            Date dataUsuario = dateFormat.parse(dataInserida);

            // Comparando as datas
            if (dataUsuario.after(dataAtual)) {
                System.out.println("Esse dia ainda está por vir.");
            } else if (dataUsuario.before(dataAtual)) {
                System.out.println("Essa data já passou.");
            } else {
                System.out.println("Você digitou a data de hoje!");
            }
        } catch (java.text.ParseException e) {
            System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
        }

        // Fechando o Scanner
        scanner.close();
    }
}



