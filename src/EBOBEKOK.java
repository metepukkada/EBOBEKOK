import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        int n1, n2;
        int sortedn1, sortedn2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        n1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = scanner.nextInt();

        if (n1 < n2) {
            sortedn1 = n2;
            sortedn2 = n1;

        } else {
            sortedn1 = n1;
            sortedn2 = n2;
        }
        int i = sortedn2;
        int ebob = 1;
        while (i != 0) {
            if (sortedn1 % i == 0 && sortedn2 % i == 0) {
                ebob = i;
                break;
            } else {
                i--;
            }
        }
        i = ebob;

        int ekok;
        ekok = (sortedn1 * sortedn2) / ebob;
        System.out.println("EBOB: " + ebob + " " + "Ekok: " + ekok);
    }
}





