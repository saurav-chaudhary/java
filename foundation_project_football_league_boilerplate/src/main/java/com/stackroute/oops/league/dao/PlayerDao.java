package com.stackroute.oops.league.dao;

import com.stackroute.oops.league.exception.PlayerAlreadyExistsException;
import com.stackroute.oops.league.exception.PlayerNotFoundException;
import com.stackroute.oops.league.model.Player;

import java.util.List;

public interface PlayerDao {
   

    Object getAllPlayers = null;

	boolean addPlayer(Player player) throws PlayerAlreadyExistsException;

    static List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

    Player findPlayer(String string) throws PlayerNotFoundException;


}
