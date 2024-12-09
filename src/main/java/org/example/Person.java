package org.example;

/**
 * Класс, реализующий сущность Человек
 */
public class Person {
    /**
     * Поле ID
     */
    private int id;
    /**
     * Поле Имя
     */
    private  String name;
    /**
     * Поле пол
     */
    private  String gender;
    /**
     * Поле подразделение (сущность подразделение)
     */
    private Division division;
    /**
     * Поле Зарплата
     */
    private int salary;
    /**
     * Поле дата рождения
     */
    private String birthDate;

    /**
     * конструктор с параметрами
     * @param id ID
     * @param name Имя
     * @param gender Пол
     * @param division Подразделение (Сущность подразделение)
     * @param salary Зарплата
     * @param birthDate Дата рождения
     */
    public Person(int id, String name, String gender, Division division, int salary, String birthDate){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Переопределение метода toString()
     * @return строка с информацией о человеке
     */
    @Override
    public String toString() {
        return "Person{" + "ID=" + id + ", name=" + name +
                ", gender=" + gender + ", division=" + division +
                ", salary=" + salary + ", birthDate=" + birthDate + "}";
    }

}
