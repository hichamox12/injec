package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pers22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("velleuier utlliser la couche DAO ");
        String className=scanner.nextLine();
        Class cdao=Class.forName(className);
        IDao dao= (IDao) cdao.getConstructor().newInstance();
        //System.out.println(dao.getDATA());
        System.out.println("velleuier utlliser la couche Meteier ");
        String metierclassName=scanner.nextLine();
        Class mtr=Class.forName(metierclassName);
        IMetier metier=(IMetier) mtr.getConstructor().newInstance();

Method setIdo=mtr.getDeclaredMethod("setIdo",IDao.class);
setIdo.invoke(metier,dao);
        System.out.println("res"+metier.calcul());


    }
}
