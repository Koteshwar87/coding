package passby;

import java.util.Hashtable;

public class PassByReference {

    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("a", 1);
        ht.put("b", 2);
        ht.put("c", 3);

        updateHt(ht);
        System.out.println(ht);
    }

    static void updateHt(Hashtable<String, Integer> tbl){
        System.out.println(tbl);
        tbl.put("d", 4);
    }
}
