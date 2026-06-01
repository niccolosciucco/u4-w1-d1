import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String primaStringa = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String secondaStringa = scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
        String terzaStringa = scanner.nextLine();

        String ordine = inOrdine(primaStringa, secondaStringa, terzaStringa);
        System.out.println("Stringhe in ordine: " + ordine);
        String contrario = inverso(primaStringa, secondaStringa, terzaStringa);
        System.out.println("Stringhe al contrario: " + contrario);
    }

    public static String inOrdine(String primaStringa, String secondaStringa, String terzaStringa) {
        return primaStringa + secondaStringa + terzaStringa;
    }

    public static String inverso(String primaStringa, String secondaStringa, String terzaStringa) {
        return terzaStringa + secondaStringa + primaStringa;
    }
}
