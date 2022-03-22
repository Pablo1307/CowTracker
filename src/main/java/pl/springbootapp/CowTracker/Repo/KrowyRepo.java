package pl.springbootapp.CowTracker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.springbootapp.CowTracker.Domain.Krowy;

import java.util.Optional;

public interface KrowyRepo extends JpaRepository<Krowy, Long> {
    void deleteKrowyById(Long id);

    Optional<Krowy> findKrowyById(Long id);
}
