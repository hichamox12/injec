package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Metier implements IMetier{
    @Autowired
    private IDao ido =null; // coupalge faible

    @Override
    public double calcul() {
        double data=ido.getDATA();
        double res=data*11.4;


        return res;
    }

    public void setIdo(IDao ido) {
        this.ido = ido;
    }
}
