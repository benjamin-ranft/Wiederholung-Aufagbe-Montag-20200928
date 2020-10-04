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
        int randomIndex = (int) (random * students.length);
        return students[randomIndex];
    }

    public void add (Student student) {
        Student[] updatedStudents = new Student[this.students.length+1];
        for (int i = 0; i < students.length; i++) {
            updatedStudents[i] = students[i];
        }
        updatedStudents[students.length] = student;
        students = updatedStudents;


        }

    public void remove (int id){
        if (containsId(id)) {
            boolean removed = false;
            Student[] updatedStudents = new Student[students.length - 1];
            for (int i = 0; i < updatedStudents.length; i++) {
                Student student = students[i];
                if (student.getId() == id) {
                    removed = true;
                }
                int readIndex = removed ? i + 1 : i;
                updatedStudents[i] = students[readIndex];
            }
            students = updatedStudents;
        } else {
            return;
        }
    }

    private boolean containsId (int id) {
        for (Student student:students){
            if(student.getId() == id){
                return true;
            }
        }
        return false;
    }
}


