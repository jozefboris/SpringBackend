package sk.jozef.boris.springApp;

import bible.BibleVerses;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import sk.jozef.boris.springApp.Services.HelloWordService;
import sk.jozef.boris.springApp.Services.PrintService;

@SpringBootApplication
@ImportResource("classpath:bean-configurator.xml")
public class SpringAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringAppApplication.class, args);
		/*String appRun =context.getBean(BibleVerses.class).getVers();
		System.out.println(appRun);*/
		context.getBean(PrintService.class).print();


	}


}
