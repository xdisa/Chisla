import java.util.Scanner;
public class Tseloe {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("vvedite dannie");
        int a = s1.nextInt();
        System.out.println(func(a));

    }
    public boolean func(float f) {
        return false;
    }

    public static boolean func(int n) {
        return n % 2 == 0;
    }
}
