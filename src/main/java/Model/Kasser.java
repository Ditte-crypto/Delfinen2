package Model;

import Mapper.RestanceMapper;

import java.util.ArrayList;

public class Kasser {
    /*
    have en metode der omdanner brugerens ArrayList<Object> data til et medlem, og sender det videre til bogen.
     */
    public void tilfoejMedlemTilRestanceBog(int id, RestanceMapper rm, KasserBog kasserBog){
        kasserBog.tilfoejMedlemTilBog(id);
        rm.tilfoejMedlemByIdTilRestanceListe(id);
    }
}
