package pt.GoMove.AppManager.Models.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pt.GoMove.AppManager.Models.Area;

public interface AreaRepository extends CrudRepository<Area,Integer> {
    
    String QueryFindAreasbyPoints = 
    "select * from areas "+
    "order by are_points desc ";

    @Query(value=QueryFindAreasbyPoints, nativeQuery=true)
    Iterable<Area> findByPoints();

}
