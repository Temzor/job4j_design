package ru.job4j.solid.dip.violationoftheprincipledip;

/**
 * Нарушение: class "Mechanic" имеет метод "repairCar", в аргументы передается конкретный тип машины по кузову
 * Mechanic зависит (сильная свзяка) от класса "Sedan".
 * Решение: использовать интерфейсы для различных реалиазции (repair car) и уже от них имплементироваться классу "Mechanic".
 */


public class WealthViolationDIPThree {

    class Mechanic {
        public void repairCar(Sedan sedan) {
            sedan.repair();
        }
    }

    class Sedan {
        public void repair() {
            System.out.println("Repair a sedan");
        }
    }
}
