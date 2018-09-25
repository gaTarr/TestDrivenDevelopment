/**
 * This class creates a password object
 */
package model;

/**
 * @author GregTarr
 *
 */
public class Password {
	private String password;

	/**
	 * Default Constructor
	 */
	public Password() {
		
	}

	/**
	 * Constructor
	 * @param password
	 */
	public Password(String password) {
		this.password = password;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

}
