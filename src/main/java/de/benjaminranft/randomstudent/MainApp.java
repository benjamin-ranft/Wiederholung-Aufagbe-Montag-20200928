package de.benjaminranft.randomstudent;

public class MainApp {
    public static void main(String[] args) {

            StudentDB studentDB = new StudentDB(new Student[]{
                new Student("John Doe", 1),
                new Student("Jane Doe", 2),
                });

        for (int i = 0; i < 10; i++) {
            System.out.println(studentDB.randomStudent());
        }
    }
}
