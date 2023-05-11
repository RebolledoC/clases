package com.example.generadorcont;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HelloController{
    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtField;
    char[] lista = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x',
            'y','z'};


    String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    static String cadena = "";

    public static String cadenaAleatoria(int longitud) {
        // El banco de caracteres
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~$*+-?¿";
        // La cadena en donde iremos agregando un carácter aleatorio
        
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    private static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }


    @FXML
    public void ongenerarButtonClick(){
        int longitud = Integer.parseInt(txtField.getText());
        cadena = cadenaAleatoria(longitud);
        welcomeText.setText(cadena);
        cadena="";
    }
}