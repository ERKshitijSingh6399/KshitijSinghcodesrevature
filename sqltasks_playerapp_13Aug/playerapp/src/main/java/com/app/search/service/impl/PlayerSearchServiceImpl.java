package com.app.search.service.impl;

import java.util.List;
import java.util.regex.Pattern;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.search.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {

	private PlayerSearchDAO playerSearchDAO=new PlayerSearchDAOImpl();
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		if(id<100 ||id>1000) {
			throw new BusinessException("Invalid Player Id "+id);
		}else {
			//code here to DAO
			player=playerSearchDAO.getPlayerById(id);
			
		}
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> playerList=null;
		if(Pattern.matches("(.)*(\\W)(.)*", name) || Pattern.matches("(.)*(\\d)(.)*", name)){
			throw new BusinessException("Invalid Player Name "+name);
		}else {
			playerList=playerSearchDAO.getPlayersByName(name);
			
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList=null;
		if(teamName.matches("[a-zA-Z]{2,10}")) {
			//code here to DAO
			playerList=playerSearchDAO.getPlayersByTeamName(teamName);
		}else {
			throw new BusinessException("Invalid team name : "+teamName);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playerList=null;
		if(age!=0) {
			playerList=playerSearchDAO.getPlayersByAge(age);
		}else {
			throw new BusinessException("Age cannot be negative or zero");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
