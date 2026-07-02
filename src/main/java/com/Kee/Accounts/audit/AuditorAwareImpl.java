package com.Kee.Accounts.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Logic to get the current user, e.g., from Spring Security
        // return Optional.of(SecurityContextHolder.getContext().getAuthentication().getName());

        // For now, return a default for testing:
        return Optional.of("SystemUser");
    }
}
