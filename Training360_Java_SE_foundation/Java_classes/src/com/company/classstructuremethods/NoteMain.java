package com.company.classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("John Doe");
        note.setTopic("java");
        note.setText("Ez egy java note.");

        System.out.println(note.getNoteText());

    }
}
