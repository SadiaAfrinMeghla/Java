package important;

import java.util.Random;

public class SuffleNumbersFromArray {
    public static void main(String[] args) {
int [] numbers = {1,2,3,4,5,6,7};
suffle(numbers);

}
public static void suffle (int[] numbers) {
        for(int i=0; i<numbers.length; i++){
            Random random = new Random();
           int index= random.nextInt(numbers.length);
            System.out.println(numbers[index]);


        }
}

}
