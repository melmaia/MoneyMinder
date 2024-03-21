package br.com.fiap.moneyminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.moneyminder.model.Movimentacao;


// Interface de repositório para a entidade Movimentacao
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

}
