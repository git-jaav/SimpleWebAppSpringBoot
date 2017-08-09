package pe.jaav.sistemas.SimpleWebAppSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;

import pe.jaav.sistemas.SimpleWebAppSpringBoot.model.Team;

public interface TeamRepository extends   CrudRepository<Team, Long> {

}
