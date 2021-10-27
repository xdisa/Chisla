import java.util.Scanner;

public class NumToArr {
    public static void main(String[] args)
    {
        // int num = 12345678;
        //int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
       // for(int d : digits)
         //   System.out.print(d);
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        String str = (new Integer(n).toString());
        char[] chArr = str.toCharArray();
        int[] arr = new int[chArr.length];
        for (int i = 0; i< chArr.length; i++) {
            arr[i] = Character.getNumericValue(chArr[i]);
        }
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}
