package pro.sky.java.course1;

import pro.sky.java.course1.Author;

import java.util.Objects;

public class Book {
   private String title;
    private Author author;
    private int yearIssue;

    public  Book (String title, Author author, int yearIssue) {
        this.title = title;
        this.author = author;
        this.yearIssue = yearIssue;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return author.getName()+ " "+ author.getSurname();
    }

    public int getYearIssue(){
        return this.yearIssue;
    }
    public void setYearIssue (int yearIssue){
        this.yearIssue= yearIssue;
    }
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || other.getClass() != getClass()) {
            return false;}
            Book book = (Book) other;

            return book.title == this.title &&
                   book.yearIssue== this.yearIssue;
        }




    @Override
    public int hashCode() {
        return Objects.hash(title,yearIssue);}

    public String toString(){
        return "Название =  "+ this.title + author.toString() + " год = "+ this.yearIssue;
    }

}
