/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Lucas", 1000);
        try {
            cuenta.depositar(-50);
        }
        catch(DepositoInvalidoException e){
            System.out.println(
                    "Cantidad invalida: $" + (e.getCantidadInvalida())
                    + " Ingresar un valor positivo"
            );
        }
        
        try {
            cuenta.extraer(1200);
        }
        catch(ExtraccionInvalidaException e){
            System.out.println(
                    "Cant invalida: " + e.getDato().getExtraccion_solicitada() + 
                    " Saldo solo permite retirar hasta $" + e.getDato().getSaldo()
            );
        }
        
    }
}
