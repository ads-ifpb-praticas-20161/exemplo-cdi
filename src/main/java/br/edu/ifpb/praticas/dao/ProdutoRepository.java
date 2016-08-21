package br.edu.ifpb.praticas.dao;

import br.edu.ifpb.praticas.entities.Produto;

import java.util.List;

/**
 * Created by diogomoreira on 14/08/16.
 */
public interface ProdutoRepository {

    void adicionar(Produto p);
    void remover(Produto p);
    List<Produto> listarTodos();
    Produto consultar(Long id);

}
