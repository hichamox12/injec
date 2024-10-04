package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl  implements  IDao{
    @Override
    public double getDATA() {
        System.out.println("version base de donéess");
        double data=30;

        return data;

    }
}
