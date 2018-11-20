/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadojuego;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Jugador {
    private int partidas_ganadas;
    private String nombre;
    private String palabraSecreta;

    public Jugador() {
        partidas_ganadas = 0;
        nombre = "";
        palabraSecreta = "";
    }

    public int getPartidas_ganadas() {
        return partidas_ganadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPartidas_ganadas(int partidas_ganadas) {
        this.partidas_ganadas = partidas_ganadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public boolean ganador(){
        boolean gana;
        
        gana = this.partidas_ganadas == 3;
        
        return gana;
    }
    
    public void introducir_palabra(){
        Scanner sc = new Scanner(System.in);
        String palabraAdivinar;
        
        System.out.println("Introduce una palabra a adivinar: ");
        palabraAdivinar = sc.nextLine();
        this.palabraSecreta = palabraAdivinar;
    }
    
    public char introducir_letra(){
        Scanner sc = new Scanner(System.in);
        char letra;
        
        System.out.println("Introduce una letra: ");
        letra = sc.next().charAt(0);
        
        return letra;
    }
    
}
