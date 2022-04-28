package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IPersonaDao;
import edu.ilp.sisgailp.entity.Persona;
import edu.ilp.sisgailp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }
}
