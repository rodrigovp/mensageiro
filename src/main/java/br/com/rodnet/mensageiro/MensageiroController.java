package br.com.rodnet.mensageiro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensageiroController {

    private MensageiroRepository repositorio;

    public MensageiroController(MensageiroRepository repositorio){
        this.repositorio = repositorio;
    }

    @GetMapping("/mensagem")
    public ResponseEntity<String> mensagemImportante(){
        return repositorio.findById(1L)
                .map(mensagem -> ResponseEntity.ok(mensagem.toString()))
                .orElse(ResponseEntity.notFound().build());
        //return ResponseEntity.ok("Palmeiras não tem mundial");
    }
}
