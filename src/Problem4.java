import java.util.*;

public class Problem4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Amount to withdraw: ");
        int amount = Integer.parseInt(in.nextLine());                    // taking user input from user

        if (amount >= 500 && amount <= 20000 && amount % 500 == 0) {      // all the valid options login

            System.out.println("TRANSACTION SUCCESSFUL");
        } else {                                                          //loop will enter this part for all the wrong values
            if (amount < 500) {                                           //if amount is less than 500
                System.out.println("INVALID AMOUNT");
            } else if (amount > 20000) {                                   //if amount is more than 20000
                System.out.println("EXCEEDED AMOUNT");
            } else if (amount % 500 > 0) {                                  //if amount is not multiple of 500
                System.out.println("INVALID AMOUNT");
            } else {
                System.out.println("Error Occurred");
            }
        }


    }
}
