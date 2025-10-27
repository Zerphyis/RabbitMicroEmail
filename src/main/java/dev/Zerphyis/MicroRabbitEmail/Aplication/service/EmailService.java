package dev.Zerphyis.MicroRabbitEmail.Aplication.service;

import dev.Zerphyis.MicroRabbitEmail.Domain.model.Email;

public interface EmailService {
        void sendEmail(Email email);
}
