package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " is purchased " + game.getGameName());
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is applied to" + game.getGameName() + "by:" + gamer.getFirstName());
	}
	
}
