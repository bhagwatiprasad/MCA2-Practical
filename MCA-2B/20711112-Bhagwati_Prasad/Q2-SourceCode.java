import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result += sc.nextInt();
        }
        System.out.println(result);
        sc.close();
    }
}