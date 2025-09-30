package dev.Zerphyis.MicroRabbitEmail.Infra.config.email;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class JavaMailSenderAdapterImpl implements JavaMailSenderAdapter{
    private final JavaMailSender javaMailSender;

    public JavaMailSenderAdapterImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void send(SimpleMailMessage message) {
        javaMailSender.send(message);
    }
}
