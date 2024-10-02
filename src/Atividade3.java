import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        double nota = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alinhamento: ");
        nota = sc.nextInt ();

                if (nota < 0 || nota > 10) {
                    System.out.println("Valor invalido");
                } else {

                    if (nota >= 6) {
                        System.out.println("Classificação Bom");
                    } else if (nota < 6) {
                        System.out.println("Classificação Ruim");
                    }
                }

    }
}
