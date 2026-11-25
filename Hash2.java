import java.util.HashMap;

public class Hash2 {
    public static void main(String[] args){
        HashMap<Integer, String> task = new HashMap<>();

        task.put(1, "java");
        task.put(2, "python");
        task.put(3, "react");
        task.put(4, "java");
        System.out.println(task);

        System.out.println("java:"+ task.containsValue("java"));

        task.remove(2);

        System.out.println(task);
    }

}
