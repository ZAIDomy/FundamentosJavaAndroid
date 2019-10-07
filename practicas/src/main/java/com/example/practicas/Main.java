package com.example.practicas;

public class Main {
    public static void  main(String[] args){
        final short enterocorto = 32767;//32767;
        int entero =456464;
        long enterolargo=499;
        float decimalcorto=24.45f;
        double decimallargo=25.321654;
        char caracter='s';
        boolean esvalido=true;

        //variables y constantes
        title("variables y constantes");
        System.out.println(enterocorto);
        System.out.println(entero);
        System.out.println(decimalcorto);
        System.out.println(decimallargo);
        System.out.println(caracter);
        System.out.println(esvalido);
        //Arreglos
        title("arreglos");
        String[] nombres = new String[]{"Omar", "Luna", "Niky", "Saky"};
        System.out.println();
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);
        //if
        title("if");
        if (enterolargo > 1000){
            System.out.println("es mayor");
        }else if (enterolargo == 500){
            System.out.println("es igual");
        }else if (enterolargo < 500){
            System.out.println("es menor");
        }
        //operador ternario
        title("operador ternario");
        System.out.println(enterolargo > 1000?"es mayor": "no es mayor");
        //for
        title("for");
        for (int i=0;i<4;i++){
            System.out.println(i);
        }
        //for each
        title("for each");
        for (String nombre:nombres){
            System.out.println(nombre);
        }
        //switch
        title("switch");
        int x = (int)(Math.random()*4);
        System.out.println(x);
        String asd= nombres[x];
        switch (asd){
            case "Omar":
            case "Luna":
            case "Saky":
            case "Niky":
                System.out.println("soy yo "+ nombres[x]);
                break;
        }


    }
    //metodos
    public static void title(String t){
        System.out.println("*********"+ t +"*********");
    }
}
