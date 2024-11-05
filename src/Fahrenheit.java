/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Fahrenheit extends Suhu {

    public Fahrenheit(String s) {
        super(s);
    }
    
    public Fahrenheit(Suhu other) {
        super(other);
        if (other instanceof Celcius) {
            this.nilai = (other.nilai * 9 / 5) + 32;
        }
    }
}
