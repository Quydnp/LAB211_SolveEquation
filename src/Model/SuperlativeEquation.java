/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Common.Validation;

/**
 *
 * @author HI
 */
public class SuperlativeEquation {
    private float a,b;

    public SuperlativeEquation() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    public void instance(){
        Validation valid = new Validation();
        a = valid.inputFloat("Enter A: ");
        b = valid.inputFloat("Enter B: ");
    }

    @Override
    public String toString() {
        return a+"X"+b;
    }
}
