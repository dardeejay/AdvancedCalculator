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
    @FXML
    private Button SQR;
    @FXML
    private Button POW;
    @FXML
    private Button SQRT;
    @FXML
    private Button CBRT;
    @FXML
    private Button LOGX;
    @FXML
    private Button LOG2X;
    @FXML
    private Button COS;
    @FXML
    private Button TAN;
    @FXML
    private Button SIN;
    @FXML
    private Button PI;
    @FXML
    private Button EBTN;
    @FXML
    private Button FACTORIAL;

    private String currentOperandText = "";
    private float operand1 = 0 ;
    private float operand2;
    private String operator = "";
    private boolean isPointEmpty = true;
    private boolean disableOperator = false;
    private String Function;
    private float factorial(float n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
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
        else if(event.getSource() == PI){
            currentOperandText += Math.PI;
            currentOperand.setText(currentOperandText);
        }
        else if(event.getSource() == EBTN){
            currentOperandText += Math.E;
            currentOperand.setText(currentOperandText);
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
            disableOperator = false;
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
                Function ="";
                disableOperator = false;
                isPointEmpty = true;
            }
        }

        else if(event.getSource() == FLOOR){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "Floor(";
                currentOperand.setText(currentOperandText);
                Function = "FLOOR";
            }
        }
        else if(event.getSource() == CEIL){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "Ceil(";
                currentOperand.setText(currentOperandText);
                Function = "CEIL";
            }
        }
        else if(event.getSource() == SQR){
            if(!disableOperator){
                if(!currentOperandText.equals("")){
                    operand1 = Float.parseFloat(currentOperandText);
                    currentOperandText += "^2";
                    currentOperand.setText(currentOperandText);
                    operand2 = 2;
                    disableOperator = !disableOperator;
                    Function = "SQR";
                }
            }
        }
        else if(event.getSource() == SQRT){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "√";
                currentOperand.setText(currentOperandText);
                Function = "SQRT";
            }
        }
        else if(event.getSource() == CBRT){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "3√";
                currentOperand.setText(currentOperandText);
                Function = "CBRT";
            }
        }
        else if(event.getSource() == LOGX){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "log(";
                currentOperand.setText(currentOperandText);
                Function = "LOGX";
            }
        }
        else if(event.getSource() == LOG2X){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "log2(";
                currentOperand.setText(currentOperandText);
                Function = "LOG2X";
            }
        }
        else if(event.getSource() == COS){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "cos(";
                currentOperand.setText(currentOperandText);
                Function = "COS";
            }
        }
        else if(event.getSource() == TAN){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "tan(";
                currentOperand.setText(currentOperandText);
                Function = "TAN";
            }
        }
        else if(event.getSource() == SIN){
            if(currentOperandText.equals("")){
                disableOperator = !disableOperator;
                currentOperandText += "sin(";
                currentOperand.setText(currentOperandText);
                Function = "SIN";
            }
        }
        else if(event.getSource() == FACTORIAL){
            if(!disableOperator){
                if(!currentOperandText.equals("")){
                    disableOperator = !disableOperator;
                    currentOperandText += "!";
                    currentOperand.setText(currentOperandText);
                    Function = "FACTORIAL";
                }
            }
        }
    }
    @FXML
    protected void operatorButtons(ActionEvent event){
        if(!disableOperator){
            if(event.getSource() == ADD){
                if(operator.equals("")){
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
                else{
                    operator ="+";
                    prevOperand.setText((prevOperand.getText().substring(0, prevOperand.getText().length()-1))+operator);
                }

            }
            else if(event.getSource() == MINUS){
                if(operator.equals("")){
                    operand1 = Float.parseFloat(currentOperandText);
                    currentOperandText += "-";
                    prevOperand.setText(currentOperandText);
                    currentOperandText = "";
                    currentOperand.setText(currentOperandText);
                    operator = "-";
                    if(!isPointEmpty){
                        isPointEmpty = true;
                    }
                }else{
                    operator ="-";
                    prevOperand.setText((prevOperand.getText().substring(0, prevOperand.getText().length()-1))+operator);
                }
            }
            else if(event.getSource() == MULTIPLY){
               if(operator.equals("")){
                   operand1 = Float.parseFloat(currentOperandText);
                   currentOperandText += "*";
                   prevOperand.setText(currentOperandText);
                   currentOperandText = "";
                   currentOperand.setText(currentOperandText);
                   operator = "*";
                   if(!isPointEmpty){
                       isPointEmpty = true;
                   }
               }else{
                   operator ="*";
                   prevOperand.setText((prevOperand.getText().substring(0, prevOperand.getText().length()-1))+operator);
               }
            }
            else if(event.getSource() == DIVIDE){
                if(operator.equals("")){
                    operand1 = Float.parseFloat(currentOperandText);
                    currentOperandText += "/";
                    prevOperand.setText(currentOperandText);
                    currentOperandText = "";
                    currentOperand.setText(currentOperandText);
                    operator = "/";
                    if(!isPointEmpty){
                        isPointEmpty = true;
                    }
                }else{
                    operator ="/";
                    prevOperand.setText((prevOperand.getText().substring(0, prevOperand.getText().length()-1))+operator);
                }
            }
            else if(event.getSource() == MODULO){
                if(operator.equals("")){
                    operand1 = Float.parseFloat(currentOperandText);
                    currentOperandText += "%";
                    prevOperand.setText(currentOperandText);
                    currentOperandText = "";
                    currentOperand.setText(currentOperandText);
                    operator = "%";
                    if(!isPointEmpty){
                        isPointEmpty = true;
                    }
                }else{
                    operator ="%";
                    prevOperand.setText((prevOperand.getText().substring(0, prevOperand.getText().length()-1))+operator);

                }
            }
            else if(event.getSource() == POW){
                if(operator.equals("")){
                    operand1 = Float.parseFloat(currentOperandText);
                    currentOperandText += "^";
                    prevOperand.setText(currentOperandText);
                    currentOperandText = "";
                    currentOperand.setText(currentOperandText);
                    operator = "^";
                    if(!isPointEmpty){
                        isPointEmpty = true;
                    }
                }else{
                    operator ="^";
                    prevOperand.setText((prevOperand.getText().substring(0, prevOperand.getText().length()-1))+operator);

                }
            }
        }
        if(event.getSource() == EQUALS){

            if(!disableOperator){
                if(operator.equals("")){
                    currentOperand.setText(currentOperandText);
                }
                switch (operator) {
                    case "+":
                        if (currentOperandText.equals("")) {
                            currentOperandText = Float.toString(operand1);
                            currentOperand.setText(currentOperandText);
                            operand1 = 0;
                            operator = "";
                            prevOperand.setText("");
                        } else {
                            operand2 = Float.parseFloat(currentOperandText);
                            currentOperandText = Float.toString(operand1 + operand2);
                            currentOperand.setText(currentOperandText);
                            operator = "";
                            prevOperand.setText("");
                        }
                        break;
                    case "-":
                        if (currentOperandText.equals("")) {
                            currentOperandText = Float.toString(operand1);
                            currentOperand.setText(currentOperandText);
                            operand1 = 0;
                            operator = "";
                            prevOperand.setText("");
                        } else {
                            operand2 = Float.parseFloat(currentOperandText);
                            currentOperandText = Float.toString(operand1 - operand2);
                            currentOperand.setText(currentOperandText);
                            operator = "";
                            prevOperand.setText("");
                        }
                        break;
                    case "*":
                        if (currentOperandText.equals("")) {
                            currentOperandText = Float.toString(operand1);
                            currentOperand.setText(currentOperandText);
                            operand1 = 0;
                            operator = "";
                            prevOperand.setText("");
                        } else {
                            operand2 = Float.parseFloat(currentOperandText);
                            currentOperandText = Float.toString(operand1 * operand2);
                            currentOperand.setText(currentOperandText);
                            operator = "";
                            prevOperand.setText("");
                        }
                        break;
                    case "/":
                        if (currentOperandText.equals("")) {
                            currentOperandText = Float.toString(operand1);
                            currentOperand.setText(currentOperandText);
                            operand1 = 0;
                            operator = "";
                            prevOperand.setText("");
                        } else {
                            operand2 = Float.parseFloat(currentOperandText);
                            currentOperandText = Float.toString(operand1 / operand2);
                            currentOperand.setText(currentOperandText);
                            operator = "";
                            prevOperand.setText("");
                        }
                        break;
                    case "%":
                        if (currentOperandText.equals("")) {
                            currentOperandText = Float.toString(operand1);
                            currentOperand.setText(currentOperandText);
                            operand1 = 0;
                            operator = "";
                            prevOperand.setText("");
                        } else {
                            operand2 = Float.parseFloat(currentOperandText);
                            currentOperandText = Float.toString(operand1 % operand2);
                            currentOperand.setText(currentOperandText);
                            operator = "";
                            prevOperand.setText("");
                        }
                        break;
                    case "^":
                        if (currentOperandText.equals("")) {
                            currentOperandText = Float.toString(operand1);
                            currentOperand.setText(currentOperandText);
                            operand1 = 0;
                            operator = "";
                            prevOperand.setText("");
                        } else {
                            operand2 = Float.parseFloat(currentOperandText);
                            currentOperandText = Float.toString((float) Math.pow(operand1, operand2));
                            currentOperand.setText(currentOperandText);
                            operator = "";
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
                    prevOperand.setText(currentOperandText+")");
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.floor(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("CEIL")){
                    float num1 = Float.parseFloat(currentOperandText.substring(5));
                    prevOperand.setText(currentOperandText+")");
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.ceil(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("SQR")){
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.pow(operand1, operand2));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("SQRT")){
                    float num1 = Float.parseFloat(currentOperandText.substring(1));
                    prevOperand.setText(currentOperandText);
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.sqrt(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("CBRT")){
                    float num1 = Float.parseFloat(currentOperandText.substring(2));
                    prevOperand.setText(currentOperandText);
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.cbrt(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("LOGX")){
                    float num1 = Float.parseFloat(currentOperandText.substring(4));
                    prevOperand.setText(currentOperandText+")");
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.log(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("LOG2X")){
                    float num1 = Float.parseFloat(currentOperandText.substring(5));
                    prevOperand.setText(currentOperandText+")");
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) (Math.log(num1)/Math.log(2)));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("COS")){
                    float num1 = Float.parseFloat(currentOperandText.substring(4));
                    prevOperand.setText(currentOperandText+")");
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.cos(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("TAN")){
                    float num1 = Float.parseFloat(currentOperandText.substring(4));
                    prevOperand.setText(currentOperandText+")");
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.tan(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("SIN")){
                    float num1 = Float.parseFloat(currentOperandText.substring(4));
                    prevOperand.setText(currentOperandText+")");
                    currentOperandText = "";
                    currentOperandText = Float.toString((float) Math.sin(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
                else if(Function.equalsIgnoreCase("FACTORIAL")){
                    float num1 = Float.parseFloat(currentOperandText.substring(0, currentOperandText.length()-1));
                    prevOperand.setText(currentOperandText);
                    currentOperandText = "";
                    currentOperandText = Float.toString(factorial(num1));
                    currentOperand.setText(currentOperandText);
                    Function = "";
                    disableOperator = !disableOperator;
                }
            }
        }
    }
}