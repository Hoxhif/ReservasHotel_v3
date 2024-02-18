package org.iesalandalus.programacion.reservashotel.vista;

import org.iesalandalus.programacion.reservashotel.MainApp;

public enum Opcion {


    SALIR("Salir"){
        @Override
        public void ejecutar(){
            vistaOpcion.terminar();
        }
    },
    INSERTAR_HUESPED("Insertar Huesped"){
        @Override
        public void ejecutar(){
            vistaOpcion.insertarHuesped();
        }
    },
    BUSCAR_HUESPED("Buscar Huesped"){
        @Override
        public void ejecutar(){
            vistaOpcion.buscarHuesped();
        }
    },
    BORRAR_HUESPED("Borrar Huesped"){
        public void ejecutar(){
            vistaOpcion.borrarHuesped();
        }
    },
    MOSTRAR_HUESPEDES("Mostrar Huespedes"){
        public void ejecutar(){
            vistaOpcion.mostrarHuespedes();
        }
    },
    INSERTAR_HABITACION("Insertar Habitación"){
        public void ejecutar(){
            vistaOpcion.insertarHabitacion();
        }
    },
    BUSCAR_HABITACION("Buscar Habitación"){
        public void ejecutar(){
            vistaOpcion.buscarHabitacion();
        }
    },
    BORRAR_HABITACION("Borrar Habitación"){
        public void ejecutar(){
            vistaOpcion.borrarHabitacion();
        }
    },
    MOSTRAR_HABITACIONES("Mostrar Habitaciones"){
        public void ejecutar(){
            vistaOpcion.mostrarHabitaciones();
        }
    },
    INSERTAR_RESERVA("Insertar Reserva"){
        public void ejecutar(){
            vistaOpcion.insertarReserva();
        }
    },
    ANULAR_RESERVA("Anular Reserva"){
        public void ejecutar(){
            vistaOpcion.anularReserva();
        }
    },
    MOSTRAR_RESERVAS("Mostrar Reservas"){
        public void ejecutar(){
            vistaOpcion.mostrarReservas();
        }
    },
    REALIZAR_CHECKIN("Realizar CheckIn"){
        public void ejecutar(){
            vistaOpcion.realizarCheckin();
        }
    },
    REALIZAR_CHECKOUT("Realizar CheckOut"){
        public void ejecutar(){
            vistaOpcion.realizarCheckout();
        }
    },
    CONSULTAR_DISPONIBILIDAD("Consultar Disponibilidad"){
        public void ejecutar(){
            vistaOpcion.comprobarDisponibilidad();
        }
    };

    private static Vista vistaOpcion;
    private String mensajeAMostrar;


    public static void setVista(Vista vista){
        vistaOpcion=vista;
    }

    public abstract void ejecutar();


    private Opcion(String mensajeAMostrar){
        this.mensajeAMostrar=mensajeAMostrar;
    }

    @Override
    public String toString() {
        return ordinal()+1+".-"+" "+mensajeAMostrar;
    }
}

