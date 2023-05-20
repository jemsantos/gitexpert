/**
 * 
 */
package com.devsuperior.gitexpert.dto;

import com.devsuperior.gitexpert.entities.GameList;

/**
 * @author jemsa
 *
 */
public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
}
