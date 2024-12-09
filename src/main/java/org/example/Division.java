package org.example;

/**
 * Класс, реализующий сущность Подразделение
 */
public class Division {
    /**
     * Поле ID
     */
    private int id;
    /**
     * Поле название
     */
    private String name;

    /**
     * Конструктор с параметрами
     * @param id ID подразделения
     * @param name Название
     */
    public Division (int id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * Переопределение метода toString()
     * @return строка с информацией о подразделении
     */
    @Override
    public String toString() {
        return "Division{" + "ID=" + id + ", name = " + "}";
    }

}
