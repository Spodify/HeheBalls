import ea.edu.Figur;
import ea.edu.Spiel;
import ea.edu.event.MausKlickReagierbar;

import java.util.Random;

public class Game extends Spiel {
    public Figur flaggeleicht;
    String flaggenNamel;
    public Figur flaggemittel;
    String flaggenNameM;
    public Figur[] buttonL;
    public Figur[] buttonM;
    String bl0;
    String bl1;
    String bl2;
    String bl3;
    String bm0;
    String bm1;
    String bm2;
    String bm3;


    public  Game(int width, int height){
        super();
        setzeFensterGroesse(width, height);
        titleScreen();



    }

    void titleScreen() {
        //benennt die aktive szene und ruft den titleScreen auf
        benenneAktiveSzene("title");
        TitleScreen ts = new TitleScreen();
        MausKlickReagierbar dieSendungMitDer;

        registriereMausKlickReagierbar(
                dieSendungMitDer = new MausKlickReagierbar() {

                    @Override
                    public void klickReagieren(double x, double y) {
                        if (ts.flaggenLeicht.beinhaltetPunkt(x, y)) {
                            leicht();
                        }
                        if (ts.flaggenMittel.beinhaltetPunkt(x, y)) {
                            mittel();

                        }
                    }

                });

    }



