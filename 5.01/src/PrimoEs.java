import java.util.Scanner;

public class PrimoEs {
    Scanner scanner = new Scanner(System.in);


    //3
    String[] elements = {"pasta", "latte", "farina", "zucchero", "frutta"};
    String one = "pane";


    public static String concat(String[] elements, String one) {
        String[] nuova = new String[6];
        nuova[0] = elements[0];
        nuova[1] = elements[1];
        nuova[2] = one;
        nuova[3] = elements[2];
        nuova[4] = elements[3];
        nuova[5] = elements[4];
        return nuova;
    }

    //1
    public static int product(int x, int y) {
        return x * y;
    }

    //2
    public static String conc(String a, String b) {
        return a + b;
    }

};



