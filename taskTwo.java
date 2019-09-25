/*
В качестве объекта выбран HashMap, где ключом выбран String, а значением динамический массив ArrayList<String>.
Мне кажется, что в таком случае создаётся/сохраняется гибкость, где с каждым из элементов в дальнейшем можно работать.
Методы описаны как static для простоты.
 */

import java.util.*;

class taskTwo {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        add(hm, "Gendalf", "3-13-00");
        add(hm, "Pypkin", "3-12-00");
        add(hm, "Gendalf", "3-15-00");

        get(hm, "Gendalf");
        



    }//main

    static void add(HashMap<String, ArrayList<String>> phonebook, String surname, String number){

        if (phonebook.containsKey(surname)) {
            phonebook.get(surname).add(number);
        }else {
            ArrayList<String> DD = new ArrayList<>();
            DD.add(number);
            phonebook.put(surname, DD);
        }
    }

    static void get(HashMap<String, ArrayList<String>> phonebook, String surname){
        try {
            String[] a = new String[phonebook.get(surname).size()];
            System.out.println(phonebook.get(surname));
        } catch (NullPointerException e){
            System.out.println("Такой фамилии нет.");
        }
    }
}//DDC
