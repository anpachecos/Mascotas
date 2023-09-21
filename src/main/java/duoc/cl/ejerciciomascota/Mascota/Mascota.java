package duoc.cl.ejerciciomascota.Mascota;

import java.util.Scanner;

public class Mascota {

    private String nombre;
    private String fecha;
    private int chip;
    private String dueno;

    public Mascota(String nombre, String fecha, int chip, String dueno) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.chip = chip;
        this.dueno = dueno;
    }

    public static Mascota crearMascota() {
        System.out.println("****CREAR MASCOTA****");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa nombre de la mascota> ");
        String nombre = "";
        try {
            while (true) {
                nombre = sc.nextLine();
                if (nombre.length() > 0) {
                    break;
                } else {
                    System.out.println("Opción no valida, nombre debe ser mayor a 0");
                }
            }
        } catch (Exception e) {
        }
        System.out.println("Ingresa fecha de nacimiento> (FORMATO DIA/MES/AÑO)");
        String fecha = "";
        try {
            while (true) {
                fecha = sc.nextLine();
                if (fecha.length() == 10) {
                    break;
                } else {
                    System.out.println("Opcion no valida, debe ser en formato DD/MM/YYYY (ej: 14/04/2001)");
                }

            }

        } catch (Exception e) {

        }

        System.out.println("Ingresa nombre de dueño/a> ");
        String dueno = sc.nextLine();
        
        
        System.out.println("Ingresa numero de chip (16 digitos)> ");
        String chip1 = "";
        int chip = 0;
        try {
            while (true) {
                chip1 = sc.nextLine();
                if (chip1.length() == 16) {
                    chip = Integer.parseInt(chip1);
                    break;
                } else {
                    System.out.println("Opcion no valida, el n° de chip debe tener 16 digitos");
                }

            }

        } catch (Exception e) {

        }

        

        System.out.println("Mascota creada con éxito!");

        return new Mascota(nombre, fecha, chip, dueno);
    }

    public Mascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

}
