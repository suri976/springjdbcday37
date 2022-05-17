package ai.jobiak.usesource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ai.jobiak.ifaces.BDigital;

public class TestAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new B();
//		b.doPublishing();
//		before spring  - it gives null exception
//		after spring
	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
	/*
	 * B b = (B) factory.getBean("b"); b.doPublishing();
	 */
//		B b = new B();
//		b.doPublishing();
	
	
	
	
	BDigital bDigital = (BDigital) factory.getBean("bDigital");
	
	bDigital.doPublishing();
	
	
	
	
	}

}
