package br.com.fiap.CheckpointDevopsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CheckpointDevopsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckpointDevopsApiApplication.class, args);
	}

	@RestController
	class DemoController {
		@GetMapping("/")
		public String get() {
			return "esta suigdf";
		}
	}

}
