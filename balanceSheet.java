import java.util.Scanner;

/**
 * Austin Carter
 * 
 * This program uses an array to keep running totals of assets and liabilities
 * a company may gain or lose.
 *
 * There is a possibility of an Input Mismatch Exception if a number is not entered.
 * I have not spent the time to patch this as I just needed the functionality of this program.
 */

public class balanceSheet
{
    public static void main(String[] args) {
        System.out.println("Welcome! Use the format (code number) to add to the framework");
        System.out.println("Codes: c = Cash, i = Inventory, e = Equipment");
        System.out.print("a = Accounts Payable, n = Notes Payable, ");
        System.out.println("s = Stock, r = Retained Earnings");
        System.out.println("type end to calculate totals");
        System.out.println();
        int[] framework = fillFramework();
        printResults(framework);
    }
    
    public static int[] fillFramework() {
        Scanner keyboard = new Scanner(System.in);
        int[] framework = new int[7];
        boolean cont = true;
        while(cont) {
            String col = keyboard.next();
                if(col.equals("c")) {
                framework[0] += keyboard.nextInt();
            } else if(col.equals("i")) {
                framework[1] += keyboard.nextInt();
            } else if(col.equals("e")) {
                framework[2] += keyboard.nextInt();
            } else if(col.equals("a")) {
                framework[3] += keyboard.nextInt();
            } else if(col.equals("n")) {
                framework[4] += keyboard.nextInt();
            } else if(col.equals("s")) {
                framework[5] += keyboard.nextInt();
            } else if(col.equals("r")) {
                framework[6] += keyboard.nextInt();
            } else if(col.equals("end")) {
                cont = false;
            } else {
            System.out.println("Could not read line. Try again");
            }
        }
        return framework;
    }
    
    public static void printResults(int[] framework) {
        String[] tags = {"Cash", "Inventory", "Equipment", "Accounts Payable",
            "Notes Payable", "Stock", "Retained Earnings"};
        for(int i = 0; i < framework.length; i++) {
            System.out.println(tags[i] + ": " + framework[i]);
        }
    }
}
