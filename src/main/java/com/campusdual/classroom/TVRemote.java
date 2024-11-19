package com.campusdual.classroom;

public class TVRemote {

    // ATRIBUTOS:
    int channel; // canal donde esta la tv
    int volume; // nivel de volumen
    boolean on; // si esta encendida o no la tv
    String color; // el color del mando a distancia



    // CONSTRUCTORES:

    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 20;
        this.color = color;
    }

    //metodos
    public boolean turnOn() {
        this.on = true;
        return this.on;
    }

    public boolean turnOff() {
        this.on = false;
        return this.on;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.checkMinValue(this.channel)) {
            this.channel--;
        }
    }
    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            this.volume--;
        }
    }

    public String getColor() {
        return this.color;
    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }
}
