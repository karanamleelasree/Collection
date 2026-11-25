import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[]  args){
        LinkedList<Integer> task = new LinkedList<>();

        task.add(10);
        task.add(20);
        task.add(30);
        task.add(40);
        System.out.println(task);
        task.removeFirst();
        task.removeLast();
        System.out.println(task);
    }  
}
