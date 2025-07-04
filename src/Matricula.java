import java.util.Scanner;

public class Matricula {
    public static String nombre;
   public static float nota1f,nota2f,nota3f;
    public static void main(String[] args) throws Exception {
        var Entrada = new Scanner(System.in);
        mostrarMenu(Entrada);
        Entrada.close();
    }

    private static void mostrarMenu(Scanner Entrada) {
        int opc;
        do{
        System.out.println("--- Sistema de Registro de Estudiantes ---");
        System.out.println("---------------------------------------------");
        System.out.print("""
1. Registrar datos de un estudiante
2. Mostrar datos del estudiante actual
3. Calcular promedio de notas del estudiante actual
0. Salir
Ingrese su opción: """);
         opc = Entrada.nextInt();
        switch (opc) {
            case 1:
                registrarDatos(Entrada);
                break;
            case 2:
                mostrarDatos();
                break;
            case 3:
                promedio();
                break;
            case 0:
            System.exit(opc);
            default:
            System.out.println("La opcion ingresada no es valida");
                break;
        }
    }while(opc!=0);
}

    private static void registrarDatos(Scanner Entrada) {
        
        System.out.print("Digite el nombre del estudiante: ");
        Entrada.nextLine();
        nombre=Entrada.nextLine();
        do{
        System.out.print("Digite la primera nota: ");
        nota1f=Entrada.nextFloat();
        if(nota1f<0.0 || nota1f>5.0){
            System.out.println("La nota debe estar entre 0.0 y 5.0");
        }}while(nota1f<0.0 || nota1f>5.0);
        do{
         System.out.print("Digite la segunda nota: ");
        nota2f=Entrada.nextFloat();
    if(nota2f<0.0 || nota2f>5.0){
            System.out.println("La nota debe estar entre 0.0 y 5.0");
        }
      }while(nota2f<0.0 || nota2f>5.0);
        do{
         System.out.print("Digite la tercera nota: ");
        nota3f=Entrada.nextFloat();
    if(nota3f<0.0 || nota3f>5.0){
            System.out.println("La nota debe estar entre 0.0 y 5.0");
        }
    }while(nota3f<0.0 || nota3f>5.0);
        System.out.println("Datos registrados correctamente");
    }

    private static void mostrarDatos(){
    if(nombre==null){
        System.out.println("No existe estudiantes");
    }
    else{
        System.out.println("-------Estudiante-------");
        System.out.println("Nombre del estudiante: "+ nombre+"\n");
        System.out.println("Nota 1: "+ nota1f +" Nota 2: "+ nota2f+" Nota 3: "+ nota3f);
        System.out.println(" ");
    }
    }
    private static void promedio(){
    float promedio;

    promedio=(nota1f+nota2f+nota3f)/3;
    System.out.printf("El promedio del estudiante es %f%n : ",promedio);
    }
}
