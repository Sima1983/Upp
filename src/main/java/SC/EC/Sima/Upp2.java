package SC.EC.Sima;

import java.util.Scanner;

public class Upp2 {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Give me a year: ");
        int y;
        y = scanner.nextInt();
        if (y % 4 == 0){
            System.out.println(y + "is leaper");
        }else  {
            System.out.println(y + "is not leaper");

        }
        }
    }

