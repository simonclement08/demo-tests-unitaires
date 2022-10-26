package enumerations;

import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.enumerations.Saison;

public class SaisonTest {

	@Test
	public void testValueOfLibelle() {
		assertEquals("La saison avec le libéllé 'Printemps' est bien PRINTEMPS", Saison.PRINTEMPS,
				Saison.valueOfLibelle("Printemps"));

		assertEquals("La saison avec le libéllé 'Eté' est bien ETE", Saison.ETE, Saison.valueOfLibelle("Eté"));

		assertEquals("La saison avec le libéllé 'Automne' est bien AUTOMNE", Saison.AUTOMNE,
				Saison.valueOfLibelle("Automne"));

		assertEquals("La saison avec le libéllé 'Hiver' est bien HIVER", Saison.HIVER, Saison.valueOfLibelle("Hiver"));
	}

	@Test
	public void testValueOfLibelleNull() {
		assertNull(Saison.valueOfLibelle(null));
	}

	@Test
	public void testValueOfLibelleWrong() {
		assertNull("Il n'y a pas de saison avec le libellé 'hiver'", Saison.valueOfLibelle("hiver"));

		assertNull("Il n'y a pas de saison avec le libellé '5'", Saison.valueOfLibelle("5"));
	}

}
