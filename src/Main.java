public class Main {



    public static void main(String[] args) {
        Author person = new Author("Лев", "Толстой");
        System.out.println("Имя автора ="+ person.getName());
        System.out.println("Фамилия автора = "+person.getSurname());

        Book evidence = new Book("Война и Мир","Лев Толстой", 1869);
        System.out.println("Название книги = "+evidence.getTitle());
        System.out.println("Автор = "+ evidence.getAuthor());
        System.out.println("год выпуска = "+ evidence.getYearIssue());
        evidence.setYearIssue(1900);
        System.out.println("Год Публикации= "+ evidence.getYearIssue());


        Book punishment = new Book("Преступление и наказание","Фёдор достоевский", 1866);
        System.out.println("Название книги = "+punishment.getTitle());
        System.out.println("Автор = "+ punishment.getAuthor());
        System.out.println("год выпуска = "+ punishment.getYearIssue());
        punishment.setYearIssue(1890);
        System.out.println("Год Публикации= "+ punishment.getYearIssue());

        Book master = new Book("Мастер и Маргарита","Михаил Булгаков", 1940);
        System.out.println("Название книги = "+ master.getTitle());
        System.out.println("Автор = "+ master.getAuthor());
        System.out.println("год выпуска = "+ master.getYearIssue());
        master.setYearIssue(1955);
        System.out.println("Год Публикации= "+ master.getYearIssue());

        Author writer = new Author("Лев", "Толстой");
        System.out.println("Имя автора ="+ writer.getName());
        System.out.println("Фамилия автора = "+writer.getSurname());

        Author poet = new Author("Михаил", "Булгаков");
        System.out.println("Имя автора ="+ poet.getName());
        System.out.println("Фамилия автора = "+poet.getSurname());

    }
}