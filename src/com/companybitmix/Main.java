package com.companybitmix;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana("inicio Sesion") ;
        ventana.insertarNombre("pepito");
        ventana.insertarPassword("1234");
        boolean respuesta = ventana.validar();

        if(respuesta){
            System.out.println("bienvenido");
        }
        else{
            System.out.println("error");
        }
    }
}
