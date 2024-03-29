package com.francisco.repasojava.structure;

import javax.swing.*;

public class MyThirdProgram {
    public static void main(String[] args) {
        //Obteniendo nombres y apellidos
        String name1 = JOptionPane.showInputDialog(null, "Ingresa el nombre completo de la persona 1");
        String name2 = JOptionPane.showInputDialog(null, "Ingresa el nombre completo de la persona 2");
        String name3 = JOptionPane.showInputDialog(null, "Ingresa el nombre completo de la persona 3");

        //Recuperando solo el primer nombre
        String firstName1 = name1.split(" ")[0];
        String firstName2 = name2.split(" ")[0];
        String firstName3 = name3.split(" ")[0];

        //Obteniendo el nombre mas largo
        String longName = firstName1.length() > firstName2.length() ? firstName1 : firstName2;
        longName = firstName3.length() > longName.length() ? firstName3 : longName;

        System.out.println("El nombre mas largo es: " + longName);
    }
}
