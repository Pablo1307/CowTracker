package pl.springbootapp.CowTracker.Repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.springbootapp.CowTracker.Domain.Krowy;
import pl.springbootapp.CowTracker.Repo.KrowyRepo;
import pl.springbootapp.CowTracker.exception.UserNotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class KrowyService {
    private final KrowyRepo krowyRepo;

    @Autowired
    public KrowyService(KrowyRepo krowyRepo) {
        this.krowyRepo = krowyRepo;
    }

    public Krowy addKrowy(Krowy krowy) {
        krowy.setCowCode(UUID.randomUUID().toString());
        return krowyRepo.save(krowy);
    }

    public List<Krowy> findAllKrowy() {
        return krowyRepo.findAll();
    }

    public Krowy updateKrowy(Krowy krowy) {
        return krowyRepo.save(krowy);
    }

    public Krowy findKrowyById(Long id) {
        return krowyRepo.findKrowyById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found"));
    }

    public void deleteKrowy(Long id) {
        krowyRepo.deleteKrowyById(id);
    }

}
