package com.fullwall.Citizens.Interfaces;

import org.bukkit.entity.Player;

import com.fullwall.resources.redecouverte.NPClib.HumanNPC;

public interface Clickable {
	/**
	 * Left-clicking an NPC
	 * 
	 * @return
	 */
	public void onLeftClick(Player player, HumanNPC npc);

	/**
	 * Right-clicking an NPC
	 * 
	 * @return
	 */
	public void onRightClick(Player player, HumanNPC npc);
}