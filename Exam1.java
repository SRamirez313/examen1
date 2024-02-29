
package exam1;

import javax.swing.JOptionPane;

class cliente{
            String nombre;
            String id;
            
            cliente(String nombre, String id){
                this.nombre = nombre;
                this.id = id;
            }
        }
        
        class factura{
            cliente Cliente;
            String codigo;
            double monto;
            int mes;
            int año;
               
            factura(cliente Cliente, String codigo, double monto,int mes,int año){
                this.Cliente = Cliente;
                this.año = año;
                this.codigo = codigo;
                this.mes = mes;
                this.monto = monto;
               
            }
        }
public class Exam1 {

    
    public static void main(String[] args) {
        //agregar el cleinte
        String nombreCliente = JOptionPane.showInputDialog("ingrese el nombre del cliente: ");
        String idCliente = JOptionPane.showInputDialog("ingrese el id del cliente: ");
        cliente Cliente = new cliente(nombreCliente, idCliente);
        //agregar factura
        String codigoFactura = JOptionPane.showInputDialog("ingrese el codigo de la factura: ");
        double montoFactura1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto de la factura uno"));
        double montoFactura2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto de la factura dos"));
        double montoFactura3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto de la factura tres"));
        double montoFactura4 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto de la factura cuatro"));
        int mesFactura = Integer.parseInt(JOptionPane.showInputDialog("ingrese el mes de la factura"));
        int añoFactura = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año de la factura"));
        
        int resultado1 = 0;
        int resultado2 = 0;
        int resultado3 = 0;
        int resultado4 = 0;
        if (montoFactura1 >= 60000){
            resultado1 += (montoFactura1 * 0.15) / 4;
        }else{
            System.out.println(montoFactura1);
        }
        if (montoFactura2 >= 60000){
            resultado2 += (montoFactura2 * 0.15) / 4;
        }else{
            System.out.println(montoFactura2);    
        }
        if (montoFactura3 >= 60000){
            resultado3 += (montoFactura3 * 0.15) / 4;
        }else{
            System.out.println(montoFactura3);
        }
        if (montoFactura4 >= 60000){
            resultado4 += (montoFactura4 * 0.15) / 4;   
        }else{
            System.out.println(montoFactura4);    
        }
        System.out.println("total de factura 1 sin interes " + montoFactura1);
        System.out.println("cuota 1 con un total a pagar " + resultado1);
        System.out.println("total de factura 2 sin interes " + montoFactura2);
        System.out.println("cuota 2 con un total a pagar " + resultado2);
        System.out.println("total de factura 3 sin interes " + montoFactura3);
        System.out.println("cuota 3 con un total a pagar " + resultado3);
        System.out.println("total de factura 4 sin interes " + montoFactura4);
        System.out.println("cuota 4 con un total a pagar " + resultado4);
    }
    
}
