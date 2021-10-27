import java.util.Scanner;

public class Otricanie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("vvedite dannie");
        int x = s.nextInt();
        if (x <= 0) {
            System.out.println(x);
        } else {
            int a = x;
            x = 0;
            x = x - a;
            System.out.println(x);
        }


    }

}
