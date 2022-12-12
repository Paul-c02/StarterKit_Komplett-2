package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{
    HashMap<String, Integer> result = new HashMap<>();
    @Override
    public void analyze() {
        for (Person p:super.getPersons()){
            String country = p.getCountry();
            if(result.containsKey(country)) {
                result.put(country, result.get(country) + 1);
            }else result.put(country , 1);
        }
    }

    public HashMap<String, Integer> getResult() {
        return result;
    }
}
