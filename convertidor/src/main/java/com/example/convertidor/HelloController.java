package com.example.convertidor;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label primero;

    @FXML
    private CheckBox pies;
    @FXML
    private CheckBox kilomtros;
    @FXML
    private CheckBox centi;
    @FXML
    private CheckBox yar;
    @FXML
    private CheckBox pie;
    @FXML
    private CheckBox pulgadas;





    String resultado = "";



    @FXML
    protected void on1ButtonClick() {
        resultado += "1";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on2ButtonClick() {
        resultado += "2";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on3ButtonClick() {
        resultado += "3";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on4ButtonClick() {
        resultado += "4";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on5ButtonClick() {
        resultado += "5";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on6ButtonClick() {
        resultado += "6";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on7ButtonClick() {
        resultado += "7";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on8ButtonClick() {
        resultado += "8";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on9ButtonClick() {
        resultado += "9";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void on0ButtonClick() {
        resultado += "0";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void oncButtonClick() {
        resultado = "";
        welcomeText.setText(resultado);
        primero.setText(resultado);
    }



    @FXML
    protected void onIgualButtonClick() {
        Double result;
        Double num = Double.valueOf(resultado);
        if (pies.isSelected()) {
            result= (num*5/9)+32;
        } else {
            result = (num-32)*5/9;

        }
        if(kilomtros.isSelected()){
            result= (num*1.609);
        }
        if(centi.isSelected()){
            result= (num*10);
        }
        if(yar.isSelected()){
            result= (num/1760);
        }
        if(pie.isSelected()){
            result= (num/ 3.281);
        }
        if(pulgadas.isSelected()){
            result= (num* 25.4);
        }
        welcomeText.setText(String.valueOf(result));
    }


    @FXML
    protected void pies() {
/*
        int result = Integer.parseInt(primero.getText());
        if (op == "+") {
            result += Integer.parseInt(welcomeText.getText());
        } else if (op == "-") {
            result -= Integer.parseInt(welcomeText.getText());

        }*/
    }
}