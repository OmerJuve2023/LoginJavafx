package manejoServidores;

import java.io.IOException;

public class Servidores {
    static Runtime rt = Runtime.getRuntime();
    static Process pc;

    public static void apagado() {
        try {
            pc = rt.exec("cmd /c C:/Program Files/MySQL/MySQL Server 8.0/bin' -u root shutdown ");
            System.out.println("entro almenos");
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void encendido() {
        try {
            pc = rt.exec("cmd /c C:/Program Files/MySQL/MySQL Server 8.0/bin' -u root start");
        } catch (IOException e) {
            e.printStackTrace();
            e.getCause();
        }
        System.out.println("entro almenos");

    }
/*
    public static void main(String[] args) {
        apagado();
    }

 */
}
