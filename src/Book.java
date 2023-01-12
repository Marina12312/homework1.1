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

}
