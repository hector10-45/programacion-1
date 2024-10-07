public class actitidad3 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = true;

        if (!a && (b && c)) {
            System.out.println("sentencia if ejecutada");

        } else {
            System.out.println(" sentencia else ejecutada");
        }
        // ejerciccio2
        {

            System.out.println("");
            int mark = 80;
            if (mark > 70) {

                System.out.println("distincion ");
            }
            if (mark > 35) {

                System.out.println("pass ");
            } else
                System.out.println("fail ");
            System.out.println("better luck next time");

        }
        // ejercicio 3
        {
            System.out.println("");
            int india_score = 300, pakistan_score = 290;

            if (india_score > pakistan_score) {
                System.out.println("india wins");

            } else {
                System.out.println("pakistan  wins");
            }

        }

        // con OPERADOR TERNARIO ? (ejercicio 3)
        System.out.println("");
        int india_score = 100;
        int pakistan_score = 290;

        System.out.println(india_score > pakistan_score ? "india  wins" : "pakistan wins");

        // EJERCISIO 4
        {
            System.out.println("");
            int C = 7 * 3 + 6 / 2 - 5;
            int d = 21 - 8 + C % 3 * 11;

            if (C < d) {
                System.out.println("a is les than b ");
            }
            if (C == d) {
                System.out.println("a is equals to b");
            }
            if (C > d) {
                System.out.println("a is than grader than b");
            }

        }

    }

}
