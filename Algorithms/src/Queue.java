import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Queue {
    String[][] queue = new String[10][];
    int lastIndex = 0;
    public int size(){
        return queue.length;
    }
    public boolean isEmpty(){
        for (String[] str: queue) {
            if(str!= null){
                return false;}
            }return true;
        }

    public void enqueue(String[] pair){
        Array.set(queue,lastIndex,pair);
    lastIndex++;}
    public String[] dequeue(){
        String[] temp = (String[]) Array.get(queue,0);
        for (int i=0; i<queue.length-1;i++){
            if(i+1!=queue.length){
            Array.set(queue,i,Array.get(queue,i+1));}
            else{Array.set(queue,i,null);}
        }
        return temp;}
        public String[] front(){
         return (String[]) Array.get(queue,0);
        }



}
