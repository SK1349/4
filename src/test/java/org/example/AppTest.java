package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * тест метода readCSV на чтение пустого файла
     */
    @Test
    public void testEmptyFile() {
        List<Person> people = App.readCSV("empty.csv", ';');
        assertEquals(0, people.size());
    }

    /**
     * тест метода readCSV на чтение всех записей из файла
     */
    @Test
    public void testReadCSVFile() {
        List<Person> people = App.readCSV("foreign_names.csv", ';');
        assertEquals(25898, people.size());
    }

}
