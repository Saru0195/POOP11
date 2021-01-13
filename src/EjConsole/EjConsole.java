/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjConsole;

import java.io.Console;

/**
 * Clase con utilizacion de consola
 * @author Sarahi
 */
public class EjConsole {
    /**
     * 
     * @param args Utilizacion de consola para hacer entrada de usuario 
     */
    public static void main(String[] args) {
        
        Console console = System.console();
        System.out.println("Usuario: ");
        String usuario = console.readLine();
        System.out.println(usuario);
    }
}
