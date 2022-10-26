package utils;
import static org.junit.Assert.*;
import org.junit.Test;

import fr.diginamic.utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance () {
		assertEquals(1, StringUtils.levenshteinDistance("avion", "avon"));
		assertEquals(1, StringUtils.levenshteinDistance("avion", "avi on"));
		assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));
		assertEquals(2, StringUtils.levenshteinDistance("chien", "chine"));
		assertEquals(3, StringUtils.levenshteinDistance("chien", "Chine"));
		assertEquals(5, StringUtils.levenshteinDistance("chien", ""));
		assertEquals(5, StringUtils.levenshteinDistance("chien", null));
		assertEquals(5, StringUtils.levenshteinDistance(null, "chien"));
	}
}
