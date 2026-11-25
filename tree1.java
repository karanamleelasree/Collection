import java.util.TreeSet;

public class tree1 {
    public static void main(String[] args){
        TreeSet<String> obj = new TreeSet<>();

        obj.add("java");
        obj.add("python");
        obj.add("react");
        System.out.println(obj);
        obj.removeLast();
        System.out.println(obj);
    }
}
