import modelo.Pelicula;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        while(opcion != 9){
            String menu = """
                    Bienvenido a ScreenMatch
                    1) Registrar Nueva Pelicula
                    2) Registrar nueva Serie
                    
                    9) Salir
                    
                    
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese El nombre de la Película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese El año de lanzamiento de la Película");
                    int fechaDelanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese La duración en minutos de la Película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDelanzamiento);
                    peliculaUsuario.setDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 9 :
                    System.out.println("Saliendo Del Programa");
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
