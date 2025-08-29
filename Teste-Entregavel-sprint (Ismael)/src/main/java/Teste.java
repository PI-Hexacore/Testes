import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Dia' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss");
        String dataHoraFormatada = dataHora.format(formatter);
        Scanner in = new Scanner(System.in);
            System.out.println("Qual seu nome ?");
            String nome = in.nextLine();
            System.out.println("Qual sua idade ?");
            Integer idade = in.nextInt();
            in.nextLine();
            System.out.println("Qual seu estilo musical preferido ?");
            String musica = in.nextLine();

        if (nome.equals("") || idade.equals(null) || musica.equals("")) System.out.println("Por favor tente novamente preenchendo todos os campos.");
        else System.out.println("O novo usuario " + nome + ", de " + idade + " anos de idade, que seu estilo musical preferido é " + musica + ". foi cadastrado com sucesso no " + dataHoraFormatada);
    }
}
