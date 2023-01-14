package pro.sky.java.course1;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }


    public boolean equals(Object O) {
        if (this == O) {
            return true;}
            if (O == null || O.getClass() != getClass()) {
                return false;}
                Author author = (Author) O;

                return author.name == this.name &&
                        author.surname == this.surname;
            }



    @Override
    public int hashCode() {
        return Objects.hash(name, surname);

    }

    public String toString() {
        return "имя " + this.name + " " + "фамилия " + this.surname;
    }
}


