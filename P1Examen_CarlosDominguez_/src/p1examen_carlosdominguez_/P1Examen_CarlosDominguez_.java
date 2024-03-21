
package p1examen_carlosdominguez_;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class P1Examen_CarlosDominguez_ {

    static Scanner brazil = new Scanner(System.in);
    static ArrayList <Empleado> List_empleados = new ArrayList();
    static Random rd = new Random ();
    public static void main(String[] args) {
        boolean out = true;
        do {
            System.out.println("**********Sistema de Recursos Humanos**********");
            System.out.println("1. Agregar Empleados ");
            System.out.println("2. Buscar Empleados ");
            System.out.println("3. Mostar una lista de los empleados ");
            System.out.println("4. Modificar la informacion de los Empleados ");
            System.out.println("5. Registar el retiro de un empleado ");
            System.out.println("6. Listar empleados por departamento ");
            System.out.println("7. Salir del Sistema");
            int opcion = brazil.nextInt();
            switch (opcion) {
                case 1:
                    Agregar();
                    break;
                case 2:
                    Buscar_empleado();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Saliendo.....");
                    out = false;
                    break;
                default:
                    System.out.println(" Opcion no valida ");
            }
        } while (out);
    }
    public static void Agregar (){
        brazil.nextLine();
        System.out.println("Ingrese Nombre del empleado : ");
        String n = brazil.nextLine();
        System.out.println("Ingrese el Puesto del empleado : ");
        String p = brazil.nextLine();
        System.out.println("Ingrese el Salario del empleado : ");
        int s = brazil.nextInt();
        System.out.println("Ingrese el Departamento : ");
        brazil.nextLine();
        String d = brazil.nextLine();
        int nd = rd.nextInt(20-150);
        System.out.println("El numero de Identificacion del empleado que se generado es "+ nd);
        boolean verf = verficacion(s);
        if (verf == true) {
            List_empleados.add(new Empleado(n,p,s,d,nd));
            System.out.println("Se añadido un empleado nuevo con exito ");
        }else{
            System.out.println("Es que la gente Trabaja de gratis???");
        }
    }
    public static boolean verficacion (int salario){
        if (salario > 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void Buscar_empleado (){
        
    }
}
