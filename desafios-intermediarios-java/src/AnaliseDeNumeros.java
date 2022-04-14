import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) throws IOException {
        String linha;
        int Pos, Neg, Par, Impar, num;

        Pos = Neg = Par = Impar = 0;
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            linha = leitor.nextLine();
            num = Integer.parseInt(linha);

            if (num % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }

            if (num > 0) Pos++;
            if (num < 0) Neg++;
        }

        System.out.println("" + Par +" par(es)");
        System.out.println("" + Impar + " impar(es)");
        System.out.println("" + Pos + " positivo(s)");
        System.out.println("" + Neg + " negativo(s)");
    }
}
