
import java.util.Date;

public class ProfessorSubstitut extends Profesor {

    public String dataInici;
    public String dataFi;

    public ProfessorSubstitut(String dni, String nom, double sou, String dataInici, String dataFi) {
        super(dni, nom, sou);
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public void assignarSubstitucio(String dataInici , String dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    @Override
    public String obtenirDades() {

        return " Persona amb nom: "+nom+ " i DNI: "+ dni + " (PROFE amb sou: "+ sou + ",del "+ dataInici+ " al "+ dataFi+" )";

    }

}
