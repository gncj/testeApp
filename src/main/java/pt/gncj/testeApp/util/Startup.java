package pt.gncj.testeApp.util;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Startup {

	private static final Logger log = Logger.getLogger(Startup.class);
	
	@PostConstruct
	public void init() throws IOException {
		System.out.println();
		System.out.println("***************************************************************");
		System.out.println("App starter");
		log.info("AGORA PELO LOG4J");
		System.out.println("***************************************************************");
		System.out.println();
	}
	
}
