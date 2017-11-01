/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB02
 */
public class Nomina
{
  public static void main(String[] args)
  {
      int sueldo=0;
      int horas=0;
      int valor_hora=0;
      
       
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        
         valor_hora=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor por horas trabajadas"));
         
         sueldo=horas*valor_hora;
         
          JOptionPane.showMessageDialog(null, "su sueldo segun las horas trabajadas es: "+sueldo);
  }
}
