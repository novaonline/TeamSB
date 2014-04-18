package server.model.players.packets;

/**
 * @author Ryan / Lmctruck30
 */

import server.model.items.UseItem;
import server.model.players.Client;
import server.model.players.PacketType;
import server.model.players.skills.Prayer;

public class ItemOnObject implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		/*
		 * a = ?
		 * b = ?
		 */
		
		int a = c.getInStream().readUnsignedWord();
		int objectId = c.getInStream().readSignedWordBigEndian();
		int objectY = c.getInStream().readSignedWordBigEndianA();
		int b = c.getInStream().readUnsignedWord();
		int objectX = c.getInStream().readSignedWordBigEndianA();
		int itemId = c.getInStream().readUnsignedWord();
				if(!c.getItems().playerHasItem(itemId, 1)) {
			return;
		}
		UseItem.ItemonObject(c, objectId, objectX, objectY, itemId);
		switch (objectId) {
		case 409:
			Prayer.useBonesOnAltar(c, objectId, itemId); break;
		}
		if (itemId == 1438 && objectId == 2452) { // Air Alter
				c.startAnimation(1670, 0);
				c.sendMessage("A mysterious force grabs hold of you.");
				c.getPA().movePlayer(2841, 4829, 0);
			}

			if (itemId == 1440 && objectId == 2455) { // Earth Alter
				c.startAnimation(1670, 0);
				c.sendMessage("A mysterious force grabs hold of you.");
				c.getPA().movePlayer(2655, 4830, 0);
			} 

			if (itemId == 1442 && objectId == 3312) { // Fire Alter
				c.startAnimation(1670, 0);
				c.sendMessage("A mysterious force grabs hold of you.");
				c.getPA().movePlayer(2574, 4848, 0);
			} 
			if (itemId == 1444 && objectId == 3184) { // Water Alter
				c.startAnimation(1670, 0);
				c.sendMessage("A mysterious force grabs hold of you.");
				c.getPA().movePlayer(2727, 4833, 0);
			}
			if (itemId == 1446 && objectId == 3052) { // Body Alter
				c.startAnimation(1670, 0);
				c.sendMessage("A mysterious force grabs hold of you.");
				c.getPA().movePlayer(2522, 4825, 0);
			}
			
			
			
			if (itemId == 1448 && objectId == 2981) { // Mind Alter
				c.startAnimation(1670, 0);
				c.sendMessage("A mysterious force grabs hold of you.");
				c.getPA().movePlayer(2792, 4827, 0);
		}
		
	}

}
