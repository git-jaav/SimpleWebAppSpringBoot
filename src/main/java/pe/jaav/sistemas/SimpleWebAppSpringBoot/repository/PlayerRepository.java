package pe.jaav.sistemas.SimpleWebAppSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import pe.jaav.sistemas.SimpleWebAppSpringBoot.model.Player;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends   CrudRepository<Player, Long>{

}
