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








    }
}