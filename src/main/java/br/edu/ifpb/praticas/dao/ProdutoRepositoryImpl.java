package br.edu.ifpb.praticas.dao;

import br.edu.ifpb.praticas.entities.Produto;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by diogomoreira on 14/08/16.
 */
public class ProdutoRepositoryImpl implements ProdutoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void adicionar(Produto p) {
        entityManager.persist(p);
    }

    @Override
    public void remover(Produto p) {
        entityManager.remove(p);
    }

    @Override
    public List<Produto> listarTodos() {
        System.out.println(entityManager);
        return entityManager.createQuery("FROM Produto p").getResultList();
    }

    @Override
    public Produto consultar(Long id) {
        return entityManager.find(Produto.class, id);
    }
}
