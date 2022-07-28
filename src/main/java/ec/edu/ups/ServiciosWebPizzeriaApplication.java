package ec.edu.ups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan("ec.edu.ups")
public class ServiciosWebPizzeriaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosWebPizzeriaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ServiciosWebPizzeriaApplication.class);
	}
}
