import ea.edu.Figur;

public class TitleScreen {
    public Figur flaggenLeicht;
    public Figur flaggenMittel;
    TitleScreen(){
        flaggenLeicht = new Figur ("button","rsc/Flaggen Leicht GIF/Belgien.gif");
        flaggenLeicht.setzeMittelpunkt(0,-4.3);
        flaggenMittel = new Figur ("button","rsc/Flaggen Mittel GIF/Afghanistan.gif");
        flaggenMittel.setzeMittelpunkt(0,-4.3);
    }


}
