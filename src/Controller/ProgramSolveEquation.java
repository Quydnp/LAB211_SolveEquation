/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.ISolveEquation;
import Repository.SolveEquation;
import View.Menu;

/**
 *
 * @author HI
 */
public class ProgramSolveEquation extends Menu<String> {
    private ISolveEquation SolveEquationRepo;
    static String[] options = {
        "Calculate Superlative Equation",
        "Calculate Quadratic Equation",
        "Exit"
    };

    public ProgramSolveEquation() {
        super("========= Equation Program =========", options);
        SolveEquationRepo = new SolveEquation();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                float a, b;
                SolveEquationRepo.solveSuperlativeEquation();
                break;
            }
            case 2: {
                SolveEquationRepo.solveQuadraticEquation();
                break;
            }
            case 3: {
                System.exit(0);
            }
        }
    }

}
