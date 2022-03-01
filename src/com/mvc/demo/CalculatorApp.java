package com.mvc.demo;

import com.mvc.demo.calculator.CalculatorController;
import com.mvc.demo.calculator.CalculatorModel;
import com.mvc.demo.calculator.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args){
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
