package pt.GoMove.AppManager.Models.Repositories;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import  pt.GoMove.AppManager.Models.User;

public interface UserRepository extends CrudRepository<User,Integer> {
    public static Iterable<User> findByBdateBetween(LocalDate start, LocalDate end) {
        // TODO Auto-generated method stub
        return null;
    }    
    public Iterable<User> findByEmail(String email);
}
