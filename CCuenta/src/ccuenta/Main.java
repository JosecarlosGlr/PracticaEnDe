/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccuenta;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usutarde
 */
public class Main {
    
    public static void main(String[] args){
        CCuenta miCuenta;
        double saldoActual;
        
        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2600,0);
        saldoActual = miCuenta.estado();

        
        try {
            miCuenta.retirar(2300);
        } catch (Exception ex) {
            System.out.println("Fallo al retirar");
        }
        

        try {
            miCuenta.ingresar(795);
        } catch (Exception ex) {
            System.out.println("Fallo al ingresar");
        }
    }
}
