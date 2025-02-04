package br.com.rodnet.mensageiro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MensageiroRepository extends JpaRepository<Mensagem, Long> {
}
