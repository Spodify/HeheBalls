import ea.actor.Text;
import ea.edu.Figur;

import java.awt.*;

public class TitleScreen {
    public Figur flaggenLeicht;
    public Figur flaggenMittel;
    TitleScreen(){
        flaggenLeicht = new Figur ("button","rsc/Flaggen Leicht GIF/Belgien.gif");
        flaggenLeicht.setzeMittelpunkt(0,0);


        flaggenMittel = new Figur ("button","rsc/Flaggen Mittel GIF/Afghanistan.gif");
        flaggenMittel.setzeMittelpunkt(0,-7.5);
    }


}
