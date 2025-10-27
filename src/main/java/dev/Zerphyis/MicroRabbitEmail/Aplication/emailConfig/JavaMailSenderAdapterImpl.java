package dev.Zerphyis.MicroRabbitEmail.Aplication.emailConfig;

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
