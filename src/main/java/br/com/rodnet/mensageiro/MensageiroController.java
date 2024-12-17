package br.com.rodnet.mensageiro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensageiroController {

    @GetMapping("/mensagem")
    public ResponseEntity<String> mensagemImportante(){
        return ResponseEntity.ok("Palmeiras não tem mundial");
    }
}
