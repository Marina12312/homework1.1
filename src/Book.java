public class Book {
   private String title;
    private String author;
    private int yearIssue;

    public  Book (String title, String author, int yearIssue) {
        this.title = title;
        this.author = author;
        this.yearIssue = yearIssue;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYearIssue(){
        return this.yearIssue;
    }
    public void setYearIssue (int yearIssue){
        this.yearIssue= yearIssue;
    }

}
