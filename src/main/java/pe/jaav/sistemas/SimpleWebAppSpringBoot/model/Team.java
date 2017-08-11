package pe.jaav.sistemas.SimpleWebAppSpringBoot.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import javax.persistence.CascadeType;

@Entity
public class Team {

	@Id	
	@GeneratedValue
	private Long id;
	private String name;	
	private String location;
	private String mascotte;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	private Set<Player> players;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
	
	
}
