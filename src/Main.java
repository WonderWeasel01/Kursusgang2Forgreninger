import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*//opgave 1
        System.out.println("Skriv 2 tal");
        Scanner input = new Scanner(System.in);
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
                if (tal1 < tal2)
            System.out.println(tal1 + " er det mindste tal");
            else if (tal1 > tal2)
                System.out.println(tal2 + " er det mindste tal");*/

        /*//Opgave 2
        System.out.println("Skriv 2 tal");
        Scanner input = new Scanner(System.in);
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();

        if (tal1 > tal2)
            System.out.println(tal1 + " er det Højeste tal");
            else if (tal1 < tal2)
                System.out.println(tal2 + " er det Højeste tal tal");*/

        /*//Opgave 3
        System.out.println("Skriv 2 tal");
        Scanner input = new Scanner(System.in);
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();

        if (tal1 < tal2)
            System.out.println(tal1 + " er det laveste tal" + " og tal " + tal2 + " er det Højeste");
        else if (tal1 > tal2)
            System.out.println(tal2 + " er det laveste tal" + " og tal " + tal1 + " er det Højeste");*/

        /*//Opgave 4
        System.out.println("Skriv 3 tal");
        Scanner input = new Scanner(System.in);
        int min = 0;
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
        int tal3 = input.nextInt();


        if (tal1 < tal2) {
            if (tal1 < tal3)
                min = tal1;
            else min =tal3;
        } else if (tal2 < tal1) {
            if (tal2 < tal3)
                min = tal2;
                else min = tal3;
        } else{
                min = tal3;
        }
        System.out.println(min);*/


        /*//opgave 5
        System.out.println("Skriv 3 tal");
        Scanner input = new Scanner(System.in);
        int max = 0;
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
        int tal3 = input.nextInt();


        if (tal1 > tal2) {
            if (tal1 > tal3)
                max = tal1;
            else max = tal3;
        } else if (tal2 > tal1) {
            if (tal2 > tal3)
                max = tal2;
            else max = tal3;
        } else{
            max = tal3;
        }
        System.out.println(max);*/


        //opgave 6



        //Opgave 7


        /*//Opgave 8
        System.out.println("Gæt et nummer fra 1-100");
        int myRandInt = (int)(Math.random()*100+1);
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();

        if (number == myRandInt)
            System.out.println("Yay du gættede det");
        else System.out.println("Det forkert");
        System.out.println("det rigtige tal var " + myRandInt);*/


        //opgave 9
        System.out.println("Hvor meget vejer dit post");
         int weight = in.nextInt();
        System.out.println("----------------------");
        System.out.println("Hvor sendes din post til?");
        System.out.println("[1]Danmark\n[2]Udlandet, Færøerne og Grønland\n[3]Quickbreve");
        System.out.println("----------------------");
        int pris = in.nextInt();

        if (pris == 1) {
            if (weight <= 50) {
                System.out.println("Det bliver 12kr");
            } else if (weight <= 100 && weight > 51) {
                System.out.println("Det bliver 24kr");
            } else if (weight <= 250 && weight > 101) {
                System.out.println("Det bliver 24kr");
            } else if (weight <= 2000 && weight > 251) {
                System.out.println("Det bliver 48kr");
            } else if (weight <= 2001) {
                System.out.println("Det bliver 60kr");
            }
        }
         if (pris == 2){
             if (weight < 50) {
                 System.out.println("Det bliver 36kr");
             } else if (weight <= 100 && weight > 51) {
                 System.out.println("Det bliver 36kr");
             } else if (weight <= 250 && weight > 101) {
                 System.out.println("Det bliver 72kr");
             } else if (weight <= 2000 && weight > 251) {
                 System.out.println("Det bliver 96kr");
             } else if (weight <= 2001) {
                 System.out.println("Det bliver 96kr");
             }
        }
        if (pris == 3){
            if (weight < 100) {
                System.out.println("Det bliver 32kr");
            } else if (weight < 250 && weight > 101) {
                System.out.println("Det bliver 64kr");
            } else if (weight < 251) {
                System.out.println("Det bliver 96kr");
            }
        }
        System.out.println("----------------------");

    }
}


