import java.util.List;
import java.util.ArrayList;

public class summArrNoOtrits {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, -27};
        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        if (array.length==0) {
            System.out.println("massiv pustoy");
        }
        else{

            for(int i = 0;i<array.length;i++){
                if(array[i]<0){
                    negative.add(array[i]); // Add negative number
                }else{
                    positive.add(array[i]); // Add positive number
                }
            }
            int sum =0;

            for(int i = 0; i<positive.size(); i++){
                sum+=positive.get(i);

            }
            System.out.println(sum);
        }
    }
    }


