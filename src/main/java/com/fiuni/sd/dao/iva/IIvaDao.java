package com.fiuni.sd.dao.iva;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fiuni.sd.domain.iva.IvaDomain;

@Repository
public interface IIvaDao extends CrudRepository<IvaDomain, Integer>{
	public Page<IvaDomain> findAll(Pageable pageable);
}