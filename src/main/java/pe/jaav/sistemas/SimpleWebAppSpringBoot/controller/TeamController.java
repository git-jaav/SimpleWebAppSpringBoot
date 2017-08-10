package pe.jaav.sistemas.SimpleWebAppSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.jaav.sistemas.SimpleWebAppSpringBoot.model.Team;
import pe.jaav.sistemas.SimpleWebAppSpringBoot.repository.TeamRepository;

@RestController
public class TeamController {

	@Autowired
	TeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public Iterable<Team> getTeams(){
//		List<Team> list = new ArrayList<Team>();
//		
//		Team team = new Team();
//		team.setId(0l);
//		team.setLocation("LIMA");
//		team.setName("UTC-CHICLAYO");
//		list.add(team);
//		
//		team = new Team();
//		team.setId(1l);
//		team.setLocation("PIURA");
//		team.setName("DEP LA BOCANA");
//		list.add(team);
//		return list;
		
		return teamRepository.findAll();			
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeam(@PathVariable Long id){
		return teamRepository.findOne(id);
	}
	
	
}
