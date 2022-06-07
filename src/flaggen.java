


import ea.edu.Figur;

import java.util.Random;


public class flaggen {
        public Figur flagge;
        String flaggenName;
        int index;
    public flaggen(){


        String [] flaggenleicht = {"rsc/Flaggen Leicht GIF/Belgien.gif", "rsc/Flaggen Leicht GIF/Brasilien.gif", "rsc/Flaggen Leicht GIF/China.gif", "rsc/Flaggen Leicht GIF/Deutschland.gif","rsc/Flaggen Leicht GIF/England.gif", "rsc/Flaggen Leicht GIF/Finnland.gif",
                                    "rsc/Flaggen Leicht GIF/Frankreich.gif", "rsc/Flaggen Leicht GIF/Israel.gif", "rsc/Flaggen Leicht GIF/Italien.gif", "rsc/Flaggen Leicht GIF/Japan.gif", "rsc/Flaggen Leicht GIF/Kanada.gif", "rsc/Flaggen Leicht GIF/Kroatien.gif",
                                    "rsc/Flaggen Leicht GIF/Mexiko.gif", "rsc/Flaggen Leicht GIF/Niederlande.gif", "rsc/Flaggen Leicht GIF/Norwegen.gif", "rsc/Flaggen Leicht GIF/Polen.gif", "rsc/Flaggen Leicht GIF/Portugal.gif", "rsc/Flaggen Leicht GIF/Russland.gif",
                                    "rsc/Flaggen Leicht GIF/Schweden.gif", "rsc/Flaggen Leicht GIF/Schweiz.gif", "rsc/Flaggen Leicht GIF/Spanien.gif", "rsc/Flaggen Leicht GIF/Suedkorea.gif","rsc/Flaggen Leicht GIF/Ukraine.gif"};

        String [] flaggenmittel = {"rsc/Flaggen Mittel GIF/Afghanistan.gif", "rsc/Flaggen Mittel GIF/Algerien.gif", "rsc/Flaggen Mittel GIF/Bangladesch.gif", "rsc/Flaggen Mittel GIF/Chile.gif", "rsc/Flaggen Mittel GIF/Estland.gif", "rsc/Flaggen Mittel GIF/Ghana.gif",
                                    "rsc/Flaggen Mittel GIF/Irland.gif", "rsc/Flaggen Mittel GIF/Jamaika.gif", "rsc/Flaggen Mittel GIF/Kolumbien.gif", "rsc/Flaggen Mittel GIF/Kuba.gif", "rsc/Flaggen Mittel GIF/Malta.gif", "rsc/Flaggen Mittel GIF/Nepal.gif",
                                    "rsc/Flaggen Mittel GIF/Niger.gif", "rsc/Flaggen Mittel GIF/Nordmazedonien.gif", "rsc/Flaggen Mittel GIF/Philipinen.gif", "rsc/Flaggen Mittel GIF/Saudi Arabien.gif", "rsc/Flaggen Mittel GIF/Senegal.gif", "rsc/Flaggen Mittel GIF/Serbien.gif",
                                    "rsc/Flaggen Mittel GIF/Suedafrika.gif", "rsc/Flaggen Mittel GIF/Zypern.gif"};
        Random rand = new Random();
        int index = rand.nextInt(flaggenleicht.length);
        flaggenName = (flaggenleicht[index]);

        //flaggenName = ("rsc/Flaggen Leicht GIF/Belgien.gif");




        flagge = new Figur("normal",flaggenName);


    }
}
