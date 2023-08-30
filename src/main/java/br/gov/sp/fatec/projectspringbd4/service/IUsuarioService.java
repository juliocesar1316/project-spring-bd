package br.gov.sp.fatec.projectspringbd4.service;

import java.util.List;

import br.gov.sp.fatec.projectspringbd4.entity.Anotacao;
import br.gov.sp.fatec.projectspringbd4.entity.Autorizacao;
import br.gov.sp.fatec.projectspringbd4.entity.Usuario;


public interface IUsuarioService {
    
    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodosUsuarios();

    public Usuario buscarUsuarioPorId(Long id);

    public void associaAutorizacao(Long idUsuario, Long idAutorizacao);
    
    public Autorizacao novaAutorizacao(Autorizacao autorizacao);

    public Anotacao novaAnotacao(Anotacao anotacao);
}
