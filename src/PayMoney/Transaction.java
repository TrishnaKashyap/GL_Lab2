package PayMoney;

import java.util.Scanner;

public class Transaction {

// Checking for achieved targets
    public void checkTarget(int[] transactions, int target){
        Scanner in = new Scanner(System.in);
        long targetAmount;
        if(target <= transactions.length){
            while(target != 0){
                boolean achieved = false;
                System.out.println("Enter the value of target: ");
                targetAmount = in.nextInt();
                long sum = 0;
                for(int i=0; i<transactions.length; i++){
                    sum += transactions[i];
                    if(sum >= targetAmount){
                        System.out.println("Target achieved after " + (i+1) + " transactions.");
                        achieved = true;
                        break;
                    }
                }
                if(!achieved){
                    System.out.println("Given target is not achieved.");
                }
                target--;
            }
        }
        else{
            System.out.println("Enter a value less than or equal to " + transactions.length);
        }
        in.close();
    }

}
