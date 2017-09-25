/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeclass;


import java.net.URL;

import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sarbrinder dhillon
 */
public class ClockController implements Initializable {
     @FXML private TextField hoursTextField;
     @FXML private TextField minutesTextField;
     @FXML private TextField secondsTextField;
     @FXML private Button updateTimeButton;
     @FXML private Label militaryTime;
     @FXML private Label StandardTime;
     @FXML private Label ErrorMsgLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        this.militaryTime.setVisible(false);
//        this.StandardTime.setVisible(false);
        
        this.hoursTextField.setText("15");
        this.minutesTextField.setText("0");
        this.secondsTextField.setText("0");
        this.ErrorMsgLabel.setVisible(false);
        updateTimeLabels();
                
                
    }    
    public void updateTimeLabels(){
        try{
            TimeClass time = new TimeClass (Integer.parseInt(hoursTextField.getText()),
                                   Integer.parseInt(minutesTextField.getText()),
                                    Integer.parseInt(secondsTextField.getText()));
            this.militaryTime.setVisible(true);
            

            this.militaryTime.setText(time.toMilitaryTime());
            this.StandardTime.setVisible(true);
            this.StandardTime.setText(time.toStandardTime());
            this.ErrorMsgLabel.setVisible(false);
        }
        catch (IllegalArgumentException e){
            this.militaryTime.setVisible(false);
            this.StandardTime.setVisible(false);
            this.ErrorMsgLabel.setVisible(true);
            this.ErrorMsgLabel.setText(e.getMessage());
        }
    }
    
    
}
