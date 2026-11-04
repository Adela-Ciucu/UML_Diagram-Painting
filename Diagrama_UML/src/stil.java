class Stil extends Pictura{
    protected String tehnica;
    protected String timpExecutie;

    public Stil(String titlu, String autor, String dimensiune,
                int anCreare, double pret, String tehnica, String timpExecutie ) {
        super(titlu, autor, dimensiune, anCreare, pret);

        this.tehnica = tehnica;
        this.timpExecutie = timpExecutie;
    }

    public void alegeTehnica(){
        System.out.println("Tehnica aleasa este: "+ tehnica);
    }

    public void pregatesteMaterialele(){
        System.out.println("Se pregatesc materialele necesare.");
    }
}