package ru.job4j.odd.spr;

/**
 * Интеррфейс Work работает с обязаностями наемного работника;
 * в данном примере нарушен принцип единого функционала;
 * goHome, goWork, howToGoAtWork  и goHome можно вынести в отдельный интерфейс.
 */

public interface Work {
    void goForSale();
    void goHome();
    void goWork();
    void howToGoAtWork();

}
