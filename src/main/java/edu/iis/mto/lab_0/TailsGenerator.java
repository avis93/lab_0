package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> list=new ArrayList<>();
        for (int i=0; i<value.length(); i++) {
            list.add(value.substring(i));
        }
        list.add(new String());
        System.out.println(list.toString());
        return list;
    }

}
