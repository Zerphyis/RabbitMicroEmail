package dev.Zerphyis.MicroRabbitEmail.Aplication.service;

import dev.Zerphyis.MicroRabbitEmail.Infra.coreEntity.EmailEntity;

public interface EmailService {
        void sendEmail(EmailEntity email);
}
