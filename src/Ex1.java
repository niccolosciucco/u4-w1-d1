import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Funzione moltiplica");
        System.out.println("Inserisci il primo numero");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il secondo numero");
        int n2 = Integer.parseInt(scanner.nextLine());

        int risultatoMoltiplica = moltiplica(n1, n2);
        System.out.println("Il risultato del metodo moltiplica è: " + risultatoMoltiplica);

        System.out.println("----------------------------------");

        System.out.println("Funzione concatena");
        System.out.println("Inserisci la stringa");
        String stringa = scanner.nextLine();
        System.out.println("Inserisci il secondo numero");
        n1 = Integer.parseInt(scanner.nextLine());

        String risultatoConcatena = concatena(stringa, n1);
        System.out.println("Il risultato del metodo concatena è: " + risultatoConcatena);

        System.out.println("----------------------------------");

        String[] array = {"ciao", "mi", "chiamo", "Niccolò", "Sciucco"};
        String[] risultatoInserisciInArray = inserisciInArray(array, stringa);
        System.out.println("Il risultato del metodo inserisciInArray è: " + Arrays.toString(risultatoInserisciInArray));

    }

    public static int moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String concatena(String string, int n) {
        String newN = Integer.toString(n);
        return string + newN;
    }

    public static String[] inserisciInArray(String[] array, String stringa) {
        String[] newArray = new String[6];
        newArray[0] = array[0];
        newArray[1] = array[1];
        newArray[2] = array[2];
        newArray[3] = stringa;
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }
}
