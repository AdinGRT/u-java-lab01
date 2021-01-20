package com.gm.mundopc;

/**
 *
 * @author adingrt
 */
public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }
    
    
}
