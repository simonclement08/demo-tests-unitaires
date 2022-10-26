package immobilier;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Cuisine;
import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Piece;
import fr.diginamic.immobilier.entites.SalleDeBain;

public class MaisonTest {
	private static Maison maison = new Maison();
	
	@Test
	public void testAjouterPiece() {
		assertEquals(0, maison.nbPieces());
		Piece salleDeBain = new SalleDeBain(0, 10);
		maison.ajouterPiece(salleDeBain);
		assertEquals(1, maison.nbPieces());
		maison.ajouterPiece(null);
		assertEquals(1, maison.nbPieces());
	}
	
	@Test 
	public void testNbPieces() {
		assertEquals(0, maison.nbPieces());
		Piece cuisine = new Cuisine(0, 21);
		maison.ajouterPiece(cuisine);
		assertEquals(1, maison.nbPieces());
	}

}
