import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var a = 0;
        var b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int x = scanner.nextInt();
        while (x > 0) {
            if (x % 2 == 0) {
                a = a + 1;

        }else {
            b = b + 1;
        }
        x=x/2;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
         System.out.println("Hello world!");
    }
}