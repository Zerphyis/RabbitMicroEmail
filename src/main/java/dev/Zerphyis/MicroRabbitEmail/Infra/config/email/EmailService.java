package dev.Zerphyis.MicroRabbitEmail.Infra.config.email;

import dev.Zerphyis.MicroRabbitEmail.Domain.model.Email;

public interface EmailService {
        void sendEmail(Email email);
}
