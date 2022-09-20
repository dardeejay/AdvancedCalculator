package com.example.advancedcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
public class HelloController {
    @FXML
    private Label currentOperand;
    @FXML
    private Label prevOperand;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button point;
    @FXML
    private Button AC;
    @FXML
    private Button DEL;
    @FXML
    private Button ADD;
    @FXML
    private Button MINUS;
    @FXML
    private Button MULTIPLY;
    @FXML
    private Button DIVIDE;
    @FXML
    private Button EQUALS;
    @FXML
    private Button MODULO;
    private String currentOperandText = "";
    private float operand1 = 0 ;
    private float operand2;
    private String operator;
    private boolean isPointEmpty = true;
    @FXML
    protected void operandButton(ActionEvent event){

        if(event.getSource() == one){
            currentOperandText += "1";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == two){
            currentOperandText +="2";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == three){
            currentOperandText +="3";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == four){
            currentOperandText +="4";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == five){
            currentOperandText +="5";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == six){
            currentOperandText +="6";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == seven){
            currentOperandText +="7";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == eight){
            currentOperandText +="8";
            currentOperand.setText(currentOperandText);
        }
        else if (event.getSource() == nine){
            currentOperandText +="9";
            currentOperand.setText(currentOperandText);
        }
        else if(event.getSource() == zero){
            currentOperandText +="0";
            currentOperand.setText(currentOperandText);
        }
        else if(event.getSource() == point){
            if(isPointEmpty){
                currentOperandText +=".";
                currentOperand.setText(currentOperandText);
                isPointEmpty = !isPointEmpty;
            }
        }
    }
    @FXML
    protected void functButtons(ActionEvent event){
        if(event.getSource() == AC){
            currentOperandText ="";
            currentOperand.setText(currentOperandText);
            prevOperand.setText(currentOperandText);
            operator ="";
            operand1 = 0;
            operand2 = 0;
            if(!isPointEmpty){
                isPointEmpty = !isPointEmpty;
            }
        }
        else if(event.getSource() == DEL){
            if(!currentOperandText.equals("")) {
                currentOperandText = currentOperandText.substring(0, currentOperandText.length() - 1);
                currentOperand.setText(currentOperandText);
                if(!isPointEmpty){
                    isPointEmpty = !isPointEmpty;
                }
            }
        }
    }
    @FXML
    protected void operatorButtons(ActionEvent event){
        if(event.getSource() == ADD){
            operand1 = Float.parseFloat(currentOperandText);
            currentOperandText += "+";
            prevOperand.setText(currentOperandText);
            currentOperandText = "";
            currentOperand.setText(currentOperandText);
            operator = "+";
            if(!isPointEmpty){
                isPointEmpty = !isPointEmpty;
            }
        }
        else if(event.getSource() == MINUS){
            operand1 = Float.parseFloat(currentOperandText);
            currentOperandText += "-";
            prevOperand.setText(currentOperandText);
            currentOperandText = "";
            currentOperand.setText(currentOperandText);
            operator = "-";
            if(!isPointEmpty){
                isPointEmpty = !isPointEmpty;
            }
        }
        else if(event.getSource() == MULTIPLY){
            operand1 = Float.parseFloat(currentOperandText);
            currentOperandText += "*";
            prevOperand.setText(currentOperandText);
            currentOperandText = "";
            currentOperand.setText(currentOperandText);
            operator = "*";
            if(!isPointEmpty){
                isPointEmpty = !isPointEmpty;
            }
        }
        else if(event.getSource() == DIVIDE){
            operand1 = Float.parseFloat(currentOperandText);
            currentOperandText += "/";
            prevOperand.setText(currentOperandText);
            currentOperandText = "";
            currentOperand.setText(currentOperandText);
            operator = "/";
            if(!isPointEmpty){
                isPointEmpty = !isPointEmpty;
            }
        }
        else if(event.getSource() == MODULO){
            operand1 = Float.parseFloat(currentOperandText);
            currentOperandText += "%";
            prevOperand.setText(currentOperandText);
            currentOperandText = "";
            currentOperand.setText(currentOperandText);
            operator = "%";
            if(!isPointEmpty){
                isPointEmpty = !isPointEmpty;
            }
        }
        else if(event.getSource() == EQUALS){
            if(operator.equals("")){
                currentOperand.setText(currentOperandText);
            }
            switch (operator) {
                case "+":
                    if (currentOperandText.equals("")) {
                        currentOperand.setText(Float.toString(operand1));
                        operand1 = 0;
                        prevOperand.setText("");
                    } else {
                        operand2 = Float.parseFloat(currentOperandText);
                        currentOperandText = Float.toString(operand1 + operand2);
                        currentOperand.setText(currentOperandText);
                        prevOperand.setText("");
                    }
                    break;
                case "-":
                    if (currentOperandText.equals("")) {
                        currentOperand.setText(Float.toString(operand1));
                        operand1 = 0;
                        prevOperand.setText("");
                    } else {
                        operand2 = Float.parseFloat(currentOperandText);
                        currentOperandText = Float.toString(operand1 - operand2);
                        currentOperand.setText(currentOperandText);
                        prevOperand.setText("");
                    }
                    break;
                case "*":
                    if (currentOperandText.equals("")) {
                        currentOperand.setText(Float.toString(operand1));
                        operand1 = 0;
                        prevOperand.setText("");
                    } else {
                        operand2 = Float.parseFloat(currentOperandText);
                        currentOperandText = Float.toString(operand1 * operand2);
                        currentOperand.setText(currentOperandText);
                        prevOperand.setText("");
                    }
                    break;
                case "/":
                    if (currentOperandText.equals("")) {
                        currentOperand.setText(Float.toString(operand1));
                        operand1 = 0;
                        prevOperand.setText("");
                    } else {
                        operand2 = Float.parseFloat(currentOperandText);
                        currentOperandText = Float.toString(operand1 / operand2);
                        currentOperand.setText(currentOperandText);
                        prevOperand.setText("");
                    }
                    break;
                case "%":
                    if (currentOperandText.equals("")) {
                        currentOperand.setText(Float.toString(operand1));
                        operand1 = 0;
                        prevOperand.setText("");
                    } else {
                        operand2 = Float.parseFloat(currentOperandText);
                        currentOperandText = Float.toString(operand1 % operand2);
                        currentOperand.setText(currentOperandText);
                        prevOperand.setText("");
                    }
                    break;
            }
            if(isPointEmpty){
               isPointEmpty = !isPointEmpty;
            }
        }
    }
}