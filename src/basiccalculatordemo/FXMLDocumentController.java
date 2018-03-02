/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculatordemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ridoy
 */
public class FXMLDocumentController implements Initializable {
    
    private String oldText;
    private String newText;
    private Double num1;
    private Double num2;
    private String operation;
    
    @FXML
    private TextField displayField;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSevenAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "7";     
          
        } else {
            newText = oldText + "7";
        }
        displayField.setText(newText);
    }

    @FXML
    private void handleEightAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "8";     
          
        } else {
            newText = oldText + "8";
        }
        displayField.setText(newText);
    }

    @FXML
    private void handleNineAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "9";     
          
        } else {
            newText = oldText + "9";
        }
        displayField.setText(newText);
    }

    @FXML
    private void handleFourAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "4";     
          
        } else {
            newText = oldText + "4";
        }
        displayField.setText(newText);
    }

    @FXML
    private void handleFiveAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "5";     
          
        } else {
            newText = oldText + "5";
        }
        displayField.setText(newText);
    }


    @FXML
    private void handleOneAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "1";     
          
        } else {
            newText = oldText + "1";
        }
        displayField.setText(newText);
    }

    @FXML
    private void handleTwoAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "2";     
          
        } else {
            newText = oldText + "2";
        }
        displayField.setText(newText);
    }

    @FXML
    private void handleThreeAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "3";     
          
        } else {
            newText = oldText + "3";
        }
        displayField.setText(newText);
    }


    @FXML
    private void handleZeroAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
             newText = "0";     
          
        } else {
            newText = oldText + "0";
        }
        displayField.setText(newText);
        
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
        oldText = displayField.getText();
        num2 = Double.parseDouble(oldText);
        switch(operation){
            case "+":
                num2 = num1 + num2;
                break;
            case "-":
                num2 = num1 - num2;
                break;
            case "*":
                num2 = num1 * num2;
                break;
            case "/":
                num2 = num1 / num2;
                break;
            default:
                break;          
        }
        displayField.setText(""+num2);
    }

    
    @FXML
    private void handleClearAllAction(ActionEvent event) {
        displayField.setText("");
    }

    @FXML
    private void handleSixAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.startsWith("0")){
            newText= "6";
           
        } else {
              newText = oldText + "6";
        }
        displayField.setText(newText);
    }

    @FXML
    private void handleDotAction(ActionEvent event) {
        oldText = displayField.getText();
        
        
        if(!oldText.contains(".")){
            newText= oldText + ".";
        }
        else {
            newText = oldText;
         }
        displayField.setText(newText);
    }

    @FXML
    private void handleOperatorAction(ActionEvent event) {
        oldText = displayField.getText();
        num1 = Double.parseDouble(oldText);
        displayField.setText("");
        operation = ((Button)event.getSource()).getText(); 
    }

    @FXML
    private void handleSquareRootAction(ActionEvent event) {
       oldText =  displayField.getText();
       num1 = Double.parseDouble(oldText);
       double result = Math.sqrt(num1);
       
       displayField.setText(""+result);
    }

    @FXML
    private void handleSquareAction(ActionEvent event) {
        oldText =  displayField.getText();
        num1 = Double.parseDouble(oldText);
        double result = Math.pow(num1,2);

        displayField.setText(""+result);
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        oldText = displayField.getText();
        
        if(oldText.length() > 0){
            newText = oldText.substring(0,oldText.length()-1);
            
            displayField.setText(newText);
        }else{
            displayField.setText("0");
        }
    }

}
