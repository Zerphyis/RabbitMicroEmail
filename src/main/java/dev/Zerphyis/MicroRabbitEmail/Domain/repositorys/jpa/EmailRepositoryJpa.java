package dev.Zerphyis.MicroRabbitEmail.Domain.repositorys.jpa;

import dev.Zerphyis.MicroRabbitEmail.Infra.coreEntity.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailRepositoryJpa extends JpaRepository<EmailEntity,Long> {
    List<EmailEntity> findBySentFalse();
}
