import java.util.ArrayList ;
import java.util.Collections ;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(4);
        System.out.println(list);


        System.out.println(list.get(2));



        list.add(1,2);
        System.out.println(list);



        list.set(3,0);
        System.out.println(list);



        int size= list.size();
        System.out.println(size);



        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
