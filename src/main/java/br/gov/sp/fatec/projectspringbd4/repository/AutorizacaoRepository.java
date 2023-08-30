package br.gov.sp.fatec.projectspringbd4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projectspringbd4.entity.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long>{
    
}
