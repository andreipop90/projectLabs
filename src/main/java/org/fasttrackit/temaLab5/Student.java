package org.fasttrackit.temaLab5;

public class Student {
    private String nume;
    private String prenume;
    private int age;
    private float medie;

    public Student(String name, String prenume, int age, float medie) {
        this.nume = name;
        this.prenume = prenume;
        this.age = age;
        this.medie = medie;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
