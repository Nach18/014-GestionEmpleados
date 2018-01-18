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
            System.out.println("Bienvenido a su gestor de empleados 2003!!!");
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
                    addEmpleadoToDepartamento();
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
        System.out.println("Esta es tu lista de empleados: ");
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
        System.out.println("Estos son los departamentos creados");
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
        /*Este metodo comunicara la lista empleados y la lista departamentos para que guarde uno
        * empleados en cada departamento segun su posición
        *
        * Sin embargo, yo quiero permitir al usuario que agregue varios trabajadores a la vez
        * por lo que tendre que usar un Array que guarde dicha selección de posiciones seperando
        * cada numero por comas
        * (ejemplo: 1,4,5...)*/
        int[] seleccionDepartamento;
        /*Este sera el array que usare para operar con las listas
        * Tiene que ser este array pues solo podemos operar si es de tipo entero (int)
        * ESTE NOS SERVIRA PARA OPERAR*/

        String[] multiSeleccion;
        /*Este sera el array que guarde las posiciones que escriba el usuario
        * tiene que ser este array pues la selección vendra incluido con comas (como elemento
        * separador), por lo que sera tratado como una cadena de texto (String)
        * ESTE NOS SERVIRA PARA CONVERTIR*/

        int scDepartamento;


        Departamentos locos = new Departamentos();
        verDepartamentos();
        System.out.println("Por favor, seleccione la posición numerica de un departemonto: ");
        scDepartamento = sc.nextInt();
        System.out.println("OK! Ahora solo queda elegir los empleados que quiere incluir \n");
        verEmpleados();
        System.out.println("Puede seleccionar la posición numerica de uno o varios empleados que quiera añadir al departamento " + listaDepartamentos.indexOf(scDepartamento) + locos.in(scDepartamento)));
        System.out.println("Si quiere añadir mas de un empleado ponga las posiciones divididas por comas (1,3,4,6...)");
        System.out.print("O_o -> \n");
        multiSeleccion = sc.next().split(",");
        seleccionDepartamento = new int [multiSeleccion.length];
        for (int i = 0; i < seleccionDepartamento.length; i++) {
            seleccionDepartamento [i] = Integer.parseInt(multiSeleccion [i]);
            System.out.println(listaEmpleados.indexOf(seleccionDepartamento) + " se ha añadido a " + listaDepartamentos.indexOf(scDepartamento));
        }
        System.out.println("OK!");




    }


}

