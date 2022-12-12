package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{
    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (Person p:super.getPersons()) {
            double bmi = calcBMI(p);
            result.add(new Pair<>(p, bmi));
        }
    }
    private double calcBMI(Person p){
        return p.getWeight()/((p.getSize()/100.0)*(p.getSize()/100.0));
    }
}
