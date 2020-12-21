/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author ismael
 */
public class Coche {
    private Motor motor;
    private Puerta puertas;
    private Rueda rueda1;
    private Rueda rueda2;
    private Rueda rueda3;
    private Rueda rueda4;

    public Coche(Motor motor, Puerta puertas, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4) {
        this.motor = motor;
        this.puertas = puertas;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
    }

    

    public Coche() {
    }

    public Motor getMotor() {
        return motor;
    }

    public Puerta getPuertas() {
        return puertas;
    }

    public Rueda getRueda1() {
        return rueda1;
    }

    public Rueda getRueda2() {
        return rueda2;
    }

    public Rueda getRueda3() {
        return rueda3;
    }

    public Rueda getRueda4() {
        return rueda4;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setPuertas(Puerta puertas) {
        this.puertas = puertas;
    }

    public void setRueda1(Rueda rueda1) {
        this.rueda1 = rueda1;
    }

    public void setRueda2(Rueda rueda2) {
        this.rueda2 = rueda2;
    }

    public void setRueda3(Rueda rueda3) {
        this.rueda3 = rueda3;
    }

    public void setRueda4(Rueda rueda4) {
        this.rueda4 = rueda4;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertas=" + puertas + ", rueda1=" + rueda1 + ", rueda2=" + rueda2 + ", rueda3=" + rueda3 + ", rueda4=" + rueda4 + '}';
    }




    
}
