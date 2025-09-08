package com.francisco.repasojava.structure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class C17CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Calendar calendarHoy = Calendar.getInstance();
            calendarHoy.setTime(new Date());

            System.out.println("Ingresa la fecha de nacimiento(dd-mm-yyyy)");
            Date fechaNacimiento = format.parse(scanner.nextLine());
            Calendar calendarNacimiento = Calendar.getInstance();
            calendarNacimiento.setTime(fechaNacimiento);

            int edad = calendarHoy.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
            System.out.println("Tu edad es: " + edad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
