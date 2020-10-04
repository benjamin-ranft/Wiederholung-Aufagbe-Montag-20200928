package de.benjaminranft.randomstudent;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

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
        String expected = "StudentDB{\nStudent{name= John Doe, id= 1}\n Student{name= Jane Doe, id= 2}\n}";
        String actual = studentDB.toString();

        assertEquals(expected, actual);

    }


}