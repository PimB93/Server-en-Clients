package model;

import java.sql.Blob;

public class User {
	
	/**
	 * Alle mogelijke statussen voor een gebruiker.
	 * <ul><li>active: zoekbaar en geactiveerd</li>
	 * <li>not_activated: niet zoekbaar en niet geactiveerd</li>
	 * <li>not_searchable: niet zoekbaar, wel geactiveerd</li></ul>
	 */
	private enum Status{
		ACTIVE, NOT_ACTIVATED, NOT_SEARCHABLE;
	}
	
	private String username;
	private String password;
	private String email;
	private String phonenumber;
	private String address;
	private String urlFacebook;
	private String urlLinkedIn;
	private String urlHomepage;
	private Blob photo;
	private boolean admin;
	private boolean emailVisible;
	private Status status = Status.NOT_ACTIVATED;
	
	/**
	 * Constructor voor wanneer niet alle gegevens bekend zijn (zoals bv. bij het registreren).
	 * @param username username van de gebruiker
	 * @param password wachtwoord van de gebruiker
	 * @param email emailadres van de gebruiker
	 */
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * Constructor voor wanneer alle gegevens bekend zijn.
	 * @param username
	 * @param password
	 * @param email
	 * @param phonenumber
	 * @param address
	 * @param urlFacebook
	 * @param urlLinkedIn
	 * @param urlHomepage
	 * @param photo
	 * @param admin
	 * @param emailVisible
	 * @param status
	 */
	public User(String username, String password, String email,
			String phonenumber, String address, String urlFacebook,
			String urlLinkedIn, String urlHomepage, Blob photo, boolean admin,
			boolean emailVisible, Status status) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.urlFacebook = urlFacebook;
		this.urlLinkedIn = urlLinkedIn;
		this.urlHomepage = urlHomepage;
		this.photo = photo;
		this.admin = admin;
		this.emailVisible = emailVisible;
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrlFacebook() {
		return urlFacebook;
	}

	public void setUrlFacebook(String urlFacebook) {
		this.urlFacebook = urlFacebook;
	}

	public String getUrlLinkedIn() {
		return urlLinkedIn;
	}

	public void setUrlLinkedIn(String urlLinkedIn) {
		this.urlLinkedIn = urlLinkedIn;
	}

	public String getUrlHomepage() {
		return urlHomepage;
	}

	public void setUrlHomepage(String urlHomepage) {
		this.urlHomepage = urlHomepage;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isEmailVisible() {
		return emailVisible;
	}

	public void setEmailVisible(boolean emailVisible) {
		this.emailVisible = emailVisible;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}
}
