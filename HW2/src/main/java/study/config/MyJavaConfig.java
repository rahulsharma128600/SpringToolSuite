package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import study.beans.AddressBean;
import study.beans.PersonBean;

@Configuration
public class MyJavaConfig {

	@Bean(value="detail")
	@Scope(value="prototype")
	public PersonBean getPBean()
	{
		PersonBean bean = new PersonBean();
		bean.setName("Ram");
		bean.setAge(20);
		bean.setAdress(getAbean());
		
		return bean;
	}
	
	@Bean(value="addr")
	public AddressBean getAbean()
	{
		AddressBean bean = new AddressBean();
		bean.setCity("mds");
		bean.setPin(458001);
		
		return bean;
	}
	
}
