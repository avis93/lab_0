package edu.iis.mto.lab_0;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;

public class TailsTest {

    private static final String HELLO = "Hello";
    private TailsGenerator tailsGenerator;
    private List<String> tails;

    @Before
    public void setup() {

        tailsGenerator = new TailsGenerator();
        tails = tailsGenerator.tails(HELLO);
    }

    @Test
    public void tailsShouldReturnListOfStringsOfSizeEqualsToInputStringLengthPlusOne() {

        assertThat(tails, Matchers.hasSize(HELLO.length() + 1));
    }

    @Test
    public void tailsShouldReturnFullStringAsFirstElement() {

        assertThat(tails.get(0), Matchers.equalTo(HELLO));
    }

    @Test
    public void tailsShouldReturnOneCharacterShorterStringAsSecondElement() {

        assertThat(tails.get(1), Matchers.equalTo(HELLO.subSequence(1,HELLO.length())));
    }

    @Test
    public void tailsShouldReturnEmptyStringAsLastElement() {

        assertThat(tails.get(tails.size() - 1), Matchers.equalTo(""));
    }

}
