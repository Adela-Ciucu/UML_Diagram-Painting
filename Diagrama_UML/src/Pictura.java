class Pictura{
    protected String titlu;
    protected String autor;
    protected String dimensiune;
    protected int anCreare;
    protected double pret;

    public Pictura(String titlu, String autor, String dimensiune,
                   int anCreare, double pret){
        this.titlu = titlu;
        this.autor = autor;
        this.dimensiune = dimensiune;
        this.anCreare = anCreare;
        this.pret = pret;
    }

    public void startPictura(){
        System.out.println("Pictorul: " + autor + " alege stilul de pictura si incepe sa lucreze la tablou: " + titlu);
    }

    public void culoriFolosite(){
        System.out.println("Se aleg culorile care se vor folosi la realizarea picturii.");
    }

    public void varnishPictura(){
        System.out.println("Varnish-ul folosit este specific pentru stilul ales");
    }

    public void afisareInformatii(){
        System.out.println("Titlu: " + titlu);
        System.out.println("Autor: " + autor);
        System.out.println("Dimensiune: " + dimensiune);
        System.out.println("An creare: " + anCreare);
        System.out.println("Pret: " + pret);

    }
}