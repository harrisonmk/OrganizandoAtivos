package projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList< String> ativos = new ArrayList<>();

        //Entrada dos tipos de ativos
        int quantidadeAtivos = scan.nextInt();
        String codigoAtivo;

        // Entrada dos códigos dos ativos
        for (int i = 0; i <= quantidadeAtivos; i++) {
            codigoAtivo = scan.nextLine();
            ativos.add(codigoAtivo);
        }

        Collections.sort(ativos);

        for (String p : ativos) {
            System.out.println(p);
        }

    }

}
