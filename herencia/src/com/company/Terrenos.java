package com.company;

public class Terrenos extends Empresa{
    private String numMetrosCuadrados;
    private String ubicacion;

     public Terrenos(String numMetrosCuadrados, String ubicacion,
                     String fechaAdquisición, String numLote, String numRegistro, String ultimoDueño){
         super(fechaAdquisición, numLote, numRegistro, ultimoDueño);
         this.numMetrosCuadrados=numMetrosCuadrados;
         this.ubicacion=ubicacion;
     }


    public String getNumMetrosCuadrados() {
        return numMetrosCuadrados;
    }

    public void setNumMetrosCuadrados(String numMetrosCuadrados) {
        this.numMetrosCuadrados = numMetrosCuadrados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void informacionTerrenos(){
        System.out.println("\n Tipo: Terrenos\n"+ "\n Ubicación: "+ this.ubicacion+"\n Número de metros cuadrados: "+this.numMetrosCuadrados+informacion());
    }
}
