import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        /*Stack stack = new Stack();
        System.out.println("is Empty:" +stack.isEmpty());
        stack.push(new ArrayList<>(Arrays.asList(1,1)));
        System.out.println("is Empty:" + stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println("is Empty:" +stack.isEmpty());
        stack.push(new ArrayList<>(Arrays.asList(2,2)));
        System.out.println(stack.top());
        System.out.println("is Empty:" +stack.isEmpty());*/
        Queue queue = new Queue();
        System.out.println("is Empty:" + queue.isEmpty());
        queue.enqueue(new String[]{"Nikita1", "Tilniak1"});
        queue.enqueue(new String[]{"Nikita2", "Tilniak2"});
        System.out.println("is Empty:" + queue.isEmpty());
        System.out.println(Arrays.toString(queue.front()));
        System.out.println(Arrays.toString(queue.dequeue()));
        System.out.println("is Empty:" + queue.isEmpty());
        System.out.println(Arrays.toString(queue.dequeue()));




    }
}
