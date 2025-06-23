package sistema_de_recetas;

import org.junit.Before;

import java.util.ArrayList;

public class TestReceta {
    private SistemaReceta recetas;
    private PlatoPrincipal platoPrincipal
    @Before
    public void setup{
        Paso paso = new Paso("sangaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        ArrayList<Paso> pasos = new ArrayList<>();
        pasos.add(paso);
        pasos.add(paso);
        platoPrincipal = new PlatoPrincipal("milanesa",Dificultad.FACIL,pasos);

    }
}
