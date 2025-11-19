    package dev.Zerphyis.MicroRabbitEmail.Domain.repositorys;

    import dev.Zerphyis.MicroRabbitEmail.Domain.model.Email;

    import java.util.List;
    import java.util.Optional;

    public interface EmailRepository {
        Email save(Email email);
        Optional<Email> findById(Long id);
        List<Email> findAll();
        void delete(Long id);
        List<Email> findPendingEmails();
    }
