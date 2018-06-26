package com.rgfp.psd.logbook.domain;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class NoteTest {

    // your tests here
    @Test
    public void itShouldRetornFifteenCharacters (){

       String fifteenCharacters;
       Note note = new Note();
       note.setContent("wertyuiopasdfgh");

       fifteenCharacters = note.getSummary();

       assertEquals(15,fifteenCharacters.length());
    }

    @Test
    public void itShouldShowPhrase(){

        String fifteenCharacters;
        Note note = new Note();
        note.setContent("wertyuiopasdfgh");

        fifteenCharacters = note.getSummary();

        assertEquals("wertyuiopasdfgh",fifteenCharacters);
    }

    @Test
    public void itShouldSubstringPhraseFifteenCharacters(){

        String fifteenCharacters;
        Note note = new Note();
        note.setContent("asdfghjklzxcvbnm");

        fifteenCharacters = note.getSummary();

        assertEquals("asdfghjklzxcvbn",fifteenCharacters);
    }

    @Test
    public void itShouldShowPhraseLessFifteenCharacters(){

        String fifteenCharacters;
        Note note = new Note();
        note.setContent("asdfghjk");

        fifteenCharacters = note.getSummary();

        assertEquals("asdfghjk",fifteenCharacters);
    }

    @Test
    public void itShouldExecuteCloneMethod (){

        Note note = new Note();
        note.setTitle("Prueba");
        note.setContent("Esta es una prueba");


        note.cloneNote();
    }

}