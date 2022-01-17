package pt.GoMove.AppManager.Models.Repositories;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import  pt.GoMove.AppManager.Models.User;

public interface UserRepository extends CrudRepository<User,Integer> {
    public Iterable<User> findByBdateBetween(LocalDate start, LocalDate end);
}
