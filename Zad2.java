import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Zad2 {
    public static<T extends Iterable<?>> void wypiszCoDrugi(T objekt){
        Iterator<?> iterator = objekt.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
            if(iterator.hasNext()){
                iterator.next();
            }
            else
                return;
        }

    }
    public static void main(String[] args){
        ArrayList<Integer> tabi = new ArrayList<>();
        tabi.add(1);
        tabi.add(2);
        tabi.add(3);
        tabi.add(4);
        tabi.add(5);
        wypiszCoDrugi(tabi);
        LinkedList<String> str = new LinkedList<>();
        str.add(0,"Napis");
        str.add(1,"Napis2");
        str.add(2,"Napis3");
        str.add(3,"Napis4");
        wypiszCoDrugi(str);
    }
}
