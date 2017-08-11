package pe.jaav.sistemas.SimpleWebAppSpringBoot;

import java.util.ArrayList;import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.jaav.sistemas.SimpleWebAppSpringBoot.model.Player;
import pe.jaav.sistemas.SimpleWebAppSpringBoot.model.Team;
import pe.jaav.sistemas.SimpleWebAppSpringBoot.repository.TeamRepository;


@SpringBootApplication
public class SimpleWebAppSpringBootApplication {

	
	@Autowired
	TeamRepository TeamRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppSpringBootApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<Team>();
		
		Team team = new Team();
		team.setId(10l);
		team.setLocation("LIMA");
		team.setName("UTC-CHICLAYO ...");
		list.add(team);
		
		team = new Team();
		team.setId(20l);
		team.setLocation("PIURA");
		team.setName("DEP LA BOCANA");
		list.add(team);
		
		team = new Team();
		team.setId(30l);
		team.setLocation("LIMA");
		team.setName("LA U ES LA U");
		
		Set<Player> players = new HashSet<Player>();		
		players.add(new Player("Jugador A","MEDIO CAMPO"));
		players.add(new Player("Jugador B","DELANTERo CAMPO"));
		team.setPlayers(players);
		
		list.add(team);		
		TeamRepository.save(list);
		
		
		
		
	}
}