    public void leicht(){
        erzeugeNeueSzene();
        benenneAktiveSzene("leicht");
        flaggenl();
    }
    public void mittel(){
        erzeugeNeueSzene();
        benenneAktiveSzene("mittel");
        flaggenM();
    }
    public  void flaggenl(){


        String [] flaggenleicht = {"rsc/Flaggen Leicht GIF/Belgien.gif", "rsc/Flaggen Leicht GIF/Brasilien.gif", "rsc/Flaggen Leicht GIF/China.gif", "rsc/Flaggen Leicht GIF/Deutschland.gif","rsc/Flaggen Leicht GIF/England.gif", "rsc/Flaggen Leicht GIF/Finnland.gif",
                "rsc/Flaggen Leicht GIF/Frankreich.gif", "rsc/Flaggen Leicht GIF/Israel.gif", "rsc/Flaggen Leicht GIF/Italien.gif", "rsc/Flaggen Leicht GIF/Japan.gif", "rsc/Flaggen Leicht GIF/Kanada.gif", "rsc/Flaggen Leicht GIF/Kroatien.gif",
                "rsc/Flaggen Leicht GIF/Mexiko.gif", "rsc/Flaggen Leicht GIF/Niederlande.gif", "rsc/Flaggen Leicht GIF/Norwegen.gif", "rsc/Flaggen Leicht GIF/Polen.gif", "rsc/Flaggen Leicht GIF/Portugal.gif", "rsc/Flaggen Leicht GIF/Russland.gif",
                "rsc/Flaggen Leicht GIF/Schweden.gif", "rsc/Flaggen Leicht GIF/Schweiz.gif", "rsc/Flaggen Leicht GIF/Spanien.gif", "rsc/Flaggen Leicht GIF/Suedkorea.gif","rsc/Flaggen Leicht GIF/Ukraine.gif"};


        Random rand = new Random();
        Random loesung2 = new Random();
        int loesungsButton2 =loesung2.nextInt(4);
        int index = rand.nextInt(flaggenleicht.length);
        flaggenNamel = (flaggenleicht[index]);

        flaggeleicht = new Figur("normal",flaggenNamel);
        flaggeleicht.setzeMittelpunkt(0,7.5);



        if (loesungsButton2==0){
            bl0 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl0 = (flaggenleicht[index3]);
        }
        if (loesungsButton2==1){
            bl1 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl1 = (flaggenleicht[index3]);
        }
        if (loesungsButton2==2){
            bl2 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl2 = (flaggenleicht[index3]);
        }
        if (loesungsButton2==3){
            bl3 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl3 = (flaggenleicht[index3]);
        }
        buttonL = new Figur[4];
        buttonL[0] = new Figur("button",bl0);
        buttonL[0].setzeMittelpunkt(-3,-2.5);

        buttonL[1] = new Figur("button",bl1);
        buttonL[1].setzeMittelpunkt(7,-2.5);

        buttonL[2] = new Figur("button",bl2);
        buttonL[2].setzeMittelpunkt(7,-8);

        buttonL[3] = new Figur("button",bl3);
        buttonL[3].setzeMittelpunkt(-3,-8);

        MausKlickReagierbar dieSendungMitDer;

        registriereMausKlickReagierbar(
                dieSendungMitDer = new MausKlickReagierbar() {

                    @Override
                    public void klickReagieren(double x, double y) {
                        if (buttonL[0].beinhaltetPunkt(x, y)) {
                            System.out.println("1");
                        }
                        if (buttonL[1].beinhaltetPunkt(x, y)) {
                            System.out.println("2");

                        }
                        if (buttonL[2].beinhaltetPunkt(x, y)) {
                            System.out.println("3");
                        }
                        if (buttonL[3].beinhaltetPunkt(x, y)) {
                            System.out.println("4");

                        }
                    }


                });


    }
    public void  flaggenM(){
        String [] flaggenmittel = {"rsc/Flaggen Mittel GIF/Afghanistan.gif", "rsc/Flaggen Mittel GIF/Algerien.gif", "rsc/Flaggen Mittel GIF/Bangladesch.gif", "rsc/Flaggen Mittel GIF/Chile.gif", "rsc/Flaggen Mittel GIF/Estland.gif", "rsc/Flaggen Mittel GIF/Ghana.gif",
                "rsc/Flaggen Mittel GIF/Irland.gif", "rsc/Flaggen Mittel GIF/Jamaika.gif", "rsc/Flaggen Mittel GIF/Kolumbien.gif", "rsc/Flaggen Mittel GIF/Kuba.gif", "rsc/Flaggen Mittel GIF/Malta.gif", "rsc/Flaggen Mittel GIF/Nepal.gif",
                "rsc/Flaggen Mittel GIF/Niger.gif", "rsc/Flaggen Mittel GIF/Nordmazedonien.gif", "rsc/Flaggen Mittel GIF/Philipinen.gif", "rsc/Flaggen Mittel GIF/Saudi Arabien.gif", "rsc/Flaggen Mittel GIF/Senegal.gif", "rsc/Flaggen Mittel GIF/Serbien.gif",
                "rsc/Flaggen Mittel GIF/Suedafrika.gif", "rsc/Flaggen Mittel GIF/Zypern.gif"};

        Random rand2 = new Random();
        Random loesung = new Random();
        int loesungsButton =loesung.nextInt(4);
        int index2 = rand2.nextInt(flaggenmittel.length);
        flaggenNameM = (flaggenmittel[index2]);

        flaggemittel = new Figur("normal",flaggenNameM);
        flaggemittel.setzeMittelpunkt(0,7.5);

        if (loesungsButton==0){
            bm0 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm0 = (flaggenmittel[index3]);
        }
        if (loesungsButton==1){
            bm1 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm1 = (flaggenmittel[index3]);
        }
        if (loesungsButton==2){
            bm2 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm2 = (flaggenmittel[index3]);
        }
        if (loesungsButton==3){
            bm3 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm3 = (flaggenmittel[index3]);
        }

        buttonM = new Figur[4];
        buttonM[0] = new Figur("button",bm0);
        buttonM[0].setzeMittelpunkt(-3,-2.5);

        buttonM[1] = new Figur("button",bm1);
        buttonM[1].setzeMittelpunkt(7,-2.5);

        buttonM[2] = new Figur("button",bm2);
        buttonM[2].setzeMittelpunkt(7,-8);

        buttonM[3] = new Figur("button",bm3);
        buttonM[3].setzeMittelpunkt(-3,-8);

        MausKlickReagierbar dieSendungMitDer;

        registriereMausKlickReagierbar(
                dieSendungMitDer = new MausKlickReagierbar() {

                    @Override
                    public void klickReagieren(double x, double y) {
                        //vlt Switch Case
                        if (buttonM[0].beinhaltetPunkt(x, y)) {
                            System.out.println("1");
                        }
                        if (buttonM[1].beinhaltetPunkt(x, y)) {
                            System.out.println("2");
                        }
                        if (buttonM[2].beinhaltetPunkt(x, y)) {
                            System.out.println("3");
                        }
                        if (buttonM[3].beinhaltetPunkt(x, y)) {
                            System.out.println("4");

                        }
                    }

                });

    }



}
