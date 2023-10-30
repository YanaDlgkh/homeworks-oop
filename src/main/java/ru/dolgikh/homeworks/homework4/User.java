package ru.dolgikh.homeworks.homework4;

public class User {
    private String surname;
    private String name;
    private String middleName;
    private int birthYear;
    private String email;

    public User(String surname, String name, String middleName, int birthYear, String email) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
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

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + " " + middleName + "\n"
                + "Год рождения: " + birthYear + "\n"
                + "email: " + email);
    }
}
