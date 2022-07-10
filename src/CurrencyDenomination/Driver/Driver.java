package CurrencyDenomination.Driver;

import CurrencyDenomination.Currency;
import CurrencyDenomination.SortCurrency;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int[] denomination;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations:");
        int c_size = in.nextInt();
        denomination = new int[c_size];
        System.out.println("Enter the currency denominations value:");
        for (int i=0; i<c_size; i++){
            denomination[i] = in.nextInt();
        }

//        invoking object of class SortCurrency to sort the denomination array
        SortCurrency sc = new SortCurrency();
        sc.sort(denomination, 0, c_size-1);

        System.out.print("Enter the amount you want to pay: ");
        int amount = in.nextInt();

//        invoking object of class currency to find the denomination count
        Currency curr = new Currency();
        curr.findDenominations(denomination, amount);
        in.close();
    }
}

