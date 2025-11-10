package dev.Zerphyis.MicroRabbitEmail.Infra.jpa;


import dev.Zerphyis.MicroRabbitEmail.Domain.model.Email;
import dev.Zerphyis.MicroRabbitEmail.Domain.repositorys.EmailRepository;
import dev.Zerphyis.MicroRabbitEmail.Domain.repositorys.jpa.EmailRepositoryJpa;
import dev.Zerphyis.MicroRabbitEmail.Infra.coreEntity.EmailEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class EmailRepositoryImpl implements EmailRepository {

    private final EmailRepositoryJpa repositoryJpa;

    public EmailRepositoryImpl(EmailRepositoryJpa repositoryJpa) {
        this.repositoryJpa = repositoryJpa;
    }

    @Override
    public Email save(Email email) {
        EmailEntity entity = toEntity(email);
        EmailEntity saved = repositoryJpa.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<Email> findById(Long id) {
        return repositoryJpa.findById(id).map(this::toDomain);
    }

    @Override
    public List<Email> findAll() {
        return repositoryJpa.findAll()
                .stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        repositoryJpa.deleteById(id);
    }

    @Override
    public List<Email> findPendingEmails() {
        return repositoryJpa.findBySentFalse()
                .stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }


    private EmailEntity toEntity(Email email) {
        return EmailEntity.builder()
                .fromAddres(email.fromAddress())
                .toAddres(email.toAddress())
                .subect(email.subject())
                .body(email.body())
                .build();
    }

    private Email toDomain(EmailEntity entity) {
        return new Email(
                entity.getFromAddres(),
                entity.getToAddres(),
                entity.getSubect(),
                entity.getBody()
        );
    }
}
