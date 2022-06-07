import ea.edu.Spiel;
import ea.edu.event.MausKlickReagierbar;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Game extends Spiel {

    public  Game(int width, int height){
        super();
        setzeFensterGroesse(width, height);
        titleScreen();



    }

    public void flaggenL(){

        flaggen f1 = new flaggen();
    }
    void titleScreen(){
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
                            }if(ts.flaggenMittel.beinhaltetPunkt(x, y)){
                                mittel();

                            }
                        }

                    });


        }

    public void leicht(){
        erzeugeNeueSzene();
        benenneAktiveSzene("lecht");
    }
    public void mittel(){
        erzeugeNeueSzene();
        benenneAktiveSzene("mittel");
    }

    }

}
