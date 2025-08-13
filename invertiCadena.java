import java.util.Scanner;

public class VocalesConsonante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        int vocales = 0, consonantes = 0;

        for (char c : palabra.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);

        sc.close();
    }
}
