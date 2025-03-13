package org.example;

public class Telefonia {
    private int idCabinas;
    private int numeroLlamadas;
    private double duracionLlamada;
    private double costoLlamada;
    public static final int LlamadaLocal = 50;
    public static final int LlamadaLargaLlamada = 350;
    public static final int LlamadaCelular = 150;

    public void crearCabina(int cabinas){
        int id = cabinas.size()+1;
        cabinas.add
    }
    public int registrarLlamada(String tipoLlamada, int minutos) {

    }
    public void mostrarInfo (){
        System.out.println("Informacion de cabina:");
        System.out.println("Numero de llamadas: " + numeroLlamadas);
        System.out.println("Duracion de llamadas: " + duracionLlamada);
        System.out.println("Costo de llamadas: " + costoLlamada);
    }
    public void reiniciarValores(){
        numeroLlamadas = 0;
        duracionLlamada = 0;
        costoLlamada = 0;
    }
    public void infoCabinas(){
        System.out.println("Informacion total cabinas:");
        System.out.println("id cabina: " + idCabinas);
        System.out.println("Duracion de llamadas: " + duracionLlamada);
        System.out.println("Costo de llamadas: " + costoLlamada);
    }
    public int getNumeroLlamadas(){
        return numeroLlamadas
    }
    public double getDuracionLlamada(){
        return duracionLlamada
    }
    public double getCostoLlamada(){
        return costoLlamada
    }
}
