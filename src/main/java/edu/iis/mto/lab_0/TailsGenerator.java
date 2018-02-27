package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            temp.add(value.substring(i));
        }
        temp.add("");
        return temp;
    }

}
