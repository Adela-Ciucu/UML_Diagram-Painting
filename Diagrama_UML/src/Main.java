public class Main {
    public static void main(String[] args){
        Acuarela pictura1 = new Acuarela(
                "Maci albi",
                "Adela",
                "32 x 24,5 cm",
                2026,
                150,
                "2 ore si 30 minute",
                "Albastru, alb, verde, galben, portocaliu, negru",
                "Hartie speciala pentru acuarela presata la rece.",
                "Pensule fine",
                "Pahar cu apa"
        );

        Acrilic pictura2 = new Acrilic(
                "The Dean Bridge Edinburgh, Scotland",
                "Adela",
                "30 x 40 cm",
                2022,
                650,
                "3 luni si 15 zile",
                "Albastru, verde, alb, gri, mov, portocaliu, galben ocru",
                "Panza pentru pictura",
                "Pensule plate, rotunde si subtiri.",
                "Pahar cu apa"
        );

        System.out.println("PICTURA 1 - ACUARELA");

        pictura1.afisareInformatii();
        pictura1.alegeTehnica();
        pictura1.pregatesteMaterialele();
        pictura1.materialeNecesare();
        pictura1.startPictura();
        pictura1.culoriFolosite();
        pictura1.dilueazaCulorile();
        pictura1.picteazaPeHartie();
        pictura1.varnishPictura();

        System.out.println("PICTURA 2 - ACUARELA");

        pictura2.afisareInformatii();
        pictura2.alegeTehnica();
        pictura2.pregatesteMaterialele();
        pictura2.materialeNecesare();
        pictura2.startPictura();
        pictura2.culoriFolosite();
        pictura2.amestecaCulorile();
        pictura2.picteazaPePanza();
        pictura2.varnishPictura();

    }
}
