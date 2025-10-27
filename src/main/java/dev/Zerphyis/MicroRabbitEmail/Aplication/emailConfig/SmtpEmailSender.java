package dev.Zerphyis.MicroRabbitEmail.Aplication.emailConfig;

import dev.Zerphyis.MicroRabbitEmail.Aplication.service.EmailService;
import dev.Zerphyis.MicroRabbitEmail.Domain.model.Email;
import org.springframework.mail.SimpleMailMessage;

public class SmtpEmailSender implements EmailService {
    private final JavaMailSenderAdapter javaMailSenderAdapter;


    public SmtpEmailSender(JavaMailSenderAdapter javaMailSenderAdapter) {
        this.javaMailSenderAdapter = javaMailSenderAdapter;
    }

    @Override
    public void sendEmail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(email.getFromAddres());
        message.setTo(email.getToAddres());
        message.setSubject(email.getSubect());
        message.setText(email.getBody());

        javaMailSenderAdapter.send(message);
    }
}
