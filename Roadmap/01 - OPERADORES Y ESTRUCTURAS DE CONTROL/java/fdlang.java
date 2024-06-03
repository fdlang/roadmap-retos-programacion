public class fdlang {

    public void operadores_aritmeticos (int a, int b) {
        System.out.println("\n_____ Operadores aritmeticos _____\n");
        
        int result;
        result = a + b;

        System.out.println("La suma de " + a + " + " + b + " = " + (a + b));
        System.out.println("La resta de " + a + " - " + b + " = " + (a - b));
        System.out.println("La multiplicación de " + a + " * " + b + " = " + (a * b));
        System.out.println("La división de " + a + " / " + b + " = " + (a / b));
        System.out.println("El resto de " + a + " % " + b + " = " + (a % b));

        for (int i=0; i < 5; i++){
            result++;
        }
        System.out.println("se incrementa en 5 el resultado de la suma " + a + " + " + b + " = " + result);

        result = a + b;
        
        for (int i=0; i < 5; i++){
            result--;
        }
        System.out.println("se decrementa en 5 el resultado de la suma " + a + " + " + b + " = " + result);
    }

    public void operadores_logicos(boolean v, boolean f){
        System.out.println("\n_____Operadores lógicos_____\n");

        System.out.println("Operador &&: El resultado de comparar " + v + " con " + f + " es: " + (v && f));
        System.out.println("Operador ||: El resultado de comparar "+v+" con "+f+" es: " + (v || f ));
        System.out.println("Operador !: Invierte el valor booleano, !"+v+" = " + !v);
        System.out.println("Operador ^: Si uno de los operadores es true devuelve true: " + ( v ^ f));
    }

    public void operadores_comparacion(int a, int b){
        System.out.println("\n_____Operadores de Comparación_____\n");

        System.out.println("Mayor que: " + a + " > " + b + " = " + (a > b));
        System.out.println("Menor que: " + a + " < " + b + " = " + (a < b));
        System.out.println("Igual que: " + a + " == " + b + " = " + (a == b));
        System.out.println("Distinto que: " + a + " != " + b + " = " + (a != b));
    }

    public void operadores_asignacion(int a, String b){
        System.out.println("\n_____Operadores de Asignación_____\n");
        
        System.out.println("Asignación númerica: a = " + a);
        System.out.println("Asignación texto: b = " + b);
    }

    public static void main(String[] args) {
        fdlang operadores = new fdlang();

        operadores.operadores_aritmeticos (6,2);
        operadores.operadores_logicos(true, false);
        operadores.operadores_comparacion(5, 9);
        operadores.operadores_asignacion(5,"Hola, mundo.");

        try {
            int[] num = {54,25,4};
            System.out.println(num[5]);
        } catch (Exception e){
            System.out.println("\nUps ... sobrepasado longitud de array.\n");
        }

        System.out.println("Números comprendidos entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3:");

        for (int i=10; i<=55;i++){
            if((i % 2 == 0) && (i % 3 == 0)) {
                System.out.print(i + ", ");
            } 
        }
    }

}
