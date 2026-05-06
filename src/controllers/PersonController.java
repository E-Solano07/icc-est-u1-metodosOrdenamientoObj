package controllers;

import models.Person;

public class PersonController {
    
    // Metodo que ordena personas por su edad
    // usando insercion
    public void sortPeopleByAge(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && 
                    personas[j].getAge() < aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    public void sortPeopleByName(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && 
                    personas[j].getName().compareTo(aux.getName()) < 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    public void sortPeopleByAvr(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;


            while (j >= 0 && 
                    personas[j].getAverage() > aux.getAverage()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    private double average(Person p) {
        // calculo para sacar el promedio
        return 0.0;
    }
}