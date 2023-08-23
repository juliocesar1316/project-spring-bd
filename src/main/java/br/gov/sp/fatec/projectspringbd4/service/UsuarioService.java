package br.gov.sp.fatec.projectspringbd4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projectspringbd4.entity.Usuario;
import br.gov.sp.fatec.projectspringbd4.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario buscarPorId (Long id){
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isPresent()){
            return usuarioOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public Usuario novoUsuario (Usuario usuario){
        if( usuario == null ||
            usuario.getNome() == null ||
            usuario.getSenha() == null
        ){
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarTodos(){
        return usuarioRepo.findAll();
    }
}
