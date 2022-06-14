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
    String Master;
    int punkte;

    public TEXT Punktzahl;





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
        setzeAktiveSzene("title");
        erzeugeNeueSzene();
        flaggenl();
    }
    public void mittel(){
        erzeugeNeueSzene();
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
        flaggenNamel = (flaggenleicht[index]);
        //rsc/Flaggen Leicht GIF/Amerika.gif
        flaggeleicht = new Figur("normal","rsc/Flaggen Leicht GIF/"+flaggenNamel+".gif");
        flaggeleicht.setzeMittelpunkt(0,7.5);
        Master = "rsc/Button.gif";


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

        buttonL[0] = new Figur("button",Master);
        buttonL[0].setzeMittelpunkt(-3,-2.5);


        buttonL[1] = new Figur("button",Master);
        buttonL[1].setzeMittelpunkt(7,-2.5);


        buttonL[2] = new Figur("button",Master);
        buttonL[2].setzeMittelpunkt(-3,-8);


        buttonL[3] = new Figur("button",Master);
        buttonL[3].setzeMittelpunkt(7,-8);



        nameFlaggeL = new  TEXT[4];

        nameFlaggeL[0] = new TEXT(-3,-2.5,1,1);
        nameFlaggeL[0].setzeInhalt(bl0);
        nameFlaggeL[0].setzeMittelpunkt(-3,-2.5);

        nameFlaggeL[1] = new TEXT(7,-2.5,1,1);
        nameFlaggeL[1].setzeInhalt(bl1);
        nameFlaggeL[1].setzeMittelpunkt(7,-2.5);

        nameFlaggeL[2] = new TEXT(-3,-8,1,1);
        nameFlaggeL[2].setzeInhalt(bl2);
        nameFlaggeL[2].setzeMittelpunkt(-3,-8);

        nameFlaggeL[3] = new TEXT(7,-8,1,1);
        nameFlaggeL[3].setzeInhalt(bl3);
        nameFlaggeL[3].setzeMittelpunkt(7,-8);

        Punktzahl = new TEXT(2,2,1,1);
        Punktzahl.setzeInhalt(punkte);




        MausKlickReagierbar dieSendungMitDer;

        registriereMausKlickReagierbar(
                dieSendungMitDer = new MausKlickReagierbar() {

                    @Override
                    public void klickReagieren(double x, double y) {
                        if (buttonL[0].beinhaltetPunkt(x, y)&&loesungsButton2==0) {
                            System.out.println("1");
                            punkte();
                            leicht();

                        }
                        if (buttonL[1].beinhaltetPunkt(x, y)&&loesungsButton2==1) {
                            System.out.println("2");
                            punkte();
                            leicht();

                        }
                        if (buttonL[2].beinhaltetPunkt(x, y)&&loesungsButton2==2) {
                            System.out.println("3");
                            punkte();
                            leicht();

                        }
                        if (buttonL[3].beinhaltetPunkt(x, y)&&loesungsButton2==3) {
                            System.out.println("4");
                            punkte();
                            leicht();


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
        flaggenNameM = (flaggenmittel[index2]);
        System.out.println(loesungsButton);

        flaggemittel = new Figur("normal","rsc/Flaggen Mittel GIF/"+flaggenNameM+".gif");
        flaggemittel.setzeMittelpunkt(0,7.5);
        Master = "rsc/Button.gif";

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

        buttonM[0] = new Figur("button",Master);
        buttonM[0].setzeMittelpunkt(-3,-2.5);

        buttonM[1] = new Figur("button",Master);
        buttonM[1].setzeMittelpunkt(7,-2.5);

        buttonM[2] = new Figur("button",Master);
        buttonM[2].setzeMittelpunkt(-3,-8);

        buttonM[3] = new Figur("button",Master);
        buttonM[3].setzeMittelpunkt(7,-8);

        nameFlaggeM = new  TEXT[4];

        nameFlaggeM[0] = new TEXT(-3,-2.5,1,1);
        nameFlaggeM[0].setzeInhalt(bm0);
        nameFlaggeM[0].setzeMittelpunkt(-3,-2.5);

        nameFlaggeM[1] = new TEXT(7,-2.5,1,1);
        nameFlaggeM[1].setzeInhalt(bm1);
        nameFlaggeM[1].setzeMittelpunkt(7,-2.5);

        nameFlaggeM[2] = new TEXT(-3,-8,1,1);
        nameFlaggeM[2].setzeInhalt(bm2);
        nameFlaggeM[2].setzeMittelpunkt(-3,-8);

        nameFlaggeM[3] = new TEXT(7,-8,1,1);
        nameFlaggeM[3].setzeInhalt(bm3);
        nameFlaggeM[3].setzeMittelpunkt(7,-8);


        Punktzahl = new TEXT(2,2,1,1);
        Punktzahl.setzeInhalt(punkte);


        MausKlickReagierbar dieSendungMitDer;

        registriereMausKlickReagierbar(
                dieSendungMitDer = new MausKlickReagierbar() {

                    @Override
                    public void klickReagieren(double x, double y) {
                        //vlt Switch Case
                        if (buttonM[0].beinhaltetPunkt(x, y)&&loesungsButton==0) {
                            System.out.println("1");
                            punkte();
                            mittel();

                        }
                        if (buttonM[1].beinhaltetPunkt(x, y)&&loesungsButton==1) {
                            System.out.println("2");
                            punkte();
                            mittel();

                        }
                        if (buttonM[2].beinhaltetPunkt(x, y)&&loesungsButton==2) {
                            System.out.println("3");
                            punkte();
                            mittel();

                        }
                        if (buttonM[3].beinhaltetPunkt(x, y)&&loesungsButton==3) {
                            System.out.println("4");
                            punkte();
                            mittel();


                        }
                    }

                });

    }
    public void punkte(){
        punkte=punkte+10;

        System.out.println("punkte:"+punkte+".");

    }



}
