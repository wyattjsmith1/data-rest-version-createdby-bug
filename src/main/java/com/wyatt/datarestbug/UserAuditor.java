package com.wyatt.datarestbug;

import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import java.util.Optional;

@EnableMongoAuditing
public class UserAuditor implements AuditorAware<Void> {
    @Override
    public Optional<Void> getCurrentAuditor() {
        return Optional.empty();
    }
}
