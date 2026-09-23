import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        System.out.println(k % n);
    }
}