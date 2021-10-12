import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Input encoded Salary: ");
        String encodedSalaray = in.next();                                           // taking user input from user
        int salary = 0;
        for (int i = 0; i < encodedSalaray.length(); i++) {
            int val = (int) encodedSalaray.toUpperCase().charAt(i) - 64;
            int pow = encodedSalaray.length() - i - 1;
            salary += val * Math.pow(10, pow);
        }
        System.out.println("Decoded Salary: " + salary);
    }

}
