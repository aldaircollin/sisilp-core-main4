package edu.ilp.sisgailp.dao;

import edu.ilp.sisgailp.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
}
