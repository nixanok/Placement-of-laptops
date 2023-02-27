import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l1, w1, l2, w2;
        l1 = scanner.nextInt();
        w1 = scanner.nextInt();
        l2 = scanner.nextInt();
        w2 = scanner.nextInt();

        if(l1 < w1) {
            int t = l1;
            l1 = w1;
            w1 = t;
        }

        if(l2 < w2) {
            int t = l2;
            l2 = w2;
            w2 = t;
        }

        int s1, s2;
        if (l1 < l2){
            s1 = (l1 + w2) * (l2);
            s2 = (w1 + w2) * (l2);
            if(s1 < s2) {
                System.out.print(l1 + w2);
                System.out.print(' ');
                System.out.println(l2);
            } else {
                System.out.print(w1 + w2);
                System.out.print(' ');
                System.out.println(l2);
            }
        } else {
            s1 = (l2 + w1) * (l1);
            s2 = (w2 + w1) * (l1);
            if(s1 < s2) {
                System.out.print(l2 + w1);
                System.out.print(' ');
                System.out.println(l1);
            } else {
                System.out.print(w2 + w1);
                System.out.print(' ');
                System.out.println(l1);
            }
        }




    }

}

