package ParOuImparPack;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int numeroEscolhido = sc.nextInt();

        System.out.println("Você escolheu o número " + numeroEscolhido);

        String isPar = numeroEscolhido % 2 == 0 ? "Este número é par" : "Este número é ímpar";
        System.out.println(isPar);

        sc.close();

    }
}
