package pe.company.ecommer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//con este parametro estamos diciendo que cuando se ejecute el proyecto
//no reconozca por el momento la dependencia del MySQL, de esta manera al ejecutar
// sin configurar la url esta se ejecutara sin ningun problema
@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
public class AppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDemoApplication.class, args);
	}

}
