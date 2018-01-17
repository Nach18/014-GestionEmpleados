package Visual;

import Gestion.Departamentos;
import Gestion.Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int respuesta;
    private String repeticion;
    String asignar;

    Scanner sc = new Scanner(System.in);

    ArrayList<Empleados> listaEmpleados = new ArrayList<>();
    ArrayList<Departamentos> listaDepartamentos = new ArrayList<>();

    public void mostrarMenu() {
        do {
            System.out.println("Bienvenido a su gestor de empleados 2013!!!");
            System.out.println("¿Que desea hacer hoy?");
            System.out.println("1) Añadir un nuevo empleado");
            System.out.println("2) Añadir un nuevo Departamento");
            System.out.println("3) Añadir un empleado a un Departamento");
            System.out.println("4) Ver lista de Empleados");
            System.out.println("5) Ver lista de Departamentos");
            System.out.println("0) Salir");
            System.out.println("");
            System.out.print("O_o ->");
            respuesta = sc.nextInt();

            switch (respuesta) {
                default:
                    System.out.println("");
                    System.out.println("La respuesta que has dado es invalida.");
                    break;
                case 1:
                    System.out.println("");
                    addEmpleado();
                    break;
                case 2:
                    System.out.println("");
                    addDepartamento();
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    verEmpleados();
                    break;
                case 5:
                    System.out.println("");
                    verDepartamentos();
                    break;


            }

        }while (respuesta != 0);{
            System.out.println("");
            System.out.println("Tiene siempre nuestros servicios a su disposición");
        }
    }

    public void addEmpleado () {
        do {
            Empleados empleado = new Empleados();
            /*Tiene que declarse un nuevo empleado cada vez que se quiere usar este metodo
            * pues si no añadira el mismo continuamente*/
            System.out.println("Para añadir un nuevo empleado debe rellenar los siguientes campos");
            System.out.print("Nombre: ");
            empleado.setNombre(sc.next());
            System.out.println("Se ha guardado " + empleado.getNombre() + "\n");
            System.out.print("Apellido: ");
            empleado.setApellido(sc.next());
            System.out.println("Se ha guardado " + empleado.getApellido() + "\n");
            System.out.print("DNI");
            empleado.setDni(sc.next());
            System.out.println("Se ha guardado " + empleado.getDni() + "\n");
            listaEmpleados.add(empleado);
            System.out.println("");
            System.out.print("¿Añadimos otro empleado mas? (S/N)");
            repeticion = sc.next();
            System.out.println("");

        } while (repeticion.equalsIgnoreCase("s"));

    }

    public void verEmpleados () {
        for (Empleados verEmpleados : listaEmpleados) {
            /*Un for each para recorrer un ArrayList que llamaremos: verEmpleados que se formara por:
            * cada Empleado de la listaEmpleados
            *
            * cada Empleado recorrido de la listaEmpleados mostrara un mensaje*/
            System.out.println(listaEmpleados.indexOf(verEmpleados)+1 + " - " + verEmpleados.getNombre() + " " + verEmpleados.getApellido());
            /*Mostrara un mensaje que indicara 3 cosas
            * 1- La posición (indexOf) del elemento (verEmpleados) del bucle
            * 2- El nombre (getNombre) del elemento (verEmpleados) del bucle
            * 3- El apellido (getApellido) gel elemento (verEmpleados) del bucle*/
        }
    }

    public void addDepartamento (){
        do {
            Departamentos departamentos = new Departamentos();
            /*Tenemos que declarar un nuevo departamento cada vez que queramos añadir uno nuevo
            * pues si no estara añadiendo siempre el mismo sustituyendo el resto*/
            System.out.println("Para crear un nuevo departamento ha de rellenar los siguientes campos: ");
            System.out.print("Nombre ");
            departamentos.setNombre(sc.next());
            System.out.print("Dirección: ");
            departamentos.setDireccion(sc.next());
            System.out.println("Teléfono: ");
            departamentos.setTelefono(sc.nextInt());
            listaDepartamentos.add(departamentos);
            System.out.println("¿Creamos otro departamento más? (S/N)");
            repeticion = sc.next();
            System.out.println("");
        } while (repeticion.equalsIgnoreCase("s"));

    }

    public void verDepartamentos () {
        System.out.println("-----------------");
        for (Departamentos verDepartamentos : listaDepartamentos) {
            /*Usamos un For Each para recorrer el ArrayList (listaDepartamentos)
            * basado en la clase (Departamentos)
            * cada elemento que recorra del bucle tendrá un nombre (verDepartamentos)*/
            System.out.println(listaDepartamentos.indexOf(verDepartamentos)+1 + " - " + verDepartamentos.getNombre() + " // " + verDepartamentos.getDireccion());
            /*Por cada elemento recorrido hara una acción
            * que sera mostrar un mensaje que indicara 3 datos segun la lista (listaDepartamentos)
            * 1: La posición (indexof) del elemento (verDepartamento) sumamos 1 para que no empiece por 0
            * 2: El nombre (getNombre) del elemento (verDepartamento)
            * 3: La dirección (getDireccion) del elemento (verDepartamento)*/
        }
        System.out.println("-----------------");
    }

    public void addEmpleadoToDepartamento () {
        int seleccionarDepartamento;

        System.out.println("Indique por posición");
    }


}

