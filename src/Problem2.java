import java.util.*;

public class Problem2 {


    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input minimum dimension of the picture (LxL): ");
        int l = in.nextInt();                                                          // taking user input from user

        if (l >= 1 && l <= 10000) {
            System.out.print("Input number of photos: ");
            int n = in.nextInt();
            if (n >= 1 && n <= 10000) {
                for (int i = 1; i <= n; i++) {
                    uploadPhoto(i, l);
                }

            } else {
                System.out.print("Out of Range! (1 <= N <= 1000)");
            }

        } else {
            System.out.print("Out of Range! (1 <= L <= 10000)");
        }
    }


    static void uploadPhoto(int n, int l) {
        int w, h;
        System.out.printf("Width of Photo %d: ", n);
        w = in.nextInt();
        System.out.printf("Height of Photo %d: ", n);
        h = in.nextInt();
        if (w < l || h < l) {
            System.out.println("UPLOAD ANOTHER");
            uploadPhoto(n, l);
        } else {
            if (w == l && h == l) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("Crop it");
            }
        }
    }
}
