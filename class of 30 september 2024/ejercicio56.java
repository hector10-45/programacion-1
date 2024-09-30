import java.util.Scanner;

public class ejercicio56 {

    public static void main(String[] args) {

        // codigo 5.6
        Scanner leer = new Scanner(System.in);
        int cantidad;
        int estudiantes;
        double nota = 0.0;
        double promedio;
        int aprobados = 0;
        int reprobados = 0;

        System.out.print("digite la cantidad de estudantes ");
        estudiantes = leer.nextInt();

        for (int i = 1; i <= estudiantes; i++) {

            System.out.print("nota del estudante   " + i+ " :  ");
            nota = leer.nextDouble();

            if (nota >= 5.0) {

                aprobados++;

            } else {
                reprobados++;
            }

        }

        System.out.print(" aprobaos :   " + aprobados + "   los reprobados son :   " + reprobados);
    }

}
