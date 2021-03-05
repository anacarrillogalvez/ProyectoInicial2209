/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

/**
 *
 * @author HP
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1= new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Ana Guadalupe");
        emp1.setApPaterno("Carrillo");
        emp1.setApMaterno("Galvez");
        emp1.setEdad(24);
        emp1.setCurp("CXGA000331MDFRLNA8");
        
        System.out.println("info:" + emp1 );
    }
}
