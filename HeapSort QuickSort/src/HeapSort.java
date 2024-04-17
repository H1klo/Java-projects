import java.util.ArrayList;

public class HeapSort {
    int comparison = 0;
    int swaps=0;
    public void sort(ArrayList<Integer> arr)
    {

        int N = arr.size();

        for (int i = N / 2 - 1; i >= 0; i--) {
            heapify(arr, N, i);
        }
        for (int i = N - 1; i > 0; i--) {
            int temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);
            swaps++;
            heapify(arr, i, 0);
        }
    }


    void heapify(ArrayList<Integer> arr, int N, int i)
    {
        comparison++;
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2


        if (l < N && arr.get(l) > arr.get(largest))
            largest = l;


        if (r < N && arr.get(r) > arr.get(largest))
            largest = r;


        if (largest != i) {
            int swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest,swap);
            swaps++;

            heapify(arr, N, largest);
        }
    }





}