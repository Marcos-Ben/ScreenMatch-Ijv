import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Pelicula Matrix");
        //declaracion de variables
        int fechaDeLanzamiento = 1999;
        double  evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
         matrix la mejor pelicula del fin del milenio """;
        double mediaEvaluacionUsuario = 0;
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println("Evaluacion de Matrix: " +  mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular del momento");
        }else {
            System.out.println("Pelicula retro que vale la pena ver");
        }
        int contador = 0;

        while(contador < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario += notaMatrix;
            contador++;
        }
        System.out.println("La media de la pelicula matrix calculada por el usuario es: " + mediaEvaluacionUsuario/3);
}
}