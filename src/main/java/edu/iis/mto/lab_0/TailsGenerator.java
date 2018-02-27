package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> stringList = new ArrayList<>();
        for(int i=0; i<=value.length(); i++){
            String lol = value.substring(i);
            stringList.add(value.substring(i));
        }
        return stringList;
    }

}
