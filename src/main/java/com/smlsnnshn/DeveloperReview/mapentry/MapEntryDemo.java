package com.smlsnnshn.DeveloperReview.mapentry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryDemo {

    public static void main(String[] args) {

        // Maps store Map.Entry objects, or make them accessible via the entrySet method ---
        // a map, in general, stores (key,value) pairs in objects that belong to a class
        // that implements this interface.
        // Each Entry object supports getKey() and getValue methods for retrieving these.

        // Create a hash map
        Map<String,Double> hm = new HashMap();

        // Put elements to the map
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set set = hm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = ((Double)hm.get("Zara")).doubleValue();
        hm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + hm.get("Zara"));

    }

}
