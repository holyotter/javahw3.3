package ru.netology.domain;

public class Radio {
    private int numberOfStation = 10;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
        if (numberOfStation < 10) {
            maxStation = numberOfStation - 1;
        }
        if (numberOfStation > 10 ) {
            maxStation = numberOfStation - 1;
        }
    }

    public Radio() {
    }

    public void shouldNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        else {
            currentStation = 0;
        }
    }

    public void shouldPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        else {
            currentStation = 9;
        }
    }

    public void shouldUpVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void shouldDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
