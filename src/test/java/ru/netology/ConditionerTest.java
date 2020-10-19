package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    private void fixValue() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setName("Conditioner");
    }

    //температура в пределах
    @Test
    void setCurrentTemperature() {
        fixValue();
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    //повышение на 1 градус
    @Test
    public void shouldIncreaseCurrentTemperature() {
        fixValue();
        conditioner.setCurrentTemperature(23);
        conditioner.increaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    //повышение температуры на максимуме
    @Test
    public void shouldIncreaseCurrentTemperaturMax() {
        fixValue();
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    //понижение на 1 градус
    @Test
    public void shouldDecreaseCurrentTemperature() {
        fixValue();
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(14, conditioner.getCurrentTemperature());
    }


    //понижение температуры на минимуме
    @Test
    void setDecreaseCurrentTemperatureMin() {
        fixValue();
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }
}
