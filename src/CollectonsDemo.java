import java.util.*;

public class CollectonsDemo {

    public static void main(String[] args) {
        //ArrayList
        List a1 = new ArrayList();
        a1.add("Zaharia");
        a1.add("Mihai");
        a1.add("Andrei");
        System.out.println("ArrayList Elements: ");
        System.out.println(a1);

        //LinkedList
        List l1 = new LinkedList();
        l1.add("Zaharia");
        l1.add("Mihai");
        l1.add("Andrei");
        System.out.println("---------------------------");
        System.out.println("LinkedList Elements: ");
        System.out.println(a1);

        //HashSet
        Set s1 = new HashSet();
        s1.add("Zaharia");
        s1.add("Mihai");
        s1.add("Andrei");
        System.out.println("---------------------------");
        System.out.println("HashSet Elements: ");
        System.out.println(s1);

        //HashMap
        Map m1 = new HashMap();
        m1.put("Zaharia", "8");
        m1.put("Mihai", "31");
        m1.put("Andrei", 14);
        System.out.println("---------------------------");
        System.out.println("HashMap Elements : ");
        System.out.println(m1);





    }
}
