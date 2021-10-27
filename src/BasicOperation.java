import java.util.Scanner;
public class BasicOperation {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("vvedite dannie");
        String x = s1.nextLine();
        int a = s2.nextInt();
        int b = s3.nextInt();
        int sum = 0;

       // if(x=="+"){

       // }
        switch(x) {
            case "+":
                sum = a+b;
                System.out.println(sum);
                break;
            case "-":
                sum = a-b;
                System.out.println(sum);
                break;
            case "*":
                sum = a*b;
                System.out.println(sum);
                break;
            case "/":
                sum =a/b;
                System.out.println(sum);
                break;
            default:
                System.out.println("vvedeno necorrectnoe znachenie");
        }
    }
}
