package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Set<City> set = new HashSet<>();
        set.add(new City(312, "Bishkek"));
        set.add(new City(1, "Paris"));
        set.add(new City(212, "New-York"));
        set.add(new City(495, "Moscow"));
        set.add(new City(20, "London"));
        set.removeIf(a->a.getCode()%2==0);
        Set<City> setTak = new TreeSet<>(set);
        for (City city : setTak) {
            System.out.println(city);
        }
        }
}


  /*
City деген класс тузунуз. (code, name, ...) if (city.getCode() % 2 != 0) {

                System.out.println(city);
Эгерде code так сан болсо TreeSetke салыныз.
Аларды чонунан кичинесине караган тартипте чыгарыныз.
 */