package dev.Zerphyis.MicroRabbitEmail.Infra.config.email;

import org.springframework.mail.SimpleMailMessage;

public interface JavaMailSenderAdapter {
    void send(SimpleMailMessage message);
}
