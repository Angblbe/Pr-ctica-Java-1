import java.util.ArrayList;

public class Institut {

    public String nom;

    ArrayList<Persona> integrants = new ArrayList<>();



    public Institut(String nom) {
        this.nom = nom;
    }

    //REDUNDÂNCIA
    /*

    public void afegirProfe(Profesor profe){
        integrants.add(profe);

    }

    public void afegirEstudiant( Estudiant estudiant){
        integrants.add(estudiant);

    }
    */

    // SEGONA PART ACTIVITAT 5
    public void afegirPersona( Persona persona){
        integrants.add(persona);

    }


    public void imprimirinformacio(){
        System.out.println("Institut: "+nom+" llista de persones:");
        for (int a = 0; a < integrants.size(); a++){
            System.out.println(integrants.get(a).obtenirDades());
        }
    }
}
