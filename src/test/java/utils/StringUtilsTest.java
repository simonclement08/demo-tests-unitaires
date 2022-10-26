package utils;
import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance () {
		assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));
	}
	
	@Test
	public void testLevenshteinDistanceReplaceInsert () {
		assertEquals(1, StringUtils.levenshteinDistance("avion", "avi on"));
	}
	
	@Test
	public void testLevenshteinDistanceReplace () {
		assertEquals(2, StringUtils.levenshteinDistance("chien", "chine"));
		assertEquals(3, StringUtils.levenshteinDistance("chien", "Chine"));
	}
	
	@Test
	public void testLevenshteinDistanceReplaceDelete () {
		assertEquals(1, StringUtils.levenshteinDistance("avion", "avon"));
		assertEquals(5, StringUtils.levenshteinDistance("chien", ""));
	}
	
	@Test
	public void testLevenshteinDistanceFirstArgumentNull () {
		assertEquals(5, StringUtils.levenshteinDistance(null, "chien"));
	}
	
	@Test
	public void testLevenshteinDistanceSecondArgumentNull () {
		assertEquals(5, StringUtils.levenshteinDistance("chien", null));
	}
}
