import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int x, y, j;
        Scanner i = new Scanner(System.in);
        System.out.print("输入");
        y = i.nextInt();
        j = (int) y / 2;
        for (x = 2; x <= j; x++) {
            if (y % x == 0) {
                System.out.println("no");
                break;
            }
        }
        if (x > j) {
            System.out.println("yes");
        }
    }
}
