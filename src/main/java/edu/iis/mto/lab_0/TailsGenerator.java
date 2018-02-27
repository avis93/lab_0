package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {
    public List<String> tails(String value) {
        int valueLength = value.length();
        ArrayList<String> tails = new ArrayList<>(valueLength + 1);

        for (int i = 0; i < valueLength; i++) {
            tails.add(value);
            value = value.substring(1);
        }

        return tails;
    }
}
