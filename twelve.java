import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int z = (n % 86400 + 86400) % 86400;
        int x = z / 3600;
        int c = (z % 3600) / 60;
        int a = z % 60;

        System.out.println(x + ":" + (c < 10 ? "0" : "") + c + ":" + (a < 10 ? "0" : "") + a);
    }
}