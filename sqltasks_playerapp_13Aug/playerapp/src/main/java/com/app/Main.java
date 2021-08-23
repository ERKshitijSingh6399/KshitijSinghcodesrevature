package com.app;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.search.service.PlayerSearchService;
import com.app.search.service.impl.PlayerSearchServiceImpl;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		log.info("Welcome to Updated Vinay's Player App V2.0");
		log.info("==========================================");

		int ch = 0;
		do {
			log.info("\nWhat you wish to do today?");
			log.info("1)Create A Player");
			log.info("2)Update A Player");
			log.info("3)Delete A Player");
			log.info("4)List All Players");
			log.info("5)Search Player with various filters");
			log.info("6)EXIT");
			log.info("Please enter your choice(1-6)");

			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
			}

			switch (ch) {
			case 1:
				log.info("Under Construction");

				break;
			case 2:
				log.info("Under Construction");

				break;
			case 3:
				log.info("Under Construction");

				break;
			case 4:
				log.info("Under Construction");

				break;
			case 5:
				int option = 0;
				PlayerSearchService playerSearchService=new PlayerSearchServiceImpl();
				do {
					log.info("\n\nWelcome to Player Search Menu... Search Your Players By various Filters from below Menu option");
					log.info("1. By Player ID");
					log.info("2. By Player Name");
					log.info("3. By Player Age");
					log.info("4. By Player Gender");
					log.info("5. By Player City");
					log.info("6. By TeamName");
					log.info("7. By SportsName");
					log.info("8. By Player Contact");
					log.info("9. Go back to Main Menu");
					log.info("Please enter your choice(1-9)");

					try {
						option = scanner.nextInt();
					} catch (NumberFormatException e) {
					}
					switch (option) {
					case 1:log.info("Enter player id to get player details");
						try {
						int id=scanner.nextInt();
						Player player=playerSearchService.getPlayerById(id);
						if(player!=null) {
							log.info("Player with id "+id+" found successfully... Below is the details");
							log.info(player);
						}
						}catch(NumberFormatException e) {
							log.warn("Player Id should be digit only... Try Again");
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					
					case 2:log.info("Enter player name to get player details");
					try {
					String name1=scanner.next();
					List<Player> playerList1=playerSearchService.getPlayersByName(name1);
					if(playerList1!=null && playerList1.size()>0) {
						log.info("Total there are "+playerList1.size()+" number of players with Name "+name1+" printing the players");
						for(Player player:playerList1) {
							log.info(player);
						}
						}
						}catch (BusinessException e)
						{log.warn(e.getMessage());}

						break;
					case 3:log.info("Enter the Age to get the Players Below and Equal that Age");
						try {
							int age1=scanner.nextInt();
							List<Player> playerList=playerSearchService.getPlayersByAge(age1);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" number of players with age "+age1+" printing the players");
								for(Player player:playerList) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}


						break;
					case 4:log.info("Enter the gender to get the Players");
					try {
						String gender=scanner.next();
						List<Player> playerList=playerSearchService.getPlayersByGender(gender);
						if(playerList!=null && playerList.size()>0) {
							log.info("Total there are "+playerList.size()+" number of players with gender "+gender+" printing the players");
							for(Player player:playerList) {
								log.info(player);
							}
						}
					} catch (BusinessException e)
						{log.warn(e.getMessage());}


						break;
					case 5:log.info("Enter the City to get the Players");
					String city=scanner.next();
					try {
						List<Player> playerList=playerSearchService.getPlayersByCity(city);
						if(playerList!=null && playerList.size()>0) {
							log.info("Total there are "+playerList.size()+" number of players from city "+city+" printing the players");
							for(Player player:playerList) {
								log.info(player);
							}
						}
					} catch (BusinessException e) {
						log.warn(e.getMessage());
					}


						break;
					case 6:log.info("Enter the TeamName to get the Players for that Team");
						String teamName=scanner.next();
						try {
							List<Player> playerList=playerSearchService.getPlayersByTeamName(teamName);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" number of players iplaying for the team "+teamName.toUpperCase()+" printing the players");
								for(Player player:playerList) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}

						break;
					case 7:

						break;
					case 8:

						break;
					case 9:log.info("\n\nGOING BACK TO MAIN MENU......\n\n");

						break;

					default:log.warn("Invalid Search Option... Choice should be only number between 1-9 only. Kindly Retry ");
							break;
					}
				} while (option != 9);

				break;
			case 6:
				log.info("Thanks for using this APP we will see you soon :) ");

				break;

			default:
				log.warn("Invalid choice... Choice should be only number between 1-6 only ");
				break;
			}

		} while (ch != 6);
		scanner.close();

	}

}
