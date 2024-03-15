package important;

public class SortNumbersFromArray {
    public static void main(String[] args) {
int[] numbers= {1,4,2,3,5,7,6};
sort(numbers);
        for (int c : numbers){
            System.out.println(c);
        }

    }
    public static void sort(int[] numbers){
        for (int i=0; i<numbers.length ; i++){
           for (int j=i+1; j<numbers.length ; j++) {
               if (numbers[i] > numbers[j]){
                   int temp = numbers[i];
                   numbers[i]= numbers[j];
                   numbers[j]=temp;


               }
           }

        }


    }
}
