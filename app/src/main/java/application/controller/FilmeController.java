package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import application.model.Filme;
import application.repository.FilmeRepository;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeRepository filmeRepo;

    @GetMapping
    public Iterable<Filme> getAll() {
        return filmeRepo.findAll();
    }

    @PostMapping
    public Filme post(@RequestBody Filme filme) {
        return filmeRepo.save(filme);
    }

    @GetMapping("/{id}")
    public Filme getOne(@PathVariable long id) {
        Optional<Filme> resultado = filmeRepo.findById(id);
        if(resultado.isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Filme não encontrada"
            );
        }
        return resultado.get();
    }

    @PutMapping("/{id}")
    public Filme put(@PathVariable long id, @RequestBody Filme novosDados){
        Optional<Filme> resultado = filmeRepo.findById(id);

        if(resultado.isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Filme não encontrada"
            );
        }

        resultado.get().setCaregoria(novosDados.getCaregoria());
        resultado.get().setDuracao(novosDados.getDuracao());
        resultado.get().setNome(novosDados.getNome());

        return filmeRepo.save(resultado.get());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        if(!filmeRepo.existsById(id)) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Filme não encontrada"
            );
        }

        filmeRepo.deleteById(id);
    }
}
