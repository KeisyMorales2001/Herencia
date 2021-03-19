package com.company;

//Clase Padre: Empresa Inmobilaria

public class Empresa {
   private String fechaAdquisición;
   private String numLote;
   private String ultimoDueño;
   private  String numRegistro;

   //Constructor
    public Empresa(String fechaAdquisición, String numLote, String numRegistro, String ultimoDueño){
        this.fechaAdquisición=fechaAdquisición;
        this.numLote=numLote;
        this.ultimoDueño=ultimoDueño;
        this.numRegistro=numRegistro;
    }

    public String getFechaAdquisición() {
        return fechaAdquisición;
    }

    public void setFechaAdquisición(String fechaAdquisición) {
        this.fechaAdquisición = fechaAdquisición;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    public String getUltimoDueño() {
        return ultimoDueño;
    }

    public void setUltimoDueño(String ultimoDueño) {
        this.ultimoDueño = ultimoDueño;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    String informacion(){
        return "\n Número de registro: "+this.numRegistro+"\n Número de lote: "+ this.numLote+"\n Último dueño: "+this.ultimoDueño +
                "\n Fecha de adquisición: "+this.fechaAdquisición;
    }
}
