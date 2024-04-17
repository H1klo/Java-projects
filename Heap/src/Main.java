public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(15);
        heap.insert(40);
        heap.insert(30);
        heap.insert(50);
        heap.insert(10);
        heap.insert(100);
        heap.insert(40);
        heap.find(40);
        heap.delete(10);


        System.out.println(heap.arr);
    }
}
