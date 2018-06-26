package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


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

        note.clone();

    }

    @Test
    public void itShouldECloneNoteWithTheSameTitleAndSameContent (){
        LocalDateTime hoy = LocalDateTime.now().minusDays(1);
        Note noteClone = new Note();
        Note note = new Note();
        note.setTitle("Prueba");
        note.setContent("Esta es una prueba");
        note.setTimestamp(hoy);

        noteClone = note.clone();

        assertEquals(noteClone.getTitle(), note.getTitle());
        assertEquals(noteClone.getContent(), note.getContent());
        assertTrue(noteClone.getTimestamp().isAfter(hoy) );
    }

   /* @Test
    public void itShouldCloneNote(){
        Note note = new Note();

        note.setContent("Prueba de contenido");
        note.setTitle("Prueba");
        note.setTimestamp(LocalDateTime.now());

        List<Note> noteList = new ArrayList<>();
        noteList.add(note);


        int countNotesBefore = noteList.size();

        note.clone(note.getId());

        int countNotesAfter = noteList.size();

        assertEquals(countNotesBefore+1,countNotesAfter);
        //assertTrue((countNotesBefore + 1 == countNotesAfter));
    }*/
}