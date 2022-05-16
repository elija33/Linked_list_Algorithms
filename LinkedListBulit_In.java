import java.util.LinkedList;

public class LinkedListBulit_In{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Eli");
        list.add("Ruth");
        list.add("Who");
        list.add("is okay");
        list.add("Give me a name");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Who"));

        list.removeLast();

        for(String lits : list){
            System.out.println(lits);
        }
    }
}