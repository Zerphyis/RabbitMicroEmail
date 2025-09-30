package dev.Zerphyis.MicroRabbitEmail.Domain.repositorys;

import dev.Zerphyis.MicroRabbitEmail.Domain.model.Email;
import dev.Zerphyis.MicroRabbitEmail.Domain.repositorys.jpa.EmailRepositoryJpa;

import java.util.List;
import java.util.Optional;

public class EmailRepositoryImpl implements EmailRepository {
    private final EmailRepositoryJpa repositoryJpa;


    public EmailRepositoryImpl(EmailRepositoryJpa repositoryJpa) {
        this.repositoryJpa = repositoryJpa;
    }

    @Override
    public Email save(Email email) {
        return repositoryJpa.save(email);
    }

    @Override
    public Optional<Email> findByid(Long id) {
        return repositoryJpa.findById(id);
    }

    @Override
    public List<Email> findAll() {
        return repositoryJpa.findAll();
    }

    @Override
    public void delete(Long id) {
        repositoryJpa.deleteById(id);

    }

    @Override
    public List<Email> findPendingEmails() {
        return repositoryJpa.findBySentFalse();
    }
}
