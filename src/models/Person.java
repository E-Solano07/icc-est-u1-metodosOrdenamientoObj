package models;

public class Person {

    private String name;
    private int age;
    private int[] grades;

    public Person() {
    }

    public Person(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public double getAverage() {
        int sum = 0;
        for(int nota: grades) {
            sum = sum + nota;  
        }
        double promedio = sum / grades.length;
        return promedio;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Person " + name + ", " + age + " promedio = " + getAverage();
    }
}