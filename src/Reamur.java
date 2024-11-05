/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Reamur extends Suhu {

    public Reamur(String s) {
        super(s);
    }

    public Reamur(Suhu other) {
        super(other);
        if (other instanceof Celcius) {
            this.nilai = other.nilai * 4 / 5;
        } else if (other instanceof Fahrenheit) {
            this.nilai = (other.nilai - 32) * 4 / 9;
        } else if (other instanceof Kelvin) {
            this.nilai = (other.nilai - 273.15) * 4 / 5;
        }
    }

}
