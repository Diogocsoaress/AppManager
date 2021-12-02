package pt.GoMove.AppManager.Models.Repositories;

import org.springframework.data.repository.CrudRepository;

import pt.GoMove.AppManager.Models.Area;

public interface AreaRepository extends CrudRepository<Area,Integer> {
    public Iterable<Area> findById(int Id);
}
