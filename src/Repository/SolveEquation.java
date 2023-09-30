/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Common.Validation;
import Model.QuadraticEquation;
import Model.SuperlativeEquation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HI
 */
public class SolveEquation implements ISolveEquation {

    Validation validation = new Validation();

    @Override
    public List<Float> solveSuperlativeEquation() {
        SuperlativeEquation se = new SuperlativeEquation();
        se.instance();
        return calculateSuperlativeEquation(se.getA(), se.getB());
    }

    // ax^2+bx+c
    @Override
    public List<Float> solveQuadraticEquation() {
        QuadraticEquation qe = new QuadraticEquation();
        qe.instance();
        return calculateQuadraticEquation(qe.getA(), qe.getB(), qe.getC());
    }

    public List<Float> calculateSuperlativeEquation(float a, float b) {
        List<Float> list = new ArrayList<Float>();
        if (a == 0) {
            System.out.println("Solution: x = null");
        } else if (b == 0) {
            System.out.println("Infinitely many solutions");
        } else {
            float x = -b / a;
            list.add(x);
            System.out.println("Solution: x = " + x);
        }
        list.add(a);
        list.add(b);
        System.out.print("Odd numbers: ");
        for (Float element : list) {
            if (validation.isOdd(element)) {
                System.out.print(element + "  ");
            }
        }
        System.out.print("Even numbers: ");
        for (Float element : list) {
            if (validation.isEven(element)) {
                System.out.print(element + "  ");
            }
        }
        System.out.print("Perfect squares: ");
        for (Float element : list) {
            if (validation.isPerfectSquare(element)) {
                System.out.print(element + "  ");
            }
        }
        return list;
    }

    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> list = new ArrayList<Float>();
        float denta = b * b - 4 * a * c;
        if (denta == 0) {
            System.out.println("Equation has double solution: ");
            float x = -b / (2 * a);
            list.add(x);
        } else if (denta < 0) {
            System.out.println("Solution: x = null");
        } else {
            float x1 = (-b - (float) Math.sqrt(denta)) / (2 * a);
            float x2 = (-b + (float) Math.sqrt(denta)) / (2 * a);
            list.add(x1);
            list.add(x2);
            System.out.println("solutions: x1=" + x1 + ", x2=" + x2);
        }
        list.add(a);
        list.add(b);
        System.out.print("Odd numbers: ");
        for (Float element : list) {
            if (validation.isOdd(element)) {
                System.out.print(element + "  ");
            }
        }
        System.out.print("Even numbers: ");
        for (Float element : list) {
            if (validation.isEven(element)) {
                System.out.print(element + "  ");
            }
        }
        System.out.print("Perfect squares: ");
        for (Float element : list) {
            if (validation.isPerfectSquare(element)) {
                System.out.print(element + "  ");
            }
        }
        return list;
    }

}
