/*
Массив с набором слов создан небольшим, но расширить его можно, обход массива осуществлён по его длинне.
Я выбрал HashMap. Map - из-за пары "ключ-значение", отсюда вытекает, что нет нужды в очередной цикле обхода.
Обходим String'ов и уникальные имена записываем в Map, также устанавливаем счётчик.
Если такое имя уже существует, т.е. является "ключом", тогда увеличиваем счётчик.
 */

import java.util.*;

class taskOne {

    public static void main(String[] args) {

        String[] mas = {
                "a", "b", "c","d","e","q","w","r", "r"
        };

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < mas.length; i++) {
            if (hm.containsKey(mas[i])) {
                Integer value = hm.get(mas[i]);
                hm.put(mas[i], ++value);
            } else {
                hm.put(mas[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = hm.entrySet();

        for (Map.Entry<String, Integer> o: set) {
            System.out.println("Значение '" + o.getKey() + "' попадалось " + o.getValue() + " раз.");
        }


   } // main
} // class
