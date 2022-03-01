package com.mvc.demo.calculator;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private final JTextField firstNumber = new JTextField(10);
    private final JTextField secondNumber = new JTextField(10);
    private final JButton calculationButton = new JButton("Calculate");
    private final JTextField calcSolution = new JTextField(10);

    public CalculatorView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcSolution.setEditable(false);

        calcPanel.add(firstNumber);
        JLabel additionLabel = new JLabel("+");
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculationButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }

    public void addCalculationListener(ActionListener listenerForCalcButton){
        calculationButton.addActionListener(listenerForCalcButton);
    }

    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
