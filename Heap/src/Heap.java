import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Heap {
    List<Integer> arr = new ArrayList<Integer>();

    public void insert(int a) {
        arr.add(a);
        check(arr.size() - 1, false);
    }

    public void delete(int a){
        if(arr.contains(a)){
            int index = arr.indexOf(a);
            arr.set(index,arr.get(arr.size()-1));
            arr.set(arr.size()-1,a);
            arr.remove(arr.size()-1);
            check(index,false);
        }


    }
    public void find(int a){
        if(arr.contains(a)){
            String result = "";
            for (int i = 0; i<arr.indexOf(a);i++) {
                result += String.valueOf(arr.get(i)) + " ";
            }
            result.trim();
            System.out.println(result);
        }
        else System.out.println("No occurrence");
    }

    @Override
    public String toString() {
        String result = "";
        for (int i : arr) {
            result += String.valueOf(i) + " ";
        }
        result.trim();
        return result;
    }

    public void check(int index, boolean down) {
        int temp = arr.get(index);
        int next = -1;
        if (arr.get(index) < arr.get((index - 1) / 2)) {
            next = (index - 1) / 2;
            arr.set(index, arr.get(next));
            arr.set((index - 1) / 2, temp);
        }
        if(((2 * index) + 1)<arr.size()-1){
        if (arr.get(index) > arr.get((2 * index) + 1)) {
            next = (2 * index) + 1;
            arr.set(index, arr.get(next));
            arr.set((2 * index) + 1, temp);
        }}
        if(((2 * index) + 2)<=arr.size()-1){
        if (arr.get(index) > arr.get((2 * index) + 2)) {
            next = (2 * index) + 2;
            arr.set(index, arr.get(next));
            arr.set((2 * index) + 2, temp);
        }}

        if ((index - 1) / 2 != 0 && !down) {
                check((index - 1) / 2, false);
        }
        if(next!=-1)    {
        if (arr.get(next) != null && down) {
                check(next, true);
            }

        }}
    }

