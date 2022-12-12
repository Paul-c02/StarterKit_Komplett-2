package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {
        int sumW = 0;
        int sumM = 0;
        int countM = 0;
        int countW =0;
        for (Person p:super.getPersons()) {

            if(p.getGender()=='M') {
                countM++;
                sumM += p.getSize();
            }
            if(p.getGender()=='F') {
                countW++;
                sumW += p.getSize();
            }
        }
        System.out.println(countM + "Männer, Durchschnitt: " + (sumM / countM));
        System.out.println(countW + "Frauen, Durchschnitt: " + (sumW / countW));

    }
}
