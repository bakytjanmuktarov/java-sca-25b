import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int z = number / 100;
        int x = (number / 10) % 10;
        int c = number % 10;

        System.out.println(z + x + c);
    }
}