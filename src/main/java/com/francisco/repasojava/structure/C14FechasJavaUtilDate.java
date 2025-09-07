package com.francisco.repasojava.structure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C14FechasJavaUtilDate {
    public static void main(String[] args) {
        //instancia de libreria util para fechas
        Date fecha = new Date();
        System.out.println("Fecha actual: " + fecha);

        //formato 12hrs
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaFormat = format.format(fecha);

        //formato 24hrs
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String fechaFormat2 = format2.format(fecha);

        //formato nombre mes corto
        SimpleDateFormat format3 = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");
        String fechaFormat3 = format3.format(fecha);

        //formato nombre mes completo
        SimpleDateFormat format4 = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
        String fechaFormat4 = format4.format(fecha);

        //formato nombre del día de la semana y A.M o P.M
        SimpleDateFormat format5 = new SimpleDateFormat("EEEE dd/MMMM/yyyy hh:mm:ss a");
        String fechaFormat5 = format5.format(fecha);

        System.out.println("Fecha formateada: " + fechaFormat);
        System.out.println("Fecha formateada2: " + fechaFormat2);
        System.out.println("Fecha formateada3: " + fechaFormat3);
        System.out.println("Fecha formateada4: " + fechaFormat4);
        System.out.println("Fecha formateada5: " + fechaFormat5);

        long j = 0;
        for (int i=0; i<10000000; i++){
            j +=i;
        }
        System.out.println("Resultado final: " + j);

        Date fecha2 = new Date();
        long duracion = fecha2.getTime() - fecha.getTime();
        System.out.println("Duracion: " + duracion);
    }
}
