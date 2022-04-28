package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IEstudianteDao;
import edu.ilp.sisgailp.entity.Estudiante;
import edu.ilp.sisgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;
    @Override
    public List<Estudiante> listarEstudiantes() {
        return this.estudianteDao.findAll();
    }

}
