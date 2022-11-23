package controller;

import View.View;
import model.QuadraticEquation;

import java.util.Scanner;

public class Controller {

    private final QuadraticEquation model;
    private final View view;

    public Controller(QuadraticEquation model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("The program solves a quadratic equation of the form:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Input a, b è c:");
        do {
            do {
                System.out.println("Input A");
            } while (!model.setA(in.nextLine()));
            do {
                System.out.println("Input B");
            } while (!model.setB(in.nextLine()));
            do {
                System.out.println("Input C");
            } while (!model.setC(in.nextLine()));
            view.setResult(model.calculation());
            view.printResult();
            System.out.println("Continue? \n");
        } while (in.nextLine().equals("yes"));
    }

}
