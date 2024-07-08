package controllers;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Ejercicios {
    public Ejercicios() {
        Boolean anagram = areAnagrams("teler", "leter");
        System.out.println("Son anagramas :" + anagram);
        int[] entradas = new int[4];
        int[] numeros = sumatoriaDeDos(entradas, 5);
        if (numeros == null) {
            System.out.println("Sin convinaciones posibles");
        } else {
            System.out.println("Numero 1: " + numeros[0]);
            System.out.println("Numero 2: " + numeros[1]);
        }
    }

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> palabra = new HashMap<>();
        for (Character character : str1.toCharArray()) {
            palabra.put(character, palabra.containsKey(character) ? palabra.get(character) + 1 : 1);
        }
        for (Character character : str2.toCharArray()) {
            try {
                palabra.replace(character, palabra.get(character) - 1);
            } catch (Exception e) {
                return false;
            }
        }

        for (Character lettCharacter : palabra.keySet()) {
            if (palabra.get(lettCharacter) < 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (map.containsKey(complemento)) {
                return new int[] { map.get(complemento), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
