public class Ejecutar{


public static void main (String []args){   
     
  persona objp1 = new persona ("pipe",1.80,80,22);   
  
  objp1.caminar();
  
  String respuesta = objp1.IMC();
  
  System.out.println(respuesta);
  System.out.println(objp1.mayoredad(20));
 }
}