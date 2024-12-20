package org.example;

import java.io.*;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.util.List;
import java.util.LinkedList;

/**
 * Класс, реализующий чтение данных о людях из файла CSV
 */
public class App 
{
    /**
     * Чтение из файла
     * @param csvFilePath путь к файлу
     * @param separator разделитель
     * @return  объект типа List в котором будут находится люди из файла
     */
    public static List<Person> readCSV(String csvFilePath, char separator) {
        List<Person> people = new LinkedList<>();
        int divisionIdCounter = 1;

        try (InputStream in = App.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in)).withCSVParser(new CSVParserBuilder().withSeparator(separator).build()).withSkipLines(1).build()) {

            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }

            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                if(nextLine.length == 0) {
                    System.err.println("Пустая строка");
                    continue;
                }

                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String gender = nextLine[2];
                String birthDate= nextLine[3];
                String divisionName  = nextLine[4];
                int salary = Integer.parseInt(nextLine[5]);

                if (name.isEmpty() || gender.isEmpty() || divisionName.isEmpty() || birthDate.isEmpty()) {
                    System.err.println("Не хватает данных: " + String.join(", ", nextLine));
                    continue;
                }

                Division division = new Division(divisionIdCounter++, divisionName);
                Person person = new Person(id, name, gender, division, salary, birthDate);
                people.add(person);
           }
        } catch (Exception e){
            e.printStackTrace();
        }

        return people;
    }

    /**
     * Главный метод программы
     * @param args Аргументы командной строки
     */
    public static void main( String[] args )
    {
        String csvFilePath = "foreign_names.csv";
        char separator = ';';

        List<Person> people = readCSV(csvFilePath, separator);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
