/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package model;

public class Musician {
	// variables
	private String name;
	private int age;
	private int monthlyAlbumsSold;
	
	// default no args constructor
	public Musician(String string) {

	}
	
	// constructor with args
	public Musician(String name, int age, int monthlyAlbumsSold) {
		this.name = name;
		this.age = age;
		this.monthlyAlbumsSold = monthlyAlbumsSold;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAlbumsSold() {
		return monthlyAlbumsSold;
	}

	public void setAlbumsSold(int monthlyAlbumsSold) {
		this.monthlyAlbumsSold = monthlyAlbumsSold;
	}
}
