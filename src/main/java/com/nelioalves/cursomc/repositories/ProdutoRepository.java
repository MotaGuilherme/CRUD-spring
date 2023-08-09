package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.domain.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Produto;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

     @Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat " +
             "WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
     Page<Produto> search(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias, Pageable pageRequest);


     // metodo de busca igual o acima, porem apenas com o metodo sem precisar da query do JSQL
     // Page<Produto> findDistinctByNomeContainingAndCategoriasIn(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias, Pageable pageRequest);

}
