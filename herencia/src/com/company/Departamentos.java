package com.company;

public class Departamentos extends Empresa {
    private   double numHabitaciones;
    private   double baños;
    private   String amenidades;

      public Departamentos(double numHabitaciones, double baños, String amenidades,
      String fechaAdquisición, String numLote, String numRegistro, String ultimoDueño) {
          super(fechaAdquisición, numLote, numRegistro, ultimoDueño);
          this.numHabitaciones=numHabitaciones;
          this.baños=baños;
          this.amenidades=amenidades;
      }

    public double getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(double numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getBaños() {
        return baños;
    }

    public void setBaños(double baños) {
        this.baños = baños;
    }

    public String getAmenidades() {
        return amenidades;
    }

    public void setAmenidades(String amenidades) {
        this.amenidades = amenidades;
    }

    public void informacionDepartamento(){
        System.out.println("\n Tipo: Departamento\n"+ "\n Número de habitaciones: "+ this.numHabitaciones+"\n Número de baños: " +this.baños+
                "\n Amenidades: "+this.amenidades +informacion());
    }
}
