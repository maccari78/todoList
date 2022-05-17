package com.codeteam.CrudCode.Dao;

import com.codeteam.CrudCode.Model.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository<Tarea, Integer>{
    
}
