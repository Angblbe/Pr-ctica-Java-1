import java.util.ArrayList;
import java.util.List;


public class Estudiant extends Persona {

    public double nota;
    public double notaMaxima;
    public double notaMinima;
    public double notaMitjana;

    public List<Double> notes = new ArrayList<Double>();




    public Estudiant(String dni, String nom, double nota) {
        super(dni, nom);

        if (nota < 0 || nota > 10){
            this.nota = 0;
            System.out.println("Error: Nota no valida per a: "+ nom +" nota de "+nota);
        }else {
            this.nota = nota;
            notes.add(nota);
        }
        calculNotes();


    }

    public void posarNota(double nota){

        if (nota < 0 || nota > 10){
            System.out.println("Error: Nota no valida per a: "+ nom +" nota de "+nota);
        }else {
            this.nota = nota;
            notes.add(nota);
        }

        calculNotes();
    }

    //ACTIVITAT 6 NOVA IMPLEMENTACIÓ NOTES
    public void calculNotes(){

        double suma = 0;
        double mitja = 0;

        int total = notes.size();

        if(nota > notaMaxima){
            notaMaxima = nota;
        }
        if(nota < notaMinima){
            notaMinima = nota;
        }
        for (int a = 0; a < notes.size(); a++){
            suma = suma + notes.get(a);

        }

        mitja = suma / total;

        notaMitjana = Math.round(mitja * 100.0)/100.0;
    }

    @Override
    public String obtenirDades() {

        return " Persona amb nom: "+ nom +" i DNI: " + dni+ " (ESTUDIANT amb nota mitjana: " + String.valueOf(notaMitjana) +")";

    }
}
