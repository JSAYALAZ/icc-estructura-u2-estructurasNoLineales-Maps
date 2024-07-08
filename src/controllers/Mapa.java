package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String, Integer> mapita = new HashMap<>();
        mapita.put("Manzana", 20);
        mapita.put("Pera", 20);
        mapita.put("Mandarina", 20);

        System.out.println(mapita);

        mapita.remove("Pera");
        System.out.println(mapita);

        System.out.println("Existe manzana "+mapita.containsKey("Manza"));
        System.out.println("Existe pera "+mapita.containsKey("Pera"));

        int valorManzana = mapita.get("Mandarina");
        System.out.println("Valor de la mandarina "+valorManzana);
        System.out.println("Esta vacio? "+mapita.isEmpty());

        System.out.println("\n Calves del mapa");
        for (String key : mapita.keySet()) {
            System.out.println(key);
        }
        for (int value : mapita.values()){
            System.out.println(value);
        }

        

    }


}
