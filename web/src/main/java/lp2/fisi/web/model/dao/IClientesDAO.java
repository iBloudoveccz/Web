package lp2.fisi.web.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import lp2.fisi.web.model.Clientes;

public interface IClientesDAO extends JpaRepository<Clientes, Integer>{

}
