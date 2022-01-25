package pt.GoMove.AppManager.Models.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pt.GoMove.AppManager.Models.Coords;

public interface CoordsRepository extends CrudRepository<Coords,Integer> {
    
    String QueryFindCoordsbySqrArea = 
    "select * from coords "+
    "order by crd_sqrarea desc ";

    @Query (value=QueryFindCoordsbySqrArea, nativeQuery=true)
    Iterable<Coords> findBySqrArea();
}
