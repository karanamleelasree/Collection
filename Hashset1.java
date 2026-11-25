import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args){
        HashSet<String> task = new HashSet<>();

        task.add("java");
        task.add("python");
        task.add("react");
        task.add("java");
        System.out.println(task);

        System.out.println("java:"+ task.contains("java"));

        task.remove("python");

        System.out.println(task);
    }
}
