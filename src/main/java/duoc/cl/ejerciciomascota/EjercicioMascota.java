package duoc.cl.ejerciciomascota;

import duoc.cl.ejerciciomascota.Mascota.Mascota;
import static duoc.cl.ejerciciomascota.Mascota.Mascota.crearMascota;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioMascota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
        while (!salir) {
            System.out.println("***PROGRAMA MASCOTAS***");
            System.out.println("1) Crear Mascota");
            System.out.println("2) Editar Mascota");
            System.out.println("3) Ver lista de Mascotas creadas");
            System.out.println("4) Salir del sistema");
            System.out.println("Ingrese una opcion > ");
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    listaMascotas.add(crearMascota());
                    break;
                case 2:
                    System.out.println("¿Qué mascota quieres modificar?");

                    for (Mascota mas : listaMascotas) {

                        System.out.println(listaMascotas.indexOf(mas) + 1 + ") Mascota: " + mas.getNombre() + " Dueno: " + mas.getDueno());

                    }
                    System.out.println("Ingrese opción: ");
                    int opcion3 = sc.nextInt();

                    if (opcion3 < 1 || opcion3 > listaMascotas.size()) {
                        System.out.println("Opcion Invalida");
                    } else {

                        Mascota mascotaSeleccionada = listaMascotas.get(opcion3 - 1);

                        System.out.println("¿Qué atributo quieres modificar?");
                        System.out.println("1) Nombre Mascota"
                                + " \n2) Fecha de Nacimiento"
                                + " \n3) Numero de chip"
                                + " \n4)Nombre dueño/a \n"
                                + "5)Volver al menu principal");
                        int opcion2 = sc.nextInt();

                        boolean salir2 = false;
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingresa nuevo nombre de la mascota> ");
                                String nuevoNombre = sc.next();
                                mascotaSeleccionada.setNombre(nuevoNombre);
                                break;
                            case 2:
                                System.out.println("Ingresa nueva fecha de nacimiento (Formato DD/MM/YYYY)> ");
                                String nuevaFecha = sc.next();
                                mascotaSeleccionada.setFecha(nuevaFecha);
                                break;
                            case 3:
                                System.out.println("Ingresa nuevo nombre del dueño/a ");
                                String nuevoDueno = sc.next();
                                mascotaSeleccionada.setDueno(nuevoDueno);
                                break;
                            case 4:
                                System.out.println("Ingresa nuevo numero de chip> ");
                                int nuevoChip = sc.nextInt();
                                mascotaSeleccionada.setChip(nuevoChip);
                                break;
                            case 5:
                                salir2 = true;
                            default:
                                System.out.println("Opcion no valida");
                        }
                        break;
                    }

                case 3:
                     for (Mascota mas : listaMascotas) {
                        System.out.println(listaMascotas.indexOf(mas) + 1 + ") Mascota: " + mas.getNombre() + " Dueno: " + mas.getDueno() + " Fecha de Nacimiento: " + mas.getFecha() + "Numero de Chip: " + mas.getChip());
                    }
                    break;
                case 4:
                    salir = true;
                default:
                    System.out.println("Opcion no valida");

            }

        }

    }
}
