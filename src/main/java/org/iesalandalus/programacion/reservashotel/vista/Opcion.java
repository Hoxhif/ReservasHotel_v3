package org.iesalandalus.programacion.reservashotel.vista;

public enum Opcion {
    SALIR("Salir"),
    INSERTAR_HUESPED("Insertar Huesped"),
    BUSCAR_HUESPED("Buscar Huesped"),
    BORRAR_HUESPED("Borrar Huesped"),
    MOSTRAR_HUESPEDES("Mostrar Huespedes"),
    INSERTAR_HABITACION("Insertar Habitaci�n"),
    BUSCAR_HABITACION("Buscar Habitaci�n"),
    BORRAR_HABITACION("Borrar Habitaci�n"),
    MOSTRAR_HABITACIONES("Mostrar Habitaciones"),
    INSERTAR_RESERVA("Insertar Reserva"),
    ANULAR_RESERVA("Anular Reserva"),
    MOSTRAR_RESERVAS("Mostrar Reservas"),
    REALIZAR_CHECKIN("Realizar CheckIn"),
    REALIZAR_CHECKOUT("Realizar CheckOut"),
    CONSULTAR_DISPONIBILIDAD("Consultar Disponibilidad");


    private String mensajeAMostrar;

    private Opcion(String mensajeAMostrar){
        this.mensajeAMostrar=mensajeAMostrar;
    }

    @Override
    public String toString() {
        return ordinal()+1+".-"+" "+mensajeAMostrar;
    }
}

