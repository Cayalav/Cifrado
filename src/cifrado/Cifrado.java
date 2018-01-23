package cifrado;

import java.util.Scanner;

public class Cifrado {

    public static void main(String[] args) {
        int k;
        String word;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Cifrador");
        System.out.println("");
        System.out.println("Digite palabra a encriptar");
        word = sc.next();
        System.out.println("Digite el valor de K (1-28)");
        k = sc.nextInt();
        if (k > 28 || k < 1) {
            System.out.println("El numero se sale del intervalo, intene nuevamente");
            System.out.println("Digite el valor de K (1-28)");
            k = sc.nextInt();
        }

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word(i));
        }

        System.out.println("Su palabra encriptada con K = " + k + " es:");

    }

}
