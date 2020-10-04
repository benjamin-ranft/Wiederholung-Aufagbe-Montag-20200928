package de.benjaminranft.randomstudent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testToString() {
        //GIVEN
        Student student = new Student("Heinz", 1);


        //WHEN
        student.getName();
        String actual = student.toString();

        //THEN
        assertEquals("Student{name= Heinz, id= 1}",actual);
    }

    @Test
    void testSetAndGetName (){
        //GIVEN
        Student student = new Student(null,1);
        String name = "Hans";

        //WHEN
        student.setName(name);
        String actual = student.getName();

        //THEN
        assertEquals(name, actual);

    }

    @Test
    void testGetName (){
        //GIVEN
        Student student = new Student("Heinz", 1);

        //WHEN
        String actualName = student.getName();

        //THEN
        assertEquals("Heinz",actualName);
    }
}