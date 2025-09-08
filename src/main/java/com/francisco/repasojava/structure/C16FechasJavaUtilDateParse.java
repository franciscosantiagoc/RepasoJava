package com.francisco.repasojava.structure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C16FechasJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.println("Ingrese una fecha 'dd-mm-yyyy': ");
            //Date fecha = format.parse("2025-09-07");
            Date fecha = format.parse(scanner.nextLine());
            System.out.println("fecha: " + fecha);
            System.out.println("fecha format: " + format.format(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
