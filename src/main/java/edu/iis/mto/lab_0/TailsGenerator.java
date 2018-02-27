package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List list = new ArrayList<String>();
        for (int i = 0; i <= value.length(); i++) {
            if (i == value.length()) {
                list.add("");
            }
            else {
                list.add(value.substring(0, value.length() - i));
            }
        }
        return  list;
    }

}
