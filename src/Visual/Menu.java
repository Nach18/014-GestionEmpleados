package Visual;

import Gestion.Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int respuesta;
    String asignar;

    Scanner sc = new Scanner(System.in);
    Empleados empleado = new Empleados();
    ArrayList<Empleados> listaEmpleados = new ArrayList<>();

    public void mostrarMenu() {
        do {
            System.out.println("Bienvenido a su gestor de empleados 2013!!!");
            System.out.println("¿Que desea hacer hoy?");
            System.out.println("1) Añadir un nuevo empleado");
            System.out.println("2) Añadir un nuevo Departamento");
            System.out.println("3) Añadir un empleado a un Departamento");
            System.out.println("4) Salir");
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
                    break;
                case 3:
                    System.out.println("");
                    break;

            }

        }while (respuesta != 0);{
            System.out.println("");
            System.out.println("Tiene siempre nuestros servicios a su disposición");
        }
    }

    public void addEmpleado () {
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

    }


}

