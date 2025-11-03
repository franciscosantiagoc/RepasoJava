package com.francisco.repasojava.structure;

import java.io.FileInputStream;
import java.util.Properties;

public class C19AsignacionPropiedadesSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/main/java/com/francisco/repasojava/structure/config.properties");
            System.out.println("archivo encontrado");
            Properties properties = new Properties(System.getProperties());
            properties.load(archivo);

            //actualizando propiedades
            System.setProperties(properties);
            Properties ps = System.getProperties();

            //imprimiendo propiedades del sistema
            System.out.println("Puerto personalizado: " + System.getProperty("puerto.personalizado"));
            System.out.println("Puerto personalizado: " + System.getProperty("host.personalizado"));
            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("error = " + e);
        }
    }
}
