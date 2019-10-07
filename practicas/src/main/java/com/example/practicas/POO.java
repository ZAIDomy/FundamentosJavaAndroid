package com.example.practicas;

import java.awt.image.ComponentSampleModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO {
    public static void main(String[] args){
        Casa miCasa = new Casa("7b ", 'B', (short)29,
                2000000,1234567897123L,3.5f,400.540,false);
        System.out.println(miCasa);

        Casa maryCasa = new Casa("reforma", (short)543, 350000, true);
        Casa omarCasa = new Casa("roma",(short)12,120000,false);

        System.out.println(maryCasa);

        //listas
        Main.title("Listas");
        List<Casa> casaList = new ArrayList<>();
        casaList.add(miCasa);
        casaList.add(omarCasa);
        casaList.add(maryCasa);

        casaList.remove(1);
        casaList.set(0, omarCasa);

        for (Casa currentCasa : casaList){
            System.out.println(currentCasa);
        }
        //diccionario
        Main.title("diccionario");
        Map<String, Casa> casaMap = new HashMap<>();
        casaMap.put("alain",miCasa);
        casaMap.put("omar", omarCasa);
        casaMap.put("mary", maryCasa);

        System.out.println(casaMap.get("omar"));
        System.out.println(casaMap.size());
        casaMap.remove("alain");
        System.out.println(casaMap.size());
        casaMap.put("alain",miCasa);
        System.out.println(casaMap.size());

        casaMap.put("omar",miCasa);
        System.out.println(casaMap.get("omar"));

        //herencia
        Main.title("herencia");
        Apartamento apartamentoPlaya = new Apartamento("bldv mexico",'E',(short)10,
                123456,123456789789L,2.5f,50,true,(short)6);
        System.out.println(apartamentoPlaya);

        //polimorfismo
        Main.title("polimorfismo");
        venderPropiedad(apartamentoPlaya);

        Casa apartamentoCity = new Apartamento("mexico",'A',(short)15,2500000,
                1234567898L,3.2f,60,false,(short)8);

        venderPropiedad(apartamentoCity);

        Casa  casanueva = new Casa();
        casanueva.setCalle("guadalajara");
        casanueva.setHipoteca(true);
        casanueva.setImpuesto(2.1f);
        System.out.println(casanueva);
        venderPropiedad(casanueva);
        //equals y hashcode
        Main.title("equals y hashcode");
        Casa miCasa1 = new Casa("7b ", 'B', (short)29,
                2000000,1234567897123L,3.5f,400.540,false);
        Casa miCasa2 = new Casa("7b ", 'B', (short)29,
                2000000,1234567897123L,3.5f,400.540,false);

        System.out.println(miCasa1.equals(miCasa2));
        Casa  miCasa3 = new Casa();
        System.out.println(casaMap.containsValue(miCasa));




    }

    private static void venderPropiedad(Casa casa) {
        if (casa.isHipoteca()){
            System.out.println("imposible vender");
        }else {
            System.out.println("en venta");
        }
    }
}
