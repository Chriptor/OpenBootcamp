/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.openbootcamp;

/**
 *
 * @author chr_i
 */
class coche{
int puertas=0;

    public coche() {
    }
   
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public void incrementarPuertas(int puertas){
        this.puertas=puertas+1; 
    }
}
public class OpenBootcamp {
static int suma(int x, int y, int z) {
    return x + y + z;
  }
    public static void main(String[] args) {
        System.out.println("Sumando con funcion 10+20+30 = " + suma(10,20,30));
        coche bmw= new coche();
        System.out.println("Actualmente bmw tiene " + bmw.getPuertas() + " puertas");
        System.out.println("Se llama la funcion ");
        bmw.incrementarPuertas(bmw.getPuertas());
        System.out.println("Actualmente bmw tiene " + bmw.getPuertas() + " puertas");
    }
}
