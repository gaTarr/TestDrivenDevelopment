/**
 * 
 */
package password;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Password;
import model.PasswordValidator;

/**
 * @author Greg Tarr
 *
 */
public class TestPasswordValidator {
	PasswordValidator pv = new PasswordValidator();
	Password password = new Password("PassWord123");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMeetsLengthReqShort() {
		password.setPassword("Passw");
		boolean length = pv.meetsLengthReq(password);
		assertFalse(length);		
	}
	
	@Test
	public void testMeetsLengthReqLong() {
		password.setPassword("Password1234567890password");
		boolean length = pv.meetsLengthReq(password);
		assertFalse(length);		
	}

	@Test
	public void testMeetsLengthReq() {
		password.setPassword("Password1234");
		boolean length = pv.meetsLengthReq(password);
		assertTrue(length);		
	}
	
	@Test
	public void testMeetsCaseReq() {
		password.setPassword("password1234");
		boolean pwCase = pv.meetsCaseReq(password);
		assertFalse(pwCase);
	}

}
