/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion_usuario;

/**
 *
 * @author eperez50
 */
public class Cuenta {
    private double saldo; 
    public Cuenta(){ 
        saldo=0;
    } 
    public void depositar(double monto){ 
        System.out.println("Depositando " + monto);
         saldo += monto; 
    }
 
    public void retirar(double monto) throws SaldoinsuficienteException { 
        System.out.println("Retirando " + monto);
        if(saldo < monto) {
            throw new SaldoinsuficienteException();
        }
        else {
            saldo -= monto;
        }
    }
    
    public double getSaldo() { 
        return saldo;
    }
} 
