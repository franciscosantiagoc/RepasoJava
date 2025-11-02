package com.francisco.repasojava.structure;

public class C18PropiedadesSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("Username: "+ username);

        String workDirectory = System.getProperty("user.dir");
        System.out.println("Workspace: "+ workDirectory);

        String java = System.getProperty("java.version");
        System.out.println("java: "+ java);
    }
}
