import java.io.IOException;
import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        int DIFERENCA = (a * b - c * d);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }

}
