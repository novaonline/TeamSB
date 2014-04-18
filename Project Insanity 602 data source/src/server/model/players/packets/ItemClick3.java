package server.model.players.packets;

import server.model.players.Client;
import server.model.players.PacketType;
import server.util.Misc;
import server.model.players.skills.RuneCraft;

/**
 * Item Click 3 Or Alternative Item Option 1
 * 
 * @author Ryan / Lmctruck30
 * 
 * Proper Streams
 */

public class ItemClick3 implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int itemId11 = c.getInStream().readSignedWordBigEndianA();
		int itemId1 = c.getInStream().readSignedWordA();
		int itemId = c.getInStream().readSignedWordA();
				if(!c.getItems().playerHasItem(itemId, 1)) {
			return;
		}
		

		switch (itemId) {
		case 1438:// Air Talisman
				RuneCraft.locate(c, 2985, 3292);
				c.getPA().startTeleport(2841, 4830, 0, "modern");
				break;
			case 1440:// Earth Talisman
				RuneCraft.locate(c, 3306, 3474);
				c.getPA().startTeleport(2655, 4830, 0, "modern");
				break;
			case 1442:// Fire Talisman
				RuneCraft.locate(c, 3313, 3255);
				c.getPA().startTeleport(2574, 4848, 0, "modern");
				break;
			case 1444:// Water Talisman
				RuneCraft.locate(c, 3185, 3165);
				c.getPA().startTeleport(2727, 4833, 0, "modern");
				break;
			case 1446:// Body Talisman
				RuneCraft.locate(c, 3053, 3445);
				c.getPA().startTeleport(2522, 4825, 0, "modern");
				break;
			case 1448:// Mind Talisman
				RuneCraft.locate(c, 2982, 3514);
				c.getPA().startTeleport(2792, 4827, 0, "modern");
				break;

		case 1712:
			c.getPA().handleGlory(itemId);
			break;
			
		default:
			if (c.playerRights == 3)
				Misc.println(c.playerName+ " - Item3rdOption: "+itemId+" : "+itemId11+" : "+itemId1);
			break;
		}

	}

}
