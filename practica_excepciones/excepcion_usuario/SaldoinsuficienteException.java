/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion_usuario;


public class SaldoinsuficienteException extends Exception { 
    public SaldoinsuficienteException() { 
        super("Saldo insuficiente");
    } 
}
