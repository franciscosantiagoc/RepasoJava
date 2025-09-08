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

            Date fecha2 = new Date();

            if(fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es mayor que la fecha actual");
            }else if(fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es menor a la actual");
            }else if(fecha.equals(fecha2)) {
                System.out.println("Fechas son iguales");
            }

            
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
