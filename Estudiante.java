import java.util.Scanner;
public class Estudiante {
    private String nombre;
    private double n1;
    private double n2;
    private double n3;
    private double proyecto;

    public Estudiante(String nombre, double n1, double n2, double n3, double proyecto){
        this.nombre = nombre;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.proyecto = proyecto;
    }
    public Estudiante(){

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getn1(){
        return n1;
    }
    public void setn1(double n1){
        this.n1 = (n1 >= 0 && n1 <=100) ? n1 : 0;
    }
     public double getn2(){
        return n2;
    }
    public void setn2(double n2){
        this.n2 = (n2 >= 0 && n2 <=100) ? n2 : 0;
    }
     public double getn3(){
        return n3;
    }
    public void setn3(double n3){
        this.n3 = (n3 >= 0 && n3 <=100) ? n3 : 0;
    }
    public double getproyecto(){
        return proyecto;
    }
    public void setproyecto(double proyecto){
        this.proyecto = proyecto;
    }
    public double calcularNotaFinal(){
        double promedio = (n1 + n2 + n3)/3.0; 
        double notafinal = (promedio*0.70) + (this.proyecto * 0.30);
        return notafinal;
    }
        public String obtenerEstado(){
            double nota = calcularNotaFinal();
        if (nota >=90){
            return "Excelente";
        } else if (nota >=70){
            return "Aprobado";
        } else if (nota <=60){
            return "En recuperacion";
        } else {
            return "Reprobado";
        }
    }
    public String toString(){
       System.out.println("Estudiante: " +nombre+ " | Nota Final: " + notafinal+ " |Estado: " +nota); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de estudiantes");
        int n = sc.nextInt();

    
        for (int i = 0; i<n; i++){
            System.out.println("Ingrese su nombre: " +nombre);
        }
    }
}
