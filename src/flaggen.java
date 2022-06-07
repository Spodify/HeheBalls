package src;


import ea.edu.Figur;

import java.util.Random;


public class flaggen {
        public Figur flagge;
        String flaggenName;
        int index;
    public flaggen(){


        String [] flaggenleicht = {"rsc/Flaggen Leicht GIF/Belgien.gif", "rsc/Flaggen Leicht GIF/Brasilien.gif", "rsc/Flaggen Leicht GIF/China.gif", "rsc/Flaggen Leicht GIF/Deutschland.gif","rsc/Flaggen Leicht GIF/England.gif", "rsc/Flaggen Leicht GIF/Finnland.gif",
                                    "rsc/Flaggen Leicht GIF/Frankreich.gif", "rsc/Flaggen Leicht GIF/Israel.gif", "rsc/Flaggen Leicht GIF/Italien.gif", "rsc/Flaggen Leicht GIF/Japan.gif", "rsc/Flaggen Leicht GIF/Kanada.gif", "rsc/Flaggen Leicht PNG/Kroatien.png",
                                    "rsc/Flaggen Leicht PNG/Mexiko.png", "rsc/Flaggen Leicht PNG/Niederlande.png", "rsc/Flaggen Leicht PNG/Norwegen.png", "rsc/Flaggen Leicht PNG/Polen.png", "rsc/Flaggen Leicht PNG/Portugal.png", "rsc/Flaggen Leicht PNG/Russland.png",
                                    "rsc/Flaggen Leicht PNG/Schweden.png", "rsc/Flaggen Leicht PNG/Schweiz.png", "rsc/Flaggen Leicht PNG/Spanien.png", "rsc/Flaggen Leicht PNG/Suedkorea.png","rsc/Flaggen Leicht PNG/Ukraine.png"};

        String [] flaggenmittel = {"rsc/Flaggen Mittel PNG/Afghanistan.png", "rsc/Flaggen Mittel PNG/Algerien.png", "rsc/Flaggen Mittel PNG/Bangladesch.png", "rsc/Flaggen Mittel PNG/Chile.png", "rsc/Flaggen Mittel PNG/Estland.png", "rsc/Flaggen Mittel PNG/Ghana.png",
                                    "rsc/Flaggen Mittel PNG/Irland.png", "rsc/Flaggen Mittel PNG/Jamaika.png", "rsc/Flaggen Mittel PNG/Kolumbien.png", "rsc/Flaggen Mittel PNG/Kuba.png", "rsc/Flaggen Mittel PNG/Malta.png", "rsc/Flaggen Mittel PNG/Nepal.png",
                                    "rsc/Flaggen Mittel PNG/Niger.png", "rsc/Flaggen Mittel PNG/Nordmazedonien.png", "rsc/Flaggen Mittel PNG/Philippinen.png", "rsc/Flaggen Mittel PNG/Saudi Arabien.png", "rsc/Flaggen Mittel PNG/Senegal.png", "rsc/Flaggen Mittel PNG/Serbien.png",
                                    "rsc/Flaggen Mittel PNG/Suedafrika.png", "rsc/Flaggen Mittel PNG/Zypern.png"};
        Random rand = new Random();
        int index = rand.nextInt(flaggenleicht.length);
        flaggenName = (flaggenleicht[index]);

        //flaggenName = ("rsc/Flaggen Leicht GIF/Belgien.gif");




        flagge = new Figur("normal",flaggenName);


    }
}
