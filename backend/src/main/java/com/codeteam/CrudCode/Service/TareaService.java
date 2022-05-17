package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Model.Tarea;
import java.util.List;

public interface TareaService {
    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById(Integer Id);
    public void delete(Integer Id);
}
