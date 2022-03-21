package ru.job4j.odd.spr;
/**
 * Класс Animal предоставляет информацию по стране, названию, и популяции обитания того или иного вида животных;
 * реализацию метода nameCounty, необходимо вынести в дургой класс.
 */

public class Animal {
    private String name;
    private String country;
    private String population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void nameCounty() {
        System.out.println(this.name + " " + country);
    }
}
