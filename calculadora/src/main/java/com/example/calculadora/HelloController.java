package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label primero;

    @FXML
    private Button mas;

    String resultado = "";
    String op ="";


    @FXML
    protected void onUnoButtonClick() {
        resultado += "1";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void ondosButtonClick() {
        resultado += "2";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void ontresButtonClick() {
        resultado += "3";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void oncuatroButtonClick() {
        resultado += "4";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void oncincoButtonClick() {
        resultado += "5";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void onseisButtonClick() {
        resultado += "6";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void onsieteButtonClick() {
        resultado += "7";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void onochoButtonClick() {
        resultado += "8";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void onnueveButtonClick() {
        resultado += "9";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void onceroButtonClick() {
        resultado += "0";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void onborraButtonClick() {
        resultado = "";
        welcomeText.setText(resultado);
        primero.setText(resultado);
    }


    @FXML
    protected void onMasButtonClick() {
        op ="+";
        primero.setText(resultado);
        resultado="";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void onMenosButtonClick() {
        op ="-";
        primero.setText(resultado);
        resultado="";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void onPorButtonClick() {
        op ="*";
        primero.setText(resultado);
        resultado="";
        welcomeText.setText(resultado);
    }
    @FXML
    protected void onDivButtonClick() {
        op ="/";
        primero.setText(resultado);
        resultado="";
        welcomeText.setText(resultado);
    }

    @FXML
    protected void onRaizButtonClick() {
        resultado = String.valueOf(Math.sqrt(Double.parseDouble(welcomeText.getText())));
        welcomeText.setText(resultado);
    }

    @FXML
    protected void onIgualButtonClick() {



        int result = Integer.parseInt(primero.getText());
        if(op =="+"){
            result+= Integer.parseInt(welcomeText.getText());
        } else if (op == "-") {
            result-= Integer.parseInt(welcomeText.getText());

        }
        else if (op == "*") {
            result*= Integer.parseInt(welcomeText.getText());

        }
        else if (op == "/") {
            result/= Integer.parseInt(welcomeText.getText());

        }

        resultado= Integer.toString(result);
        welcomeText.setText(resultado);

        primero.setText("");

    }
}