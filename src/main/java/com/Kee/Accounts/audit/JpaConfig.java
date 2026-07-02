package com.Kee.Accounts.audit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") // Explicitly point to the bean name
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditAwareImpl() {
        return new AuditorAwareImpl();
    }
}