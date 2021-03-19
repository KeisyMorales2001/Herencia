package com.company;
import java.util.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int o;

        //2 local
        ArrayList<LocalesComerciales> local=new ArrayList<LocalesComerciales>();
        local.add(new LocalesComerciales("1/3/2000", "28/2/1999", "09/4/2001", "1001", "0001"
              ,"Marcos Fuentes"));
        local.add(new LocalesComerciales("6/5/2000", "25/1/1998", "15/10/2000", "2001", "0010"
                ,"Martin Guerra"));

        //3 Departamentos
        ArrayList<Departamentos> departament= new ArrayList<Departamentos>();
        departament.add(new Departamentos(4,2, "baño principal con spa, cuarto de cine", "10/5/2009",
                "3020", "0030", "Mateo Bernal"));
        departament.add(new Departamentos(5,2, "vista al mar, salón de juegos", "30/6/2015",
                "3120", "0101", "Ross Aguilar"));
        departament.add(new Departamentos(3,1, "cocina remodelada, sala de estar moderna", "15/8/2015",
                "5040", "03245", "Miguel López"));

        //5 Terrenos
        ArrayList<Terrenos>terreno = new ArrayList<Terrenos>();
        terreno.add(new Terrenos("180 m^2","Panamá Oeste,Arraijan, Burunga","6/6/2016", "410010",
                "40011", "Mario Mora"));
        terreno.add(new Terrenos("145 m^2","Panamá Oeste,La Chorrera, Puerto Caimito","19/11/2011", "35041",
                "25662", "Berta Miranda"));
        terreno.add(new Terrenos("120 m^2","Los Santos,Las Tablas, El Karate","3/2/2018", "51004",
                "652412", "Loren Thomas"));
        terreno.add(new Terrenos("85 m^2","Panamá Oeste,Arraijan, La Omar","5/1/2013", "100010",
                "20145", "Marco Polo"));
        terreno.add(new Terrenos("190 m^2","Panamá Oeste,Arraijan, Burunga","1/9/2017", "52100",
                "450102", "Eliecer Caballero"));

        System.out.println("\t BIENVENIDO AL SISTEMA");
        do{
            System.out.println("\n 1. Locales Comerciales \n 2. Departamentos \n 3. Terrenos\n 4. SALIR \n");
            o = s.nextInt();
            s.nextLine();

            switch (o){
                case 1:
                    System.out.println("LISTA DE LOCALES COMERCIALES");
                    for (LocalesComerciales value: local){
                        value.informacionLocal();
                    }
                    break;
                case 2:
                    System.out.println("LISTA DE DEPARTAMENTOS");
                    for (Departamentos value: departament){
                        value.informacionDepartamento();
                    }
                    break;
                case 3:
                    System.out.println("LISTA DE TERRENOS");
                    for (Terrenos value: terreno){
                        value.informacionTerrenos();
                    }
                    break;
                case 4:
                    System.out.println("Se ha cerrado el Sistema");
                    break;
                default:
                    System.out.println("Ingrese un valor válido, por favor");
                    break;
            }
    }while(o!=4);
}
}
