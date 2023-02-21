import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int nr1;
        int nr2;
        int upperBound = 100;
        int k;
        int upperBound2 = 5;
        int theReturn;
        int aux;
        Random number = new Random();
        nr1 = number.nextInt(upperBound);
        nr2 = number.nextInt(upperBound);
        k = number.nextInt(upperBound2);

        if (k == 0) {
            System.out.println("the k is 0 and there are no possible cases");
            return;
        }

        if (nr1 > nr2) {
            aux = nr1;
            nr1 = nr2;
            nr2 = aux;

        }

        System.out.println("the first number is " + nr1);
        System.out.println("the second number is " + nr2);
        System.out.println("the k is  " + k);

        theReturn = kpn(nr1, nr2, k);

        if (theReturn == -1) {
            System.out.println("there arent enough p-numbers");
            return;
        }
        System.out.println("the p-number on position k is " + theReturn);

    }


    /*public static int kpn(int a, int b, int k) {

        int pNumberCounter = 0;
        int divSum = 0;
        for (int i = a; i <= b; i++) {
            divSum=0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    divSum += j;
                }
            }
            if (divSum % 2 == i % 2) {
                pNumberCounter++;
            }
            if (pNumberCounter == k) {
                return i;
            }
        }
        return -1;
    }*/


    public static int kpn(int a, int b, int k) {
        int pNumberCounter = 0;
        int divSum = 0;
        for (int i = a; i <= b; i++) {

            divSum = getDivSum(i);

            if (divSum % 2 == i % 2) {
                pNumberCounter++;
            }
            if (pNumberCounter == k) {
                return i;
            }
        }
        return -1;
    }


    public static int getDivSum(int nr) {
        int divSum = 0;
        for (int j = 2; j <= nr / 2; j++) {
            if (nr % j == 0) {
                divSum += j;
            }
        }

        return divSum;
    }


}
