package com.cg.adif.provision.dao;

import java.util.Date;

import javax.websocket.server.PathParam;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.adif.provision.modal.Provisionados;





@Repository
public interface CodigoDb extends JpaRepository<Provisionados,String>{

//	@Query("select p from provisionados p where p.periodo_certificacion=:date")
//	Page<Provisionados> findBydate(@PathParam("date") Date date, Pageable page);
	
	Page<Provisionados> findByPeriodo(Date date,Pageable page);
}
