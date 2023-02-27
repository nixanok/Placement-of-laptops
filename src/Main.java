import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l1, w1, l2, w2;
        l1 = scanner.nextInt();
        w1 = scanner.nextInt();
        l2 = scanner.nextInt();
        w2 = scanner.nextInt();

        if (l1 < w1) {
            int t = l1;
            l1 = w1;
            w1 = t;
        }

        if (l2 < w2) {
            int t = l2;
            l2 = w2;
            w2 = t;
        }

        if (l1 < l2) {
            int tForL = l1;
            int tForW = w1;
            l1 = l2;
            l2 = tForL;
            w1 = w2;
            w2 = tForW;
        }



        if (w1 > l2) {
            System.out.print(l1 + w2);
            System.out.print(" ");
            System.out.println(w1);
        } else {
            System.out.print(l1);
            System.out.print(" ");
            System.out.println(w1 + w2);
        }
    }
}

