package com.francisco.repasojava.structure;

/**
 * Las clases Wrapper también conocidas como envoltorio, proveen o extienden un tipo de dato
 * primitivo en una clase, para así tratarlos como si fueran objetos con la implementación de nuevas métodos
 * útiles extras dentro de la clase envoltorio
 */
public class C12ClasesWrappers {
    public static void main(String[] args) {
        //byte
        Byte varByte = 12;
        //short
        Short varShort = 128;
        //int
        Integer varInt = 1234;
        //long
        Long varLong = 149L;
        //boolean
        Boolean varBool = false;
        //float
        Float varFloat = 0.5f;
        //double
        Double varDouble = 0.5;
        //char
        Character varChar = 'f';



        System.out.println(Integer.parseInt("2595345"));

        System.out.println("Min byte: " + Byte.MIN_VALUE);
        System.out.println("Max byte: " + Byte.MAX_VALUE);

        System.out.println("\nMin integer: " + Integer.MIN_VALUE);
        System.out.println("Max integer: " + Integer.MAX_VALUE);

        System.out.println("\nMin long: " + Long.MIN_VALUE);
        System.out.println("Max long: " + Long.MAX_VALUE);

        System.out.println("\nMin float: " + Float.MIN_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);

        System.out.println("\nMin double: " + Double.MIN_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);

        System.out.println("\nDecimal: "+ 10 + " = binary: " + Integer.toBinaryString(10));
        System.out.println("\nDecimal: "+ 10 + " = octal: " + Integer.toString(10, 8));
    }
}
