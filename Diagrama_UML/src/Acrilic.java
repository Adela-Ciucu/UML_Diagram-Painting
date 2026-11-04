public class Acrilic extends Stil{
    private String culoriAcrilice;
    private String coli;
    private String pensule;
    private String paharCuApa;

    public Acrilic(String titlu, String autor,
                   String dimensiune, int anCreare,
                   double pret, String timpExecutie,
                   String culoriAcrilice,
                   String coli, String pensule,
                   String paharCuApa) {
        super(titlu, autor, dimensiune, anCreare, pret,
                "Acrilic", timpExecutie);

        this.culoriAcrilice = culoriAcrilice;
        this.coli = coli;
        this.pensule = pensule;
        this.paharCuApa = paharCuApa;
    }

    public void amestecaCulorile(){
        System.out.println("Culorile acrilice se amesteca pe paleta inainte de a fi puse pe panza.");
    }

    public void picteazaPePanza(){
        System.out.println("Se pune culoarea pe panza.");
    }

    public void materialeNecesare(){
        System.out.println("Culori acuarabile: " + culoriAcrilice);
        System.out.println("Tipul de coli: " + coli);
        System.out.println("Pensulele folosite sunt: " + pensule);
        System.out.println("Pahar cu apa: " + paharCuApa);
    }
}