package org.example.Mpas;

import java.util.*;

public class TopicSet {
    public static void main(String[] args) {
        HashMap<Integer ,String > hm = new HashMap<>();
        hm.put(01,"Uday");
        hm.put(03,"Hari");
        hm.put(05,"Akul");
        hm.put(12,"Eshwar");
        hm.put(17,"NoddyLK");
        hm.put(19,"Kritish");
        System.out.println(hm.get(12));

     //   Scanner scanner = new Scanner(System.in);
        int input =  12;
        if(hm.containsKey(input)){
            System.out.println(hm.get(input));
        }
        System.out.println(hm);



        Set<Map.Entry<Integer,String>> mapData = hm.entrySet();
        System.out.println(mapData);  /// Converts it into Set  = [1=Uday, 17=NoddyLK, 3=Hari, 19=Kritish, 5=Akul, 12=Eshwar]
        System.out.println(mapData.getClass().getName());   /// java.util.HashMap$EntrySet

        Collection<String> c = hm.values();
        System.out.println(c);  /// converts it into Set with Only values in it [Uday, NoddyLK, Hari, Kritish, Akul, Eshwar]
        System.out.println(c.getClass().getName()); /// java.util.HashMap$Values


        Iterator itr = mapData.iterator();
        while (itr.hasNext()){
            /// inside map there is no getkey() and getValluse() so we convert the  into """Map.Entry""",so we can use the mothods present in Map.Entry
            Map.Entry data  = (Map.Entry)itr.next();
            System.out.println(data.getClass().getName());
            System.out.println(data.getKey() + " : "+
                    data.getValue());
            if(data.getKey().equals(12)){
                data.setValue("Bolt");
            }
            System.out.println(data.getKey());
        }



    }


}
