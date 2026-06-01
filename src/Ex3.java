import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo");
        float base = Float.parseFloat(scanner.nextLine());
        System.out.println("Inserisci l'altezza del rettangolo");
        float altezza = Float.parseFloat(scanner.nextLine());

        float perimetro = perimetroRettangolo(base, altezza);
        System.out.println("Il perimetro è " + perimetro);

        System.out.println("--------------------");

        System.out.println("Inserisci un numero");
        int n = Integer.parseInt(scanner.nextLine());
        int resultPariDispari = pariDispari(n);

        if (resultPariDispari == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }

        System.out.println("--------------------");
        float resulAreaTriangolo = areaTriangolo(base, altezza);
        System.out.println("L'area del triangolo è: " + resulAreaTriangolo);

    }

    public static float perimetroRettangolo(float base, float altezza) {
        return (base + altezza) * 2;
    }

    public static int pariDispari(int n) {
        if (n % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static float areaTriangolo(float base, float altezza) {
        return (base * altezza) / 2;
    }
}
