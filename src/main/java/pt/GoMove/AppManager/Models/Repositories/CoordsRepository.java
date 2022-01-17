package pt.GoMove.AppManager.Models.Repositories;

import org.springframework.data.repository.CrudRepository;

import pt.GoMove.AppManager.Models.Coords;

public interface CoordsRepository extends CrudRepository<Coords,Integer> {
    public Iterable<Coords> findById(int Id);
}
