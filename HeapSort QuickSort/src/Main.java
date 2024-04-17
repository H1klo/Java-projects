import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    static void displayArray(ArrayList<Integer> arr){
        for (Integer i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        QuickSort quickSort = new QuickSort();
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("quickSort");
        System.out.print("unsorted array: ");
        displayArray(list);
        quickSort.quickSort(list,0, list.size()-1);
        System.out.print("sorted array: ");
        displayArray(list);
        System.out.println("comparisons: " + quickSort.comparison);
        System.out.println("swaps: " +quickSort.swaps);
        list.clear();
        quickSort.swaps=0;
        quickSort.comparison=0;
        for (int i = 0;i<50;i++){
            list.add(i);
        }
        System.out.print("unsorted array: ");
        displayArray(list);
        quickSort.quickSort(list,0, list.size()-1);
        System.out.print("sorted array: ");
        displayArray(list);
        System.out.println("comparisons: " + quickSort.comparison);
        System.out.println("swaps: " +quickSort.swaps);
        list.clear();
        quickSort.swaps=0;
        quickSort.comparison=0;
        for (int i = 50;i>0;i--){
            list.add(i);
        }
        System.out.print("unsorted array: ");
        displayArray(list);
        quickSort.quickSort(list,0, list.size()-1);
        System.out.print("sorted array: ");
        displayArray(list);
        System.out.println("comparisons: " + quickSort.comparison);
        System.out.println("swaps: " +quickSort.swaps);
        list.clear();



        //-------------------------------------------------------------------
        HeapSort heapSort = new HeapSort();
        for(int i = 0; i < 50; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("heapSort");
        System.out.print("unsorted array: ");
        displayArray(list);
        heapSort.sort(list);
        System.out.print("sorted array: ");
        displayArray(list);
        System.out.println("comparisons: " + heapSort.comparison);
        System.out.println("swaps: " +heapSort.swaps);
        list.clear();
        heapSort.swaps=0;
        heapSort.comparison=0;
        for (int i = 0;i<50;i++){
            list.add(i);
        }
        System.out.print("unsorted array: ");
        displayArray(list);
        heapSort.sort(list);
        System.out.print("sorted array: ");
        displayArray(list);
        System.out.println("comparisons: " + heapSort.comparison);
        System.out.println("swaps: " +heapSort.swaps);
        list.clear();
        heapSort.swaps=0;
        heapSort.comparison=0;
        for (int i = 50;i>0;i--){
            list.add(i);
        }
        System.out.print("unsorted array: ");
        displayArray(list);
        heapSort.sort(list);
        System.out.print("sorted array: ");
        displayArray(list);
        System.out.println("comparisons: " + heapSort.comparison);
        System.out.println("swaps: " +heapSort.swaps);

        

    }
}

