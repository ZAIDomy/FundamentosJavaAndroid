package com.example.practicas;

import java.util.Objects;

public class Casa {
    private String calle;
    private char seccion;
    private short numero;
    private int precio;
    private long fechaConstruccion;
    private float impuesto;
    private double mtsCubicos;
    private boolean hipoteca;

    public Casa(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                float impuesto, double mtsCubicos, boolean hipoteca) {
        this.calle = calle;
        this.seccion = seccion;
        this.numero = numero;
        this.precio = precio;
        this.fechaConstruccion = fechaConstruccion;
        this.impuesto = impuesto;
        this.mtsCubicos = mtsCubicos;
        this.hipoteca = hipoteca;
    }

    public Casa(String calle, short numero, int precio, boolean hipoteca) {
        this.calle = calle;
        this.numero = numero;
        this.precio = precio;
        this.hipoteca = hipoteca;
    }

    public Casa() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public char getSeccion() {
        return seccion;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public long getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(long fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public double getMtsCubicos() {
        return mtsCubicos;
    }

    public void setMtsCubicos(double mtsCubicos) {
        this.mtsCubicos = mtsCubicos;
    }

    public boolean isHipoteca() {
        return hipoteca;
    }

    public void setHipoteca(boolean hipoteca) {
        this.hipoteca = hipoteca;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "calle='" + calle + '\'' +
                ", seccion=" + seccion +
                ", numero=" + numero +
                ", precio=" + precio +
                ", fechaConstruccion=" + fechaConstruccion +
                ", impuesto=" + impuesto +
                ", mtsCubicos=" + mtsCubicos +
                ", hipoteca=" + hipoteca +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return seccion == casa.seccion &&
                numero == casa.numero &&
                precio == casa.precio &&
                fechaConstruccion == casa.fechaConstruccion &&
                Float.compare(casa.impuesto, impuesto) == 0 &&
                Double.compare(casa.mtsCubicos, mtsCubicos) == 0 &&
                hipoteca == casa.hipoteca &&
                Objects.equals(calle, casa.calle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, seccion, numero, precio, fechaConstruccion, impuesto, mtsCubicos, hipoteca);
    }
}