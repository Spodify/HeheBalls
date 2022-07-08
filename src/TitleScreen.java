import ea.actor.Text;
import ea.edu.Figur;

import java.awt.*;

public class TitleScreen {
    public Figur flaggenLeicht;
    public Figur flaggenMittel;
    public Figur hintergrund;
    public Figur hintergrundE;
    TitleScreen(){
        hintergrundE = new Figur("background","rsc/himmel.gif");
        hintergrundE.skaliere(1.89);
        hintergrundE.setzeMittelpunkt(0,3);

        
        hintergrund = new Figur("background", "rsc/MenuHintergrund.gif");
        hintergrund.skaliere(3);
        hintergrund.setzeMittelpunkt(0,-3);
        
        flaggenLeicht = new Figur ("button","rsc/LeichtButton.gif");
        flaggenLeicht.setzeMittelpunkt(0,0);


        flaggenMittel = new Figur ("button","rsc/MittelButton.gif");
        flaggenMittel.setzeMittelpunkt(0,-7.5);
    }


}
