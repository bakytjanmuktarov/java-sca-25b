import java.util.Scanner;

public class fourteenth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int x = 540 + a * 45 + ((a - 1) / 2) * 20 + ((a - 1) % 2) * 5;
        int c = x / 60;
        int y = x % 60;
        System.out.println(c + " " + y);
    }
}