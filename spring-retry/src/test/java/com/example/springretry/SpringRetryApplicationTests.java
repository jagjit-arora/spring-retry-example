package com.example.springretry;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRetryApplicationTests {
	@Autowired
	BackendAdapterImpl backendAdapter;

	@Test
	public void contextLoads() throws RemoteServiceNotAvailableException {
		backendAdapter.getBackendResponse(true, true);
		Assert.assertTrue(true);
	}

}
