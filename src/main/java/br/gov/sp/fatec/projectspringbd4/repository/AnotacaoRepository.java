package br.gov.sp.fatec.projectspringbd4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projectspringbd4.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{
    
}