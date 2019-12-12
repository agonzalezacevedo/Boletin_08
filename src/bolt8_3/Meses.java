package bolt8_3;
//@author agonzalezacevedo

import java.util.Scanner;

public class Meses {
    Scanner sc= new Scanner(System.in);
    private String mes;
    private int dias;
    private int eleccion;
    private int a;
   
    public void darMes(){
        System.out.println("Dime el numero de un mes: ");
        eleccion = sc.nextInt();
     switch(eleccion){
         case 1: mes="Enero";dias=31;a=1;break;
         case 2: mes="Febrero";dias=28;a=1;break;
         case 3: mes="Marzo";dias=31;a=1;break;
         case 4: mes="Abril";dias=30;a=1;break;
         case 5: mes="Mayo";dias=31;a=1;break;
         case 6: mes="Junio";dias=30;a=1;break;
         case 7: mes="Julio";dias=31;a=1;break;
         case 8: mes="Agosto";dias=31;a=1;break;
         case 9: mes="Septiembre";dias=30;a=1;break;
         case 10: mes="Octubre";dias=31;a=1;break;
         case 11: mes="Noviembre";dias=30;a=1;break;
         case 12: mes="Diciembre";dias=31;a=1;break;
         default: System.out.println("ERROR, ese valor no se corresponde con ningun mes");
         }
      if(a==1){
          System.out.println(mes+" tiene "+dias);
      }
        
     
}
    
    
    
    
    
    
    
}
