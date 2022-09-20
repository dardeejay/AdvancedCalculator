package com.act2a.advancedcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
public class CalculatorController {
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
    @FXML
    private Button FLOOR;
    @FXML
    private  Button CEIL;

    private String currentOperandText = "";
    private float operand1 = 0 ;
    private float operand2;
    private String operator;
    private boolean isPointEmpty = true;
    private boolean isFloorCeil = false;
    private String Function;
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
            Function ="";
            isFloorCeil = false;
            isPointEmpty = true;
        }
        else if(event.getSource() == DEL){
            if(!currentOperandText.equals("")) {
                char deletedChar = currentOperandText.charAt(currentOperandText.length()-1);
                currentOperandText = currentOperandText.substring(0, currentOperandText.length() - 1);
                currentOperand.setText(currentOperandText);
                if(deletedChar == '.'){
                    isPointEmpty = !isPointEmpty;
                }

            }
            if(currentOperandText.length()<1){
                currentOperandText ="";
                currentOperand.setText(currentOperandText);
                prevOperand.setText(currentOperandText);
                operator ="";
                operand1 = 0;
                operand2 = 0;
                Function ="";
                isFloorCeil = false;
                isPointEmpty = true;
            }
        }
        else if(event.getSource() == FLOOR){
            if(currentOperandText.equals("")){
                isFloorCeil = !isFloorCeil;
                currentOperandText += "Floor(";
                currentOperand.setText(currentOperandText);
                Function = "FLOOR";
            }
        }
        else if(event.getSource() == CEIL){
            if(currentOperandText.equals("")){
                isFloorCeil = !isFloorCeil;
                currentOperandText += "Ceil(";
                currentOperand.setText(currentOperandText);
                Function = "CEIL";
            }
        }
    }
    @FXML
    protected void operatorButtons(ActionEvent event){
        if(!isFloorCeil){
            if(event.getSource() == ADD){
                operand1 = Float.parseFloat(currentOperandText);
                currentOperandText += "+";
                prevOperand.setText(currentOperandText);
                currentOperandText = "";
                currentOperand.setText(currentOperandText);
                operator = "+";
                if(!isPointEmpty){
                    isPointEmpty = true;
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
                    isPointEmpty = true;
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
                    isPointEmpty = true;
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
                    isPointEmpty = true;
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
                    isPointEmpty = true;
                }
            }
        }
        if(event.getSource() == EQUALS){
            if(!isFloorCeil){
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
                    isPointEmpty = false;
                }
            }else{
                if(Function.equalsIgnoreCase("FLOOR")){
                    float num1 = Float.parseFloat(currentOperandText.substring(6));
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.floor(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    isFloorCeil = !isFloorCeil;
                }
                else if(Function.equalsIgnoreCase("CEIL")){
                    float num1 = Float.parseFloat(currentOperandText.substring(5));
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.ceil(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    isFloorCeil = !isFloorCeil;
                }
            }
        }
    }
}