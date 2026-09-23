import java.util.Scanner;

public class fifteenth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        int z = (a * 100 + b) * n;
        int rb = z / 100;
        int k = z % 100;
        System.out.println(rb + " " + k);
    }
}