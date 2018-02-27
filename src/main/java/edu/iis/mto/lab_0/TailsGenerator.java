package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    ArrayList<String> stringList = new ArrayList<>();

    public List<String> tails(String value) {
        for (int i = 0; i < value.length() + 1; i++) {
            stringList.add(value.substring(i));
        }
        return stringList;
    }

}