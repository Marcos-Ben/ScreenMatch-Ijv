package modelo;

public abstract class Titulo {
    private String nombre;
    private int DuracionEnMinutos;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnMinutos() {
        return DuracionEnMinutos;
    }

    public void setDuracionEnMinutos(int tiempoDuracionEnMinutos) {
        this.DuracionEnMinutos = tiempoDuracionEnMinutos;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion(){
        return evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public static void main(String[] args){
        String nombre;
        int fechaDeLanzamiento;
        double evaluacion;
        boolean incluidoEnElPlanBasico;
        String sinopsis;
        int DuracionEnMinutos;
        int duracionEnMinutosPorEpisodio;
    }
    public void muestraFichaTecnica() {
        System.out.println("****FICHA TECNICA****");
        System.out.println("Nombre Del Titulo: " +getNombre());
        System.out.println("Fecha De Lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Tiempo De Duración: " + getDuracionEnMinutos() + " minutos");
    }

}
