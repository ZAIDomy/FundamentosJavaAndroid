package com.example.practicas;

public class Apartamento extends Casa {
    private short numeroInt;

    public Apartamento(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                       float impuesto, double mtsCubicos, boolean hipoteca, short numeroInt) {
        super(calle, seccion, numero, precio, fechaConstruccion, impuesto, mtsCubicos, hipoteca);
        this.numeroInt = numeroInt;
    }

    public short getNumeroInt() {
        return numeroInt;
    }

    public void setNumeroInt(short numeroInt) {
        this.numeroInt = numeroInt;
    }
}
