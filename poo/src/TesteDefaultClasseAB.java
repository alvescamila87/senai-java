import models.ClasseA;
import models.ClasseB;

public class TesteDefaultClasseAB {

    public static void main(String[] args) {

        ClasseA testeClasseA = new ClasseA();
        // fora do pacote não permite o acesso do método da própria classe

        ClasseB testeClasseB = new ClasseB();
        // fora do pacote não permite o acesso do método da própria classe



    }
}
