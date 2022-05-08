public abstract class Persona {
    public String dni;
    public String nom;


    public Persona(String dni, String nom) {
        if (dni.isEmpty()){
            System.out.println("Error: Persona amb nom: "+nom+" no te DNI");
            this.dni = "NULL";
        }else {
            this.dni = dni;
        }

        if (nom.isEmpty()){
            System.out.println("Error: Persona amb dni: "+dni+" no te NOM");
            this.nom = "NULL";
        }else {
            this.nom = nom;
        }

    }


    public void canviarNom( String nom){
        this.nom = nom;
    }

    public void assignarDni(String dni){
        if(this.dni == "NULL"){
            this.dni = dni;
        }else {
            System.out.println("Error : No es pot canviar el DNI de : "+nom + " a dni:  "+dni);
        }
    }


    public abstract String obtenirDades();
}
