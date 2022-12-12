package org.campus02.oop;

import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {
        int max = 0;
        for (Person p : super.getPersons()) {
            if (max < p.getSalary()) {
                max = p.getSalary();
            }
        }
        for (Person p : super.getPersons()) {
            if (max == p.getSalary()) System.out.println(p.toString());
        }

    }
}
