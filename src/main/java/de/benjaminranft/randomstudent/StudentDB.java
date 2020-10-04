package de.benjaminranft.randomstudent;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] listStudents() {
        return students;
    }

    @Override
    public String toString() {
        String result = "StudentDB{\n";
        for (Student student : students){
        result += student.toString()+"\n";}

        result += "}";
        return result;
    }

    public Student randomStudent(){
        double random = Math.random();
        int randomIndex = (int) (random = students.length);
        return students[randomIndex];
    }

}
