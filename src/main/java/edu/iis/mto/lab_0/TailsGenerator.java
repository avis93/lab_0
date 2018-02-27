package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List tails = new ArrayList<String>();
        for(int i = 0; i < value.length() + 1; i++)
        {
            tails.add(value.subSequence(i, value.length()));
        }
        //tails.add("");
        return tails;
    }

}
