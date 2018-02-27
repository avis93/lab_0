package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> toReturn = new ArrayList<>();
        for(int i = 0 ; i < value.length() ; i++) {
            toReturn.add(value.substring(i, value.length()));
        }
        toReturn.add("");
        return toReturn;
    }

}
