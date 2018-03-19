package mvn_framework_testing;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mvn.genericlibraries.RandomValues;
@Listeners(com.mvn.genericlibraries.ResultListener.class)

public class RandomResult extends RandomValues {
RandomValues value=new RandomValues();
 
@Test(priority=1)
	public void testcase1() throws InterruptedException
	{
	Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
	
@Test(priority=2)
	public void testcase2() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
	
@Test(priority=3)
	public void testcase3() throws InterruptedException
	{
	Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
	
@Test(priority=4)
	public void testcase4() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
		
	}
	
@Test(priority=5)
	public void testcase5() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
	
@Test(priority=6)
	public void testcase6() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
	
@Test(priority=7)
	public void testcase7() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
		
	}
	
@Test(priority=8)
	public void testcase8() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
	
@Test(priority=9)
	public void testcase9() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
		
@Test(priority=10)
	public void testcase10() throws InterruptedException
	{Thread.sleep(value.randomtime());
		Assert.assertEquals(value.randomResult() ,value.randomResult() );
	}
}

