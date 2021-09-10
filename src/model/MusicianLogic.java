/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package model;

public class MusicianLogic {
	public int calculateAlbumsSoldInYear(Musician musician) {
		int monthlyAlbumsSold = 0;
		monthlyAlbumsSold = musician.getAlbumsSold() * 12;
		return monthlyAlbumsSold;
	}
	
	public int calculateAlbumSalaryMade(Musician musician) {
		int albumCost = 10;
		int albumSalary = 0;
		albumSalary = musician.getAlbumsSold() * albumCost;
		return albumSalary;
	}
	
	public boolean isMusicianOld(Musician musician) {
		if (musician.getAge() > 50) {
			return true;
		}
		else {
			return false;
		}
	}
}