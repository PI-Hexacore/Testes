//package school.sptech;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.ThreadLocalRandom;
//
//public class Main {
//    public static void main(String[] args) {
//        Boolean erros = false;
//        Integer erroFalso = 0;
//        List<String> RegistrosSucesso = new ArrayList<>();
//        List<String> RegistrosErros = new ArrayList<>();
//        String ANSI_BACKGROUND_RED = "\u001B[41m";
//        for (int i = 0; !erros; i++) {
//            erroFalso = ThreadLocalRandom.current().nextInt(1, 100000);
//            LocalDateTime dataHora = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//            String dataHoraFormatada = dataHora.format(formatter);
//            System.out.print(dataHoraFormatada + " ");
//            String registro = dataHoraFormatada + " " + erroFalso.toString();
//            if (erroFalso.equals(3)){
//                System.err.print(" O dado não foi puxado com sucesso houve um erro!\n");
//                RegistrosErros.add(registro);
//                erros = true;
//            }else{
//                System.out.print(" O dado foi puxado com sucesso! \n");
//                RegistrosSucesso.add(registro);
//            }
//        }
//        erros = true;
//
//    }
//}
package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int erroFalso;
        List<String> registrosSucesso = new ArrayList<>();
        List<String> registrosErros = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        int contador = 0;

        while (true) {
            erroFalso = ThreadLocalRandom.current().nextInt(1, 10);
            LocalDateTime dataHora = LocalDateTime.now();
            String dataHoraFormatada = dataHora.format(formatter);
            String registro = dataHoraFormatada + " " + erroFalso;

            if (erroFalso == 3) {
                System.err.println(dataHoraFormatada + " O dado não foi puxado com sucesso, houve um erro!  --- ( VALOR REGISTRO "+ erroFalso + " ) ---");
                registrosErros.add(registro);

                Thread.sleep(3000);
            } else {
                System.out.println(dataHoraFormatada + " O dado foi puxado com sucesso! --- ( VALOR REGISTRO "+ erroFalso + " ) ---");
                registrosSucesso.add(registro);
            }

            contador++;

            if (contador % 200 == 0) {
                System.out.println("\n===== RELATÓRIO PARCIAL =====");
                System.out.println("Total de registros com sucesso: " + registrosSucesso.size());
                System.out.println("Total de erros encontrados: " + registrosErros.size());
                System.out.println("================================\n");
            }

            Thread.sleep(10                                                                                                     00);
        }
    }
}
