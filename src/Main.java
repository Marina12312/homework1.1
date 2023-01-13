import pro.sky.java.course1.Author;
import pro.sky.java.course1.Book;

public class Main {



    public static void main(String[] args) {
        Author person = new Author("Лев", "Толстой");
        System.out.println("Имя автора ="+ person.getName());
        System.out.println("Фамилия автора = "+person.getSurname());

        Book book = new Book("Война и мир",person ,1869);
        System.out.println("Название книги = "+book.getTitle());
        System.out.println("Автор = "+ person.getName()+ " "+person.getSurname());
        System.out.println("год выпуска = "+ book.getYearIssue());
        book.setYearIssue(1890);
        System.out.println("Год Публикации= "+book.getYearIssue());

        Author writer = new Author("Фёдор","Достоевкский");
        Author poet = new Author("Михаил", "Булгаков");

        Book punishment = new Book("Преступление и наказание",writer, 1866);
        System.out.println("Название книги = "+punishment.getTitle()+ " Автор = "+ writer.getName()+ " "+writer.getSurname() );
        punishment.setYearIssue(1890);
        System.out.println("Год Публикации= "+punishment.getYearIssue());


        Book master = new Book("Мастер и Маргарита",poet, 1900);
        System.out.println("Название книги = "+master.getTitle()+ " Автор = "+ poet.getName()+ " "+poet.getSurname());
        master.setYearIssue(1958);
        System.out.println("Год Публикации= "+master.getYearIssue());








    }
}