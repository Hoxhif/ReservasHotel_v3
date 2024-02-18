package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public class Doble extends Habitacion{

    private final int NUM_MAXIMO_PERSONAS=2;
    public static final int MIN_NUM_CAMAS_INDIVIDUALES=1;
    public static final int MAX_NUM_CAMAS_INDIVIDUALES=2;
    public static final int MIN_NUM_CAMAS_DOBLES=1;
    public static final int MAX_NUM_CAMAS_DOBLES=1;
    private int numCamasIndividuales;
    private int numCamasDobles;

    public Doble(int planta, int puerta, double precio, int numCamasIndividuales, int numCamasDobles){
        super(planta, puerta, precio);
        setNumCamasIndividuales(numCamasIndividuales);
        setNumCamasDobles(numCamasDobles);
    }

    public Doble(Doble habitacionDoble){
        super(habitacionDoble.getPlanta(),habitacionDoble.getPuerta(),habitacionDoble.getPrecio());
        setNumCamasDobles(habitacionDoble.getNumCamasDobles());
        setNumCamasIndividuales(habitacionDoble.getNumCamasIndividuales());
    }

    public int getNumCamasIndividuales() {
        return numCamasIndividuales;
    }

    public void setNumCamasIndividuales(int numCamasIndividuales) {
        this.numCamasIndividuales = numCamasIndividuales;
        validaNumCamas();
    }

    public int getNumCamasDobles() {
        return numCamasDobles;
    }

    public void setNumCamasDobles(int numCamasDobles) {
        this.numCamasDobles = numCamasDobles;
        validaNumCamas();
    }

    private void validaNumCamas(){
        if (getNumCamasDobles()<MIN_NUM_CAMAS_DOBLES ||getNumCamasDobles()>MAX_NUM_CAMAS_DOBLES)
            throw new IllegalArgumentException("ERROR: No se puede tener más de 1 cama doble en una habitación doble.");
        if (getNumCamasIndividuales()<MIN_NUM_CAMAS_INDIVIDUALES || getNumCamasIndividuales()>MAX_NUM_CAMAS_INDIVIDUALES)
            throw new IllegalArgumentException("ERROR: No se puede tener más de 2 camas individuales en una habitación doble.");
    }

    @Override
    public int getNumeroMaximoPersonas(){
        return NUM_MAXIMO_PERSONAS;
    }

    @Override
    public String toString() {
        return String.format(super.toString()+", habitación doble, capacidad=%d personas, " +
                        "camas individuales=%d, camas dobles=%d",
                getNumeroMaximoPersonas(),getNumCamasIndividuales(),getNumCamasDobles());
    }
}
