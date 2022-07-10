package PayMoney.Driver;

import PayMoney.Transaction;

import java.util.Scanner;

public class Driver {
    static int size;
    static int[] transactions;
    static Scanner in = new Scanner(System.in);
    //    Inserting values to the array
    static void insertValues(){
        System.out.println("Enter the values of the array: ");
        for (int i=0; i<size ; i++){
            transactions[i] = in.nextInt();
        }
    }
    //    main method
    public static void main(String[] args) {
        System.out.print("Enter the size of transaction array: ");
        size = in.nextInt();
        transactions = new int[size];
        insertValues();

        Transaction tr = new Transaction();
        System.out.print("Enter the total number of targets that needs to be achieved: ");
        int target = in.nextInt();
        tr.checkTarget(transactions,target);
        in.close();
    }
}
