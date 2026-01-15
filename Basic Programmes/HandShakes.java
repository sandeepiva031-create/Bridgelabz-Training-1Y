import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The maximum number of handshakes is " + (n * (n - 1)) / 2);
    }
}
