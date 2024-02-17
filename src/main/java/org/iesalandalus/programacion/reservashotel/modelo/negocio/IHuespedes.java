package org.iesalandalus.programacion.reservashotel.modelo.negocio;

import org.iesalandalus.programacion.reservashotel.modelo.dominio.Huesped;

import java.util.ArrayList;

public interface IHuespedes {
    ArrayList<Huesped> get();
    int getTamano();
    void insertar(Huesped huesped);
    Huesped buscar(Huesped huesped);
    void borrar(Huesped huesped);
}
