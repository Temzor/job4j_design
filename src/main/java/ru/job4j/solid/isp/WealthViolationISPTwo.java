package ru.job4j.solid.isp;

/**
 * Интерфейс WealthViolationOCPTwo описывает разные типы стыковки с МКС;
 * Нарушение: у имплементированного класса с астронавтами передается поведение по стыковке и разными типами и грузового дока;
 * То же самое и с грузовым модулем;
 * Решение: разделить интерфейсы на 4 отдельных интерфейса (buttWithGatewayTypeX(), buttWithGatewayTypeY(), supplyLockDocking(), dockingGatewayWithAstronauts()), и уже от них имплементировать нужные нам классы;
 * Если интерфейсы не разделять и использовать "заглушки", то при изменении интерфейса в будущем, линия изменений пройдёт через классы, через которые ранее она не проходила.
 */

interface WealthViolationISPTwo {
    boolean buttWithGatewayTypeX();
    boolean buttWithGatewayTypeY();
    boolean supplyLockDocking();
    boolean dockingGatewayWithAstronauts();
}

class AstronautsDocking implements  WealthViolationISPTwo {

    @Override
    public boolean buttWithGatewayTypeX() {
        return false;
    }

    @Override
    public boolean buttWithGatewayTypeY() {
        return false;
    }

    @Override
    public boolean supplyLockDocking() {
        return false;
    }

    @Override
    public boolean dockingGatewayWithAstronauts() {
        return false;
    }
}

class CargoDocking implements  WealthViolationISPTwo {

    @Override
    public boolean buttWithGatewayTypeX() {
        return false;
    }

    @Override
    public boolean buttWithGatewayTypeY() {
        return false;
    }

    @Override
    public boolean supplyLockDocking() {
        return false;
    }

    @Override
    public boolean dockingGatewayWithAstronauts() {
        return false;
    }
}