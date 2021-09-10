/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.MusicianLogic;
import model.Musician;

public class TestMusician {
	MusicianLogic musLog = new MusicianLogic();
	Musician musician = new Musician("Celine Dion");
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testCalculateAlbumsSoldInYear() {
		musician.setAlbumsSold(100);
		int monthlyAlbumsSold = musLog.calculateAlbumsSoldInYear(musician);
		assertEquals(1200, monthlyAlbumsSold);
	}
	
	@Test
	public void testCalculateAlbumSalaryMade() {
		musician.setAlbumsSold(100);
		int albumSalary = musLog.calculateAlbumSalaryMade(musician);
		assertEquals(1000, albumSalary);
	}
	
	@Test
	public void testIsMusicianOld() {
		musician.setAge(53);
		assertTrue(musLog.isMusicianOld(musician));
	}
}
