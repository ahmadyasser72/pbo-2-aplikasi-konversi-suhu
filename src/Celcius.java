/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Celcius extends Suhu {

    public Celcius(String s) {
        super(s);
    }

    public Celcius(Suhu other) {
        super(other);
        if (other instanceof Fahrenheit) {
            this.nilai = (other.nilai - 32) * 5 / 9;
        }
    }

}
