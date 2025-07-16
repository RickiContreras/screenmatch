package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.sevice.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=Grey%27s+Anatomy&apikey=855bfea4");
		System.out.println(json);
	}
}
