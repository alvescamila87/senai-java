package models;

import models.ClasseA;
import models.ClasseB;

public class TesteDefaultClasseABPackage {

    public static void main(String[] args) {

        ClasseA testeClasseA = new ClasseA();
        testeClasseA.metodoDefaultA(); // método da classe A, pois está dentro do mesmo pacote


        ClasseB testeClasseB = new ClasseB();
        testeClasseB.metodoDefaultB(); // método da classe B, pois está dentro do mesmo pacote
        


    }
}
