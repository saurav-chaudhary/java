package com.stackroute.oops.league.dao;

import com.stackroute.oops.league.exception.PlayerAlreadyExistsException;
import com.stackroute.oops.league.exception.PlayerNotFoundException;
import com.stackroute.oops.league.model.Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is implementing the PlayerDao interface
 * This class has one field playerList and a String constant for storing file name
 */
public class PlayerDaoImpl implements PlayerDao {
    private static final String PLAYER_FILE_NAME = "src/main/resources/player.csv";
    private List<Player> playerList;

    /**
     * Constructor to initialize an empty ArrayList for playerList
     */
    public PlayerDaoImpl() {
        playerList=new ArrayList<>();

    }

    /**
     * Return true if  player object is stored in "player.csv" as comma separated fields successfully
     * when password length is greater than six and yearExpr is greater than zero
     */
    @Override
     public boolean addPlayer(Player player) throws PlayerAlreadyExistsException {
    
         try{
             for(int i=0;i<playerList.size();i++)
             {
          if(player.getPlayerId().equals(playerList.get(i).getPlayerId()))
          {
            throw new PlayerAlreadyExistsException("Given valid player data should add player to database and return true");
          }
        }
            FileWriter myWriter = new FileWriter(PLAYER_FILE_NAME);
             myWriter.write(player.getPlayerId()+","+player.getPlayerName()+","+player.getPassword()+","+player.getYearExpr()+","+player.getTeamTitle());
                   
            
             myWriter.close();
            }

            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        
            Player newPlayer=player;
            try { 
                
                newPlayer = findPlayer(player.getPlayerId());
               
                
            } catch (PlayerNotFoundException e) {
               
                e.printStackTrace();
            }
        if(newPlayer.getPlayerId().equals(player.getPlayerId()))
        {
           if(newPlayer.getPassword().length()>6 && newPlayer.getYearExpr()>0)
           {
               return true;
           }
        }
        
        return false;
    }

    //Return the list of player objects by reading data from the file "player.csv"
    @Override
    public List<Player> getAllPlayers() {
        List<Player> playerinfo=new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(PLAYER_FILE_NAME)))
        {
            String line=null;
            String[] arr=null;
            while((line=br.readLine())!=null)
            {
                arr=line.split(",");
                Player player=new Player(arr[0], arr[1], arr[2],Integer.parseInt(arr[3]));
                playerList.add(player);
                playerinfo.add(player);



            }
            
        } catch (NumberFormatException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
           
            e.printStackTrace();
        }

        return playerinfo;
    }

    /**
     * Return Player object given playerId to search
     */
    @Override
    public Player findPlayer(String playerId) throws PlayerNotFoundException {
        
        if(playerId==null || playerId.equals("") || playerId.equals(" "))
           {
               throw new PlayerNotFoundException("Given invalid or empty player id should throw exception"); 
           }
           
             List<Player> plist=getAllPlayers();
             if(plist.isEmpty())
             {
                 throw new PlayerNotFoundException("Given empty player repo when searched should throw exception");
             }
             Player foundplayer=null;
             for(Player p:plist)
             { 
               
                
                 if((p.getPlayerId()).equals(playerId))
                 {
                 foundplayer=new Player(p.getPlayerId(), p.getPlayerName(), p.getPassword(), p.getYearExpr());
                 foundplayer.setTeamTitle(p.getTeamTitle());
                 }
                 else
                {
                    throw new PlayerNotFoundException("Given invalid or empty player id should throw exception");
                }
             }
                //else
                //{
                 //   throw new PlayerNotFoundException("Given invalid or empty player id should throw exception");
               // }
            
            if(plist==null)
            {
                throw new PlayerNotFoundException("Given empty player repo when searched should throw exception");
            }
           
          
           
      
        return foundplayer;

    }
}