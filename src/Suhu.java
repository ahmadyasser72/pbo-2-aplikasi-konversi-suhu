/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author x
 */
public abstract class Suhu {

    protected double nilai;

    public Suhu(String s) {
        this.nilai = Double.parseDouble(s);
    }

    public Suhu(Suhu other) {
        this.nilai = other.nilai;
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.nilai);
    }
}
