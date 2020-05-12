package Mapper;

import Model.Medlem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedlemsMapperTest {
    /*
    public void lavNytMedlem(ArrayList<Object> medlemsinfo, MedlemsBog medlemsBog){
        //lav medlemsobject Medlem medlem = nyt Medlem(); bedre med hashmap
        String navn = (String) medlemsinfo.get(0);
        int aargang = (int) medlemsinfo.get(1);
        Boolean betalt = (Boolean) medlemsinfo.get(2);
        Boolean aktiv = (Boolean) medlemsinfo.get(3);
        Medlem medlem = new Medlem(navn, aargang, betalt, aktiv);
        medlemsBog.tilfoejMedlemTilBog(medlem);
    }
     */
MedlemsMapper medlemsMapper;
Medlem medlem;
    @Before
    public void setUp() throws Exception {
        medlemsMapper = new MedlemsMapper();
        //medlem = new Medlem("Anders", 1987, true, true);
        medlem = new Medlem("kurt", 1878, false, false);
    }

    @Test
    public void lavNytMedlem() {
        medlemsMapper.lavNytMedlem(medlem);
    }

    @Test
    public void getAllMedlemmer() {
    }

    @Test
    public void deleteMedlem() {
        medlemsMapper.deleteMedlem(2);
    }
}