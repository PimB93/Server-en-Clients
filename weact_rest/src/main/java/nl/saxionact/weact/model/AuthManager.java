package nl.saxionact.weact.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/**
 * @author WeACT, Rest Server Group
 * @author Martin Gaida (#310982)
 * 
 *  This class implements security methods to enable possible logins, etc.
 */

public class AuthManager {
	private HashMap<String, String> userTokens;
	//private HashSet<String> validTokens;
	
	// constructor
	public AuthManager() {
		this.userTokens = new HashMap<>();
	}
	
	/**
	 * if a login was successful this method is called
	 * 
	 * @param user the username to login
	 * @return the token
	 */
	public String logIn(String user) {
		String token = generateSessionToken(user);
			
		Set<String> keys = userTokens.keySet();
			
		for (String key : keys) {
			if (userTokens.get(key).equals(user))
				userTokens.remove(key);
		}
			
		userTokens.put(token, user);
			
		return token; 
	}
	
	// ** creation **
	
	/**
	 * 
	 * @param authHead the header to extract the token from
	 * @return returns the token only (removes "bearer ")
	 */
	public String extractOnlyToken(String authHead) {
		if ((authHead != null) && (!authHead.equals(""))) {
			return authHead.substring(7);			
		} else
			return null;

	}
	
	/**
	 * 
	 * @param username the username to generate the hash from
	 * @return a session token
	 */
	public String generateSessionToken(String username) {
		String food = username + (new Date().getTime()) + Math.random();
		
		try {
			return hash(food);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	// ** validation **
	
	/**
	 * 
	 * @param token the token to get the username from
	 * @return returns the username if valid token
	 */
	public String getUserFromToken(String token) {
		if (userTokens.containsKey(token))
			return userTokens.get(token);
		else
			return null;
	}
	
	/**
	 * 
	 * @param authText the header String to verify the user from
	 * @return returns true if the header token is a valid user token; otherwise false
	 */
    public boolean verifyAuthHeader(String authText) {
    	if ((authText == null) || (authText.equals("")))
    		return false;
    	
    	// remove bearer
    	String token = extractOnlyToken(authText);
    	
    	System.out.println("Token : " + token);
    	
    	// username
    	String usern = getUserFromToken(token);
    	
    	// als het een valid user token is
    	if ((usern != null) && (!usern.equals(""))) {
    		return true;
    	}
    	return false;
    }

    // ** hashing **
    
	/**
	 * 
	 * @param a String to be hashed
	 * @return a SHA1 hashed String representation of the input value 
	 * @throws NoSuchAlgorithmException
	 */
	public static String hash(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA1");
		byte[] bytesEncr = md.digest(input.getBytes());
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bytesEncr.length; i++) {
			sb.append(Integer.toString((bytesEncr[i] & 0xff) + 0x100, 16).substring(1));
		}
		
		return sb.toString();
	}
}
