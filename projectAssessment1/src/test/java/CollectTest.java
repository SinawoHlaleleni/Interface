
import org.junit.Test;

import java.util.*;
public class CollectTest {

    @Test
    public void List()
    {
        ArrayList<String> alist=new ArrayList<String>();
        //Adding elements to the ArrayList it does allow duplication
        alist.add("Hlaleleni");
        alist.add("Sinawo");
        alist.add("Makawuta");
        alist.add("Tom");
        alist.add("Tom");
        //displaying elements
        System.out.println(alist);

    }
    @Test
    public void Set()
    {
        HashSet<String> hset = new HashSet<>();
        // Adding elements to the HashSet it does not allow duplication
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");

        //Addition of duplicate elements
        hset.add("Apple");
        //Addition of null values
        //hset.add(null);
        //Displaying HashSet elements
        System.out.println(hset);
    }
    @Test
    public void Map()
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        /*Adding elements to HashMap arrange them with numbers*/
        hmap.put(12, "Chuma");
        hmap.put(2, "Alulutho");
        hmap.put(14, "Mnqweno");
        hmap.put(7, "Akhile");

        /* Display content*/
        System.out.println(hmap);

    }
}
