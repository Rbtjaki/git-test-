package pl.r_jaroslawski.workshops.random_numbers;
import java.util.Random;
import java.util.Scanner;

public class LOTTO {

    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        Random los = new Random();

        System.out.print("Podaj 6 liczb z zakresu 1 - 49, bo tylko takie moga wygra�: ");

        final int z = 49;
        int[] user = new int[6];
        int[] lotto = new int[6];
        int[] zakres = new int[z];
        int num = 0;
        int n = 0;

        for (int i = 0; i < z; i++) {
            zakres[i] = n++;
        }

       for (int j = 0; j < 6; j++) {
           user[j] = skan.nextInt();

          }
        for (int i = 0; i < 6; i++) {
            int x = los.nextInt(50);
            for (int j = 0; j < 49 - 1; j++) {
                if (x == i + 1 && x == 0) {
                    zakres[i] = -1;
                }
            }lotto[i] = x;

            System.out.print(lotto[i] + " ");
        }
        int check = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (user[i] == lotto[j]) {
                    check++;
                }
            }
        }
        if (check <= 3) {
            System.out.print("Przegra�e�");
        } else if (check == 3) {
            System.out.print("Trafi�e� 3");
        } else if (check == 4) {
            System.out.print("Trafi�e� 4");
        } else if (check == 5) {
            System.out.print("Trafi�e� 5");
        } else {
            System.out.print("Trafi�e� 6");
        }
        skan.close();
    }
}

        for (int i = 0; i < x; i++){

            num[i] = los.nextInt(y + 1) + 1;
            num[i]= num[i] + z;
            }return num;

    } private static boolean sprawdzDane(String dane){

        return (isDigit(dane.charAt(0)) && isDigit(dane.charAt(2)) && isDigit(dane.charAt(dane.length() - 1)));
    }
}