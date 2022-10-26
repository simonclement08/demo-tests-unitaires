package immobilier;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Cuisine;
import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Piece;
import fr.diginamic.immobilier.entites.SalleDeBain;
import fr.diginamic.immobilier.entites.Salon;
import fr.diginamic.immobilier.entites.WC;

public class MaisonTest {

	Maison maison = new Maison();

	@Test
	public void testAjouterPiece() {
		assertEquals(0, maison.nbPieces());
		Piece salleDeBain = new SalleDeBain(0, 10);
		maison.ajouterPiece(salleDeBain);
		assertEquals(1, maison.nbPieces());
	}

	@Test
	public void testAjouterPieceNull() {
		maison.ajouterPiece(null);
		assertEquals(0, maison.nbPieces());
	}

	@Test
	public void testNbPieces() {
		assertEquals(0, maison.nbPieces());
		Piece cuisine = new Cuisine(0, 21);
		maison.ajouterPiece(cuisine);
		assertEquals(1, maison.nbPieces());
	}

	@Test
	public void testSuperficieEtageMaisonVide() {
		assertTrue(maison.superficieEtage(0) == 0);
	}

	@Test
	public void testSuperficieEtage() {
		Piece wc = new WC(0, 8);
		maison.ajouterPiece(wc);
		assertTrue(maison.superficieEtage(0) == 8);
	}

	@Test
	public void testSuperficieEtageVide() {
		Piece wc = new WC(0, 8);
		maison.ajouterPiece(wc);
		assertTrue(maison.superficieEtage(1) == 0);
	}

	@Test
	public void testSuperficieTypePieceMaisonVide() {
		assertTrue(maison.superficieTypePiece(Piece.TYPE_WC) == 0);
	}

	@Test
	public void testSuperficieTypePiece() {
		Piece wc = new WC(0, 8);
		maison.ajouterPiece(wc);
		assertTrue(maison.superficieTypePiece(Piece.TYPE_WC) == 8);
	}

	@Test
	public void testSuperficieTypePieceNull() {
		Piece wc = new WC(0, 8);
		maison.ajouterPiece(wc);
		assertTrue(maison.superficieTypePiece(null) == 0);
	}

	@Test
	public void testSuperficieTypePieceVide() {
		Piece wc = new WC(0, 8);
		maison.ajouterPiece(wc);
		assertFalse(maison.superficieTypePiece(Piece.TYPE_CHAMBRE) == 8);
	}

	@Test
	public void testCalculerSurface() {
		Piece salon = new Salon(0, 20);
		Piece chambre = new Chambre(1, 21);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(chambre);
		assertTrue(maison.calculerSurface() == 41);
	}

	@Test
	public void testCalculerSurfaceMaisonVide() {
		assertTrue(maison.calculerSurface() == 0);
	}

}
