
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
                    Mostrar_Lista();
                    break;
                case 4:
                    ModificarInfo();
                    break;
                case 5:
                    RetirarMara();
                    break;
                case 6:
                    List_por_depa();
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
        brazil.nextLine();
        System.out.println("Ingrese el nombre del empleado que desde encontrar");
        String busqN = brazil.nextLine();
        System.out.println("Ingrese el numero de Id del empleado que desea buscar");
        int busqID = brazil.nextInt();
        boolean mensaje = false;
        for (int i = 0; i < List_empleados.size(); i++) {
            Empleado temp = List_empleados.get(i);
            String tempN = temp.getNombre();
            int tempID = temp.getNdeIdentificacion();
            if ( tempN.contentEquals(busqN) && tempID == busqID) {
                mensaje = true;
                break;
            }
        }
        if (mensaje == true) {
            System.out.println("El empleado buscado si se encuentra en la Lista");
        }else{
            System.out.println("El empleado buscado no esta en la lista");
        }
    }
    public static void Mostrar_Lista (){
        for (int i = 0; i < List_empleados.size(); i++) {
            Empleado pos = List_empleados.get(i);
            /*String tempN = pos.getNombre();
            String tempP = pos.getPuesto();
            int tempS = pos.getSalario();
            String tempD = pos.getDepartamento();
            int tempID = pos.getNdeIdentificacion();
            */
            // todo lo anterior era por si queria hacerlo pieza por pieza y me acorde del ToString jajajajaj
            pos.toString();
        }
    }
    public static void ModificarInfo (){
        System.out.println("QUE DESDEA CAMBIAR ? ");
        System.out.println("Que posicion de empleado desde cambiar la info ");
        int pos = brazil.nextInt();
        if (pos > 0 && pos < List_empleados.size()) {
            System.out.println("1. Nombre del empleado ");
            System.out.println("2. Puesto que ocupa ");
            System.out.println("3. Salario ");
            System.out.println("4. Departamento ");
            int op = brazil.nextInt();
            Empleado temp = List_empleados.get(pos);
            switch (op) {
                case 1:
                    brazil.nextLine();
                    System.out.println("Ingrese el nombre que va a cambiar por el actual ");
                    String cambN = brazil.nextLine();
                    temp.setNombre(cambN);
                    List_empleados.set(pos, temp);
                    break;
                case 2:
                    brazil.nextLine();
                    System.out.println("Ingrese el puesto que va a cambiar por el actual ");
                    String cambP = brazil.nextLine();
                    temp.setDepartamento(cambP);
                    List_empleados.set(pos, temp);
                    break;
                case 3:
                    System.out.println("Ingrese el Salario que va a cambiar por el actual ");
                    int cambS = brazil.nextInt();
                    if (cambS > 0) {
                        temp.setSalario(cambS);
                        List_empleados.set(pos, temp);
                    }else{
                        System.out.println("Que las personas no se pagan solas ");
                    }
                    break;
                case 4:
                    brazil.nextLine();
                    System.out.println("Ingrese el departamento que va a cambiar por el actual");
                    String cambD = brazil.nextLine();
                    temp.setDepartamento(cambD);
                    List_empleados.set(pos, temp);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }else{
            System.out.println("Posicion no valida");
        }
    }
    public static void RetirarMara (){
        System.out.println("En que posicion esta el empleado que desea eliminar ");
        int pos = brazil.nextInt();
        if (pos > 0 && pos < List_empleados.size()) {
            List_empleados.remove(pos);
            System.out.println("Se eliminado el Empleado con exito ");
        }else{
            System.out.println("Posicion no registrada");
        }
    }
    public static void List_por_depa(){
        boolean mensaje_final;
        brazil.nextLine();
        System.out.println("Ingrese el departamente el cual busca ");
        String busqD = brazil.nextLine();
        for (int i = 0; i < List_empleados.size(); i++) {
            Empleado temp = List_empleados.get(i);
            if (busqD.equals(temp.getDepartamento())) {
                System.out.println(temp.toString());
            }
        }
    }
}
