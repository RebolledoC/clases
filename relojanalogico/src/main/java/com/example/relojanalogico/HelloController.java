package com.example.relojanalogico;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
import java.util.Date;


        public static void main(String[] args) {
            date date = new Date();

            System.out.println(date);        // Dom 24 de diciembre 16:34:27 PDT 2017
        }
    }
}