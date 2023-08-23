package br.gov.sp.fatec.projectspringbd4.service;

import java.util.List;
import br.gov.sp.fatec.projectspringbd4.entity.Usuario;


public interface IUsuarioService {
    
    public Usuario buscarPorId (Long id);
       
    public Usuario novoUsuario (Usuario usuario);

    public List<Usuario> buscarTodos();
}
