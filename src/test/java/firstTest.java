import org.testng.Assert;
import org.testng.annotations.Test;

import com.sdet.first;

public class firstTest {
	@Test
	public void loginDetail() {
		first f=new first();
		Assert.assertEquals(0,f.logIn("lipii.mca@gmail.com","P00rvans@123"));		
	}
	@Test
	public void secondLogin() {
		first f=new first();
		Assert.assertEquals(0,f.logIn("lipii.mca@gmail.com","P00rvans@123"));		
	}

}
