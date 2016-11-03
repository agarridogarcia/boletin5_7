
package boletin5_7;

import javax.swing.JOptionPane;


public class Opcion {
   
    
  
    public Opcion (){      
        
    }
    public void opcions (){
        
        System.out.println("cuadrado\n triangulo \n circulo" );   
        String opcion=JOptionPane.showInputDialog("Elixe opción: ");
        opcion = opcion.toLowerCase();//para pasar todo a minúsculas
        switch(opcion)  {
            
            case "cuadrado":
                float lado=Float.parseFloat(JOptionPane.showInputDialog ("Introduzca o lado do cuadrado "));
                JOptionPane.showInputDialog("Area do cuadrado: " + (lado*lado));
            break;
            case "triangulo": 
                float base=Float.parseFloat(JOptionPane.showInputDialog("Introduzca o lado do triángulo: "));
                float altura=Float.parseFloat(JOptionPane.showInputDialog ("Introduzca a altura do triángulo: "));
                JOptionPane.showInputDialog("Area do triangulo: " + (base*altura));
                break;
            case "circulo": 
                float radio=Float.parseFloat(JOptionPane.showInputDialog("Introduzca o radio do círculo: "));
                System.out.println (Math.PI*Math.pow(radio, 2));
                break;
                default: System.out.println("Fora de rango");
                
            
            
            
            
            
            
            
            
            
        }     
      
    }
    public void elixirOpcion(){
        
    }
    
}
