package Model;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

public class MedlemTest {
    Medlem member;
    Medlem memberpass;
    Medlem memberjr;
    Medlem membersr;
    Medlem memberoldie;

    @Before
    public void setUp() throws Exception {
        //int id, String navn, int aargang, Boolean betalt, Boolean aktiv
        member = new Medlem(3,"Kurt",1990,true,true);
        memberpass = new Medlem(3,"An pass",1990,true,false);
        memberjr = new Medlem(3,"Viggo Child",2010,true,true);
        membersr = new Medlem(3,"Verner Sr",1990,true,true);
        memberoldie = new Medlem(3,"Granny",1930,true,true);
    }

    @Test
    public void calcFee() {
        int a = member.calcFee();
        int b = memberpass.calcFee();
        int c = memberjr.calcFee();
        int d = membersr.calcFee();
        int e = memberoldie.calcFee();
    }
}