package com.francisco.repasojava.structure;

import java.util.Map;

public class C20VariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema =" + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("Username: " + username);

        String path = System.getenv("Path");
        System.out.println("Path: " + path);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("Java Home: " + javaHome);

        String javaHome2 = varEnv.get("JAVA_HOME");
        System.out.println("Java Home2: " + javaHome2);
    }
}
