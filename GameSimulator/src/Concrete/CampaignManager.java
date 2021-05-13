package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;


public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Added campaign : " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated campaign : " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted campaign : " + campaign.getCampaignName());
		
	}


}
