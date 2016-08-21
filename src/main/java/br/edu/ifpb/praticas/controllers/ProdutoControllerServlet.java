package br.edu.ifpb.praticas.controllers;

import br.edu.ifpb.praticas.dao.ProdutoReferencia;
import br.edu.ifpb.praticas.dao.ProdutoRepository;
import br.edu.ifpb.praticas.entities.Produto;

import javax.inject.Inject;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(value="/produtos", name="produtosServlet")
public class ProdutoControllerServlet extends GenericServlet {

    @Inject
    private ProdutoRepository dao;

    @Inject
    @ProdutoReferencia
    private Produto p;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("Hello world with CDI!");
        res.getWriter().println(dao.listarTodos());
        res.getWriter().println(p);
    }

}
