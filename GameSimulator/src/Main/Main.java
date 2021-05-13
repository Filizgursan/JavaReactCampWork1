package Main;

import java.time.LocalDate;

import Abstract.GameService;
import Abstract.SalesService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer(1,"Filiz","Gürsan", LocalDate.of(1999, 10, 19),"15891618307"));
		
		
		GameService gameService = new GameManager();
		gameService.add(new Game(1,"CSGO",30));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1,"Wekkend offer",20));
		
		SalesService salesService = new SalesManager();
		salesService.sale(new Game(1,"CSGO",30), new Gamer(1,"Filiz","Gürsan", LocalDate.of(1999, 10, 19),"15891618307"));

	}

}
