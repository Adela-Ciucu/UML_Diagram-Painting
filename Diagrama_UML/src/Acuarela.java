public class Acuarela extends Stil {
    private String culoriAcuarela;
    private String coli;
    private String pensule;
    private String paharCuApa;

    public Acuarela(String titlu, String autor,
                    String dimensiune, int anCreare,
                    double pret, String timpExecutie,
                    String culoriAcuarela,
                    String coli, String pensule,
                    String paharCuApa) {
        super(titlu, autor, dimensiune, anCreare, pret,
                "Acuarela", timpExecutie);

        this.culoriAcuarela = culoriAcuarela;
        this.coli = coli;
        this.pensule = pensule;
        this.paharCuApa = paharCuApa;
    }
    public void dilueazaCulorile(){
        System.out.println("Culorile se diluaza cu apa in cantitati diferite pentru a obtine intensitati diferite.");
    }

    public void picteazaPeHartie(){
        System.out.println("Se picteaza pe harie:" + coli);
    }

    public void materialeNecesare(){
        System.out.println("Culori acuarabile: " + culoriAcuarela);
        System.out.println("Tipul de coli: " + coli);
        System.out.println("Pensulele folosite sunt: " + pensule);
        System.out.println("Pahar cu apa: " + paharCuApa);
    }
}