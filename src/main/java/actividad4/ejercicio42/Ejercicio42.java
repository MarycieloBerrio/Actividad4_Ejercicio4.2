/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad4.ejercicio42;

public class Ejercicio42 {

    public static void main(String[] args) {
        
        ApartamentoFamiliar apto1 = new       
            ApartamentoFamiliar(103067,120, "Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(apto1.valorArea);
        apto1.imprimir();
        
        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new      
            Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
        aptestudio1.imprimir();
        
    }
}
