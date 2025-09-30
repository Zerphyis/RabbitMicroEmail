package dev.Zerphyis.MicroRabbitEmail.Domain.repositorys.jpa;

import dev.Zerphyis.MicroRabbitEmail.Domain.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailRepositoryJpa extends JpaRepository<Email,Long> {
    List<Email> findBySentFalse();
}
