package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> myString = new ArrayList<>();
        for (int i = 0; i < value.length()+1; i++) {
            myString.add(value.substring(i, value.length()));
        }
        return myString;
    }

}
