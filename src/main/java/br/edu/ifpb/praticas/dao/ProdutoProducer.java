package br.edu.ifpb.praticas.dao;

import br.edu.ifpb.praticas.entities.Produto;

import javax.enterprise.inject.Produces;

/**
 * Created by diogomoreira on 15/08/16.
 */
public class ProdutoProducer {

    @Produces
    @ProdutoReferencia
    public Produto criarProdutoReferencia(ProdutoRepository repository) {
        Produto produto = new Produto();
        produto.setNome("Bolacha");
        return produto;
    }
}
