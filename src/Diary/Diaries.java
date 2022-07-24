package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Diaries {
    private String notes;
    private String title;
    private final String date;
    private String references;

    Scanner userInput = new Scanner(System.in);
    ArrayList<Diaries> pages = new ArrayList<>();

    public Diaries(String date,String title, String references, String notes){
        this.date = date;
        this.title = title;
        this.references = references;
        this.notes = notes;
    }

    public String toString(){
        return "Date: " + date + "\n" + "Title: " + title + "\n" +
                "References: " + references + "\n" + "*My Notes*" + "\n" + notes;
    }

    public void writeThoughts(){
        String saveNote;
        String keepWriting = "yes";
//         Diaries[] pages = new Diaries[10];
//        for(int i = 0 ; i < pages.length; i++) {
        while (Objects.equals(keepWriting, "yes")) {
            System.out.println("Hi, Enter a Title ");
            title = userInput.nextLine();

            System.out.println("Write a reference to today's note");
            references = userInput.nextLine();

            System.out.println("Welcome great writer, Keep Writing");
            saveNote = userInput.nextLine();

            LocalDateTime newDate = LocalDateTime.now();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyy HH-mm-ss");
            String date = newDate.format(formatDate);

            pages.add(new Diaries(date, title, references, saveNote));

            System.out.println("Keep Writing? yes/no: ");
            keepWriting = userInput.nextLine();

            if (Objects.equals(keepWriting, "yes")) {
                System.out.println("SAVED!");
            } else if (Objects.equals(keepWriting, "no")) {
              viewMyNotes();
            }
        }

    }

    public void viewMyNotes(){
        String viewNotes;
        System.out.println("Do you want to view saved notes? ");
        viewNotes = userInput.nextLine();
        if (Objects.equals(viewNotes,"yes")){
            for (Diaries notes : pages){
                System.out.println(notes + "\n");
            }
        }else{
            System.out.println("Bye, expecting you soon!");
        }

    }

    public static void main(String[] args) {
        Diaries myDiary =  new Diaries(null,null,null,null);
        myDiary.writeThoughts();
    }

}
