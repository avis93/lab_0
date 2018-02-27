package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
        	myList.add(value.substring(i, value.length()));
        }
        myList.add("");
        return myList;
    }

}
