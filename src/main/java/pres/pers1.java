package ext;

import dao.DaoImpl;
import metier.Metier;

public class pers1 {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();

        Metier metier=new Metier();
        metier.setIdo(dao);
        System.out.println("res"+metier.calcul());

    }
}
