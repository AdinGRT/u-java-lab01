package com.gm.mundopc;

/**
 *
 * @author adingrt
 */
public class Raton extends DispositivoEntrada {
    private int idRaton;
    private int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }

}
