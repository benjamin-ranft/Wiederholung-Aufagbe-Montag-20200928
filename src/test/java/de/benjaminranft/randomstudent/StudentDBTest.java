package de.benjaminranft.randomstudent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentDBTest {

    @Test
    public void testList(){
        StudentDB studentDB =  new StudentDB(new Student[]{
                new Student("John Doe", 1),
                new Student("Jane Doe", 2),

        });

        Student[] actual = studentDB.listStudents();

        assertArrayEquals(new Student[]{
                new Student("John Doe", 1),
                new Student("Jane Doe", 2),
        }, actual);
    }


    @Test
    public void testStudentDBToString () {
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("John Doe", 1),
                new Student("Jane Doe", 2),
        });
        String expected = "StudentDB{\nStudent{name= John Doe, id= 1}\nStudent{name= Jane Doe, id= 2}\n}";
        String actual = studentDB.toString();

        assertEquals(expected, actual);

    }

    @Test
    void testAddStudent (){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("John Doe", 1),
                new Student("Jane Doe", 2),
        });
        studentDB.add(new Student("Jolly Doe", 3));
        Student[] actual = studentDB.listStudents();

        assertArrayEquals(new Student[]{
                new Student("John Doe", 1),
                new Student("Jane Doe", 2),
                new Student("Jolly Doe", 3)
        }, actual);

    }

    @Test
    public void testRemoveStudent (){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("John Doe", 1),
                new Student("Jane Doe", 2),
                new Student("Jolly Doe", 3)
        });

        studentDB.remove(2);
        Student[] actual = studentDB.listStudents();

        assertEquals(new Student[]{
                new Student("John Doe", 1),
                new Student("Jolly Doe", 3), actual});

    }

}
