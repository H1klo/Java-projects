import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Stack {
    public List<List<Integer>> list = new ArrayList<>();

    public int size(){
        return list.size();
    }
    public  boolean isEmpty(){
        return list.isEmpty();
    }

    public Object top(){
        if (!list.isEmpty()){
            return list.get(list.size()-1);
        }
        else {
            throw new RuntimeException("Empty list");
        }
    }
    public void push(List<Integer> pair){
        list.add(pair);
        System.out.println("item "+ pair + "added");
    }
    public List<Integer> pop(){
        if(!list.isEmpty()){
            List<Integer> element = list.get(list.size()-1);
            list.remove(list.size()-1);
            return element;}
        else{throw new RuntimeException("Empty list");

    }}
}
