public class Main {
    public static void main(String[] args) {


        //Creació institut
        Institut ins = new Institut("La Guineueta");
        //Creació estudiant correcte
        Estudiant es1 = new Estudiant("456789C","Joan",5.6);
        ins.afegirPersona(es1);
        //Creació profesor correcte
        Profesor pro = new Profesor("65768G","Pau",1200.0);
        ins.afegirPersona(pro);
        //Creació profesor sustitut correcte
        ProfessorSubstitut pros = new ProfessorSubstitut("656565U","Manuel",1300.0,"08/07/2019","08/07/2020");
        ins.afegirPersona(pros);

        //***************************************************
        //MÈTODES

        //Cambiar nom
        Estudiant es2 = new Estudiant("","Joan",8.9);
        es2.canviarNom("Paula");
        //Assiganr DNI si es null
        es2.assignarDni("111111");
        ins.afegirPersona(es2);

        //Nota mitja
        Estudiant es3 = new Estudiant("345679P","Marta",3.2);
        es3.posarNota(6.0);
        es3.posarNota(4.2);
        es3.posarNota(6.8);
        es3.posarNota(3.9);
        es3.posarNota(8.4);
        es3.posarNota(7.2);
        ins.afegirPersona(es3);

        //Cambiar sou
        Profesor pro2 = new Profesor("656768P","Joel",1200.0);
        pro2.canviarSou(2000.0);
        ins.afegirPersona(pro2);

        //Cambiar dates professor substitut
        ProfessorSubstitut pros2 = new ProfessorSubstitut("333333F","Aitor",1100.0,"08/07/2019","08/07/2020");
        pros2.assignarSubstitucio("12/02/2020","16/12/2023");
        ins.afegirPersona(pros2);

        //*************************************************************
        //EXCEPCIONS
        //Persona sense nom
        Estudiant es4 = new Estudiant("456789C","",9.0);
        ins.afegirPersona(es4);

        //Persona sense DNI
        Estudiant es5 = new Estudiant("","Julia",9.0);
        ins.afegirPersona(es5);

        //Canvi dni persona amb dni
        Estudiant es6 = new Estudiant("77788U","Dalton",0.0);
        es6.assignarDni("8676767P");
        ins.afegirPersona(es6);

        //Cambiar sou no valid
        Profesor pro3 = new Profesor("9797C","Javier",2200.0);
        pro3.canviarSou(100000.0);
        ins.afegirPersona(pro3);

        //Nota no valida
        Estudiant es7 = new Estudiant("757575T","Paolo",16.0);
        ins.afegirPersona(es7);


        //***********************************

        //IMPRIMIR DADES
        ins.imprimirinformacio();


    }
}
