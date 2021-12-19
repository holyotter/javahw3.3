package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextStationInRange() {
        radio.setCurrentStation(5);
        radio.shouldNextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextStationOutRange() {
        radio.setCurrentStation(9);
        radio.shouldNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStationInRange() {
        radio.setCurrentStation(4);
        radio.shouldPrevStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void prevStationOutRange() {
        radio.setCurrentStation(0);
        radio.shouldPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void inputStationInRange() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void inputStationOutRangeMax() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void inputStationOutRangeMin() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void upVolumeInRange() {
        radio.setCurrentVolume(6);
        radio.shouldUpVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void upVolumeOutRange() {
        radio.setCurrentVolume(10);
        radio.shouldUpVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeInRange() {
        radio.setCurrentVolume(3);
        radio.shouldDownVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeOutRange() {
        radio.setCurrentVolume(0);
        radio.shouldDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
