package pl.springbootapp.CowTracker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.springbootapp.CowTracker.Domain.Krowy;
import pl.springbootapp.CowTracker.Repo.service.KrowyService;

import java.util.List;

@RestController
@RequestMapping("/krowy")
public class KrowyResource {
    private final KrowyService krowyService;

    public KrowyResource(KrowyService krowyService) {
        this.krowyService = krowyService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Krowy>> getAllKrowy () {
        List<Krowy> krowy = krowyService.findAllKrowy();
        return new ResponseEntity<>(krowy, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Krowy> getKrowyById (@PathVariable("id") Long id) {
        Krowy krowy = krowyService.findKrowyById(id);
        return new ResponseEntity<>(krowy, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Krowy> addKrowy(@RequestBody Krowy krowy) {
        Krowy newKrowy = krowyService.addKrowy(krowy);
        return new ResponseEntity<>(newKrowy, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Krowy> updateKrowy(@RequestBody Krowy krowy) {
        Krowy updateKrowy = krowyService.updateKrowy(krowy);
        return new ResponseEntity<>(updateKrowy, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Krowy> deleteKrowy(@PathVariable("id") Long id) {
        krowyService.deleteKrowy(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
