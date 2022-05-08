public  class Profesor extends Persona {

    public double sou;

    public Profesor(String dni, String nom, double sou) {
        super(dni, nom);

        if(sou > 3000.0 || sou < 0.0 ){
            this.sou = 0;
            System.out.println("Error: sou no valid per a: "+ nom);
        }else{
            this.sou = sou;
        }

    }

    public void canviarSou(double nouSou){

        if(nouSou > 3000.0 || nouSou < 0.0 ){

            System.out.println("Error: sou no valid per a: "+ nom);

        }else{
            this.sou = nouSou;
        }
    }

    @Override
    public String obtenirDades() {

        return " Persona amb nom: "+nom+ " i DNI: "+ dni + " (PROFE amb sou: "+ sou + ")";

    }
}
