public class Persona{

private string nombre;
private double altura;
private double peso;
private int edad;



public Persona (string nombre,double altura,double peso , int edad){

this.nombre = nombre;
this.altura = altura;
this.peso = peso;
this.edad = edad;

}

public void  caminar (){

System.out.println("caminando");




}

public string IMC(){

double indice = peso /(altura*altura);

string msg ="IMC"+indice;
return msg;






}

public string mayorEdad(int edad){

string msg="";

if(edad >=18){

    msg="mayor de edad ";
}else {

msg ="menor de edad ";
     
}

return msg;


}




}



}