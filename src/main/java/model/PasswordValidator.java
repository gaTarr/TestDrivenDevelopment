/**
 * This class checks password object to make sure it meets 
 * various requirements.  
 */
package model;

/**
 * @author GregTarr
 *
 */
public class PasswordValidator {

	
	/**
	 * This method checks length of Password object
	 * to make sure it's between 6 and 20 characters.
	 * @param password
	 * @return
	 */
	public boolean meetsLengthReq(Password password) {
		boolean lengthReq;
		if (password.getPassword().length() >= 6 && password.getPassword().length() <= 20) {
			lengthReq = true;
		} else {
			lengthReq = false;
		}
		return lengthReq;
	}
	
	/**
	 * This method verifies that the password contains both
	 * upper and lower case characters.
	 * @param password
	 * @return
	 */
	public boolean meetsCaseReq(Password password) {
		boolean caseReq = false;
		for (int i = 1; i < password.getPassword().length(); i++) {
			char ch = password.getPassword().charAt(i);
			if (Character.isUpperCase(ch)) {
				caseReq = true;
			} else {
				caseReq = false;
			}			
		}
		return caseReq;
	}
	
	/**
	 * This method verifies that the password contains at least
	 * one number character.
	 * @param password
	 * @return
	 */
	/*
	public boolean meetsNumberReq(Password password) {
		boolean numberReq;
		return numberReq;
	}*/

}
