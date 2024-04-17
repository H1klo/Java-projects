import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {


    static String bubbleSort(List<Integer> numbers){
        int sorted=1;
        int iterations=0,swaps=0;
        while(numbers.size()-sorted!=0){
        for (int i=0;i<numbers.size()-sorted;i++) {

            if(numbers.get(i)>numbers.get(i+1)){
                int temp = numbers.get(i+1);
                numbers.set(i+1,numbers.get(i));
                numbers.set(i,temp);
                swaps++;
            }

            iterations++;
        }
        sorted++;}
        return numbers+" iterations: "+ (iterations)+" swaps: "+swaps;
    }
    static String insertSort(List<Integer> numbers){
        int newindex=1;
        int iterations=0,swaps=0;
        while(numbers.size()-newindex>=1){
            for(int i=newindex;i>0;i--){

                if(numbers.get(i)<numbers.get(i-1)){
                    int temp = numbers.get(i-1);
                    numbers.set(i-1,numbers.get(i));
                    numbers.set(i,temp);
                    swaps++;
                }iterations++;
            }
            newindex++;
        }
        return numbers+" iterations: "+ (iterations)+" swaps: "+swaps;


    }

    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        Random random = new Random();
        for (int i=1;i<51;i++){
            numbers1.add(i);
            numbers2.add(i);
        }
        System.out.println("sort sorted list");
        System.out.println("bubble sort: " + bubbleSort(numbers1));
        System.out.println("insertion sort" +insertSort(numbers2));
        System.out.println("-----------------------------\n");
        numbers1.clear();
        numbers2.clear();
        for (int i=1;i<51;i++){
            int number = random.nextInt(0,100);
            numbers1.add(number);
            numbers2.add(number);
        }
        System.out.println("generated list: "+numbers1);
        System.out.println("sort not sorted list");
        System.out.println("bubble sort: " + bubbleSort(numbers1));
        System.out.println("insertion sort" +insertSort(numbers2));
        System.out.println("-----------------------------\n");
        numbers1.clear();
        numbers2.clear();
        for (int i=50;i>0;i--){
            numbers1.add(i);
            numbers2.add(i);
        }
        System.out.println("sort reversed list");
        System.out.println("bubble sort: " + bubbleSort(numbers1));
        System.out.println("insertion sort" +insertSort(numbers2));
        System.out.println("\nConclusion");
        System.out.println("for sorted list we have full iterations and no swaps\nfor unsorted number of changes can vary\nfor reversed list we have same amount of iterations and swaps");
    }
}
