package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList<String> tails = new ArrayList<String>();
        tails.add(value);
        for (int i = 1; i < value.length(); i++)
            tails.add(tails.get(i-1).substring(1));

        tails.add(tails.get(value.length() - 1).substring(1));
        return tails;
    }
}
