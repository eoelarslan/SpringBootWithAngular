
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
public class SpringBootAngular {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootAngular.class, args);


	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
