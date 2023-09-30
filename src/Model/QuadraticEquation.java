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
public class QuadraticEquation {
    private float a,b,c;

    public QuadraticEquation() {
        
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public void instance(){
        Validation valid = new Validation();
        a = valid.inputFloat("Enter A: ");
        b = valid.inputFloat("Enter B: ");
        c = valid.inputFloat("Enter C: ");
    }

    @Override
    public String toString() {
        return a+"X^2"+b+"X"+c;
    }
    
}
