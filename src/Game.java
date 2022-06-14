import ea.actor.Text;
import ea.edu.Figur;
import ea.edu.Spiel;
import ea.edu.event.MausKlickReagierbar;
import ea.internal.io.FontLoader;

import java.awt.*;
import java.util.Random;


public class Game extends Spiel {
    public Figur flaggeleicht;
    String flaggenNamel;
    public Figur flaggemittel;
    String flaggenNameM;
    public Figur[] buttonL;
    public Figur[] buttonM;

    public TEXT[] nameFlaggeL;
    public TEXT[] nameFlaggeM;
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

        //Text titel = new Text("Flaggenquiz", 4.5f);
        //titel.setContent("Balls");
        //titel.setOpacity(100);
        //titel.setColor(Color.white);
        //titel.setCenter(0,0);
        //add(titel);




    }
    //public void Spielname(float height, int fontstyle, String content){
        //Text name = new Text();}


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



        String [] flaggenleicht = {"Amerika", "Belgien", "Brasilien", "China", "Deutschland","England", "Finnland",
                "Frankreich", "Israel", "Italien", "Japan", "Kanada", "Kroatien",
                "Mexiko", "Niederlande", "Norwegen", "Polen", "Portugal", "Russland",
                "Schweden", "Spanien", "Suedkorea"};


        Random rand = new Random();
        Random loesung2 = new Random();
        int loesungsButton2 =loesung2.nextInt(4);
        int index = rand.nextInt(flaggenleicht.length);
        flaggenNamel = ("rsc/Flaggen Leicht GIF/"+flaggenleicht[index]+".gif");
        //rsc/Flaggen Leicht GIF/Amerika.gif
        flaggeleicht = new Figur("normal",flaggenNamel);
        flaggeleicht.setzeMittelpunkt(0,7.5);



        if (loesungsButton2==0){
            bl0 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl0 = ("rsc/Flaggen Leicht GIF/"+flaggenleicht[index3]+".gif");
        }
        if (loesungsButton2==1){
            bl1 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl1 = ("rsc/Flaggen Leicht GIF/"+flaggenleicht[index3]+".gif");
        }
        if (loesungsButton2==2){
            bl2 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl2 = ("rsc/Flaggen Leicht GIF/"+flaggenleicht[index3]+".gif");
        }
        if (loesungsButton2==3){
            bl3 = flaggenNamel;
        }
        else {
            int index3 = rand.nextInt(flaggenleicht.length);
            bl3 = ("rsc/Flaggen Leicht GIF/"+flaggenleicht[index3]+".gif");
        }

        nameFlaggeL = new  TEXT[4];
        nameFlaggeL[0] = new TEXT(-3,-2.5,1,1);
        nameFlaggeL[0].setzeInhalt(bl0);
        nameFlaggeL[1] = new TEXT(-3,-2.5,1,1);
        nameFlaggeL[1].setzeInhalt(bl1);
        nameFlaggeL[2] = new TEXT(-3,-2.5,1,1);
        nameFlaggeL[2].setzeInhalt(bl2);
        nameFlaggeL[3] = new TEXT(-3,-2.5,1,1);
        nameFlaggeL[3].setzeInhalt(bl3);


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
        String [] flaggenmittel = {"Afghanistan", "Ägypten", "Algerien", "Bulgarien", "Chile", "Estland", "Ghana",
                "Irland", "Jamaika", "Kolumbien", "Kuba", "Niger", "Niger", "Nordmazedonien", "Philipinen", "Saudi Arabien", "Senegal", "Suedafrika",
                "Thailand", "Zypern"};

        Random rand2 = new Random();
        Random loesung = new Random();
        int loesungsButton =loesung.nextInt(4);
        int index2 = rand2.nextInt(flaggenmittel.length);
        flaggenNameM = ("rsc/Flaggen Mittel GIF/"+flaggenmittel[index2]+".gif");

        flaggemittel = new Figur("normal",flaggenNameM);
        flaggemittel.setzeMittelpunkt(0,7.5);

        if (loesungsButton==0){
            bm0 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm0 = ("rsc/Flaggen Mittel GIF/"+flaggenmittel[index3]+".gif");
        }
        if (loesungsButton==1){
            bm1 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm1 = ("rsc/Flaggen Mittel GIF/"+flaggenmittel[index3]+".gif");
        }
        if (loesungsButton==2){
            bm2 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm2 = ("rsc/Flaggen Mittel GIF/"+flaggenmittel[index3]+".gif");
        }
        if (loesungsButton==3){
            bm3 = flaggenNameM;
        }
        else {
            int index3 = rand2.nextInt(flaggenmittel.length);
            bm3 = ("rsc/Flaggen Mittel GIF/"+flaggenmittel[index3]+".gif");
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
