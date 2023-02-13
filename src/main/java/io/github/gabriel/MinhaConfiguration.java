package io.github.gabriel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar() {     //metodo que acontece assim que a aplicação inicia
        return args -> {
            System.out.println("Rodando o perfil de desenvolvimento");
        };
    }

}
