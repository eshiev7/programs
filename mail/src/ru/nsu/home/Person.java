package ru.nsu.home;

import java.util.Objects;

public class Person {
    private String surname;
    private String name;
    private String middleName;
    private String dateBirth;

    public Person(String surname, String name, String middleName, String dateBirth) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateBirth = dateBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) &&
                Objects.equals(name, person.name) &&
                Objects.equals(middleName, person.middleName) &&
                Objects.equals(dateBirth, person.dateBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, middleName, dateBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Дата Рождения='" + dateBirth + '\'' +
                '}';
    }

    public String getInfo(){
        return this.surname + " " +
                this.name + " " +
                this.middleName + " " +
                this.dateBirth;
    }
}
