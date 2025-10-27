package dev.Zerphyis.MicroRabbitEmail.Aplication.emailConfig;

import org.springframework.mail.SimpleMailMessage;

public interface JavaMailSenderAdapter {
    void send(SimpleMailMessage message);
}
