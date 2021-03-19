package com.company;

public class LocalesComerciales extends Empresa {
   private String fechaConstruccion;
    private String fechaInspeccion;

    //constructor
    public LocalesComerciales(String fechaConstruccion, String fechaInspeccion,
                              String fechaAdquisición, String numLote, String numRegistro, String ultimoDueño){
        super(fechaAdquisición, numLote, numRegistro, ultimoDueño);
        this.fechaConstruccion = fechaConstruccion;
        this.fechaInspeccion=fechaInspeccion;
    }

    public String getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(String fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public String getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public void informacionLocal(){
        System.out.println("\n Tipo: Local Comercial\n"+ informacion()+"\n Fecha de Construcción: "+ this.fechaConstruccion+
                "\n Fecha de Inspección: "+this.fechaInspeccion);
    }
}
