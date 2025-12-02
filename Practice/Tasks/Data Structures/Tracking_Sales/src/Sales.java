import java.util.Scanner;

public class Sales {

    static final int SALESPEOPLE = 5;
    static int[] sales = new int[SALESPEOPLE];
    static int sum;

    static Scanner scan = new Scanner(System.in);

    public static void enterSalePerson(){

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter sales for sales person " + i + ": ");
            sales[i] = scan.nextInt();

        }
    }

    public static void printSalesPerson(){
        System.out.println("\nSalesperson Sales");
        System.out.println("------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + i + "   " + sales[i]);
            sum += sales[i];

        }

        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage:" + Double.valueOf(sum / sales.length));
    }
}
