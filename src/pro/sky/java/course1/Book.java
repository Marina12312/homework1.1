package pro.sky.java.course1;

import pro.sky.java.course1.Author;

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
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return title.equals(c2.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);}

    public String toString(){
        return "Название =  "+ this.title + author.toString() + " год = "+ this.yearIssue;
    }

}
