package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public class Triple extends Habitacion{
    private final int NUM_MAXIMO_PERSONAS=3;
    public static final int MIN_NUM_BANOS=1;
    public static final int MAX_NUM_BANOS=2;
    public static final int MIN_NUM_CAMAS_INDIVIDUALES=1;
    public static final  int MAX_NUM_CAMAS_INDIVIDUALES=3;
    public static final int MIN_NUM_CAMAS_DOBLES=1;
    public static final int MAX_NUM_CAMAS_DOBLES=2;
    private int numBanos;
    private int numCamasIndividuales;
    private int numCamasDobles;

    public Triple (int planta, int puerta, double precio, int numBanos, int numCamasIndividuales, int numCamasDobles){
        super (planta, puerta, precio);
        setNumBanos(numBanos);
        setNumCamasIndividuales(numCamasIndividuales);
        setNumCamasDobles(numCamasDobles);
    }

    public Triple (Triple habitacionTriple){
        super(habitacionTriple.getPlanta(),habitacionTriple.getPuerta(),habitacionTriple.getPrecio());
        setNumBanos(habitacionTriple.getNumBanos());
        setNumCamasIndividuales(habitacionTriple.getNumCamasIndividuales());
        setNumCamasDobles(habitacionTriple.getNumCamasDobles());
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        if (numBanos<MIN_NUM_BANOS)
            throw new IllegalArgumentException("ERROR: no se admite esa cantidad de baños");
        if (numBanos>MAX_NUM_BANOS)
            throw new IllegalArgumentException("ERROR: No se admite esa cantaidad de baños");
        this.numBanos = numBanos;
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
        if (getNumCamasDobles()<MIN_NUM_CAMAS_DOBLES || getNumCamasDobles()>MAX_NUM_CAMAS_DOBLES)
            throw new IllegalArgumentException("ERROR: No es correcto el número de camas dobles.");
        if (getNumCamasIndividuales()<MIN_NUM_CAMAS_INDIVIDUALES || getNumCamasIndividuales()>MAX_NUM_CAMAS_INDIVIDUALES)
            throw new IllegalArgumentException("ERROR: No es correcto el número de camas simples.");
    }

    @Override
    public int getNumeroMaximoPersonas(){
        return NUM_MAXIMO_PERSONAS;
    }

    @Override
    public String toString() {
        return String.format("identificador=%s (%d-%d), precio habitación=%s, habitación triple, capacidad=%d personas, " +
                        "baños=%d, camas individuales=%d, camas dobles=%d",
                getIdentificador(), getPlanta(), getPuerta(), getPrecio(),
                getNumeroMaximoPersonas(),getNumBanos(),getNumCamasIndividuales(),getNumCamasDobles());
    }
}
