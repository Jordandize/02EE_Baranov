package com.example.demo;

public class BraveBattleCry implements BattleCry {
	
	private static String[] BRAVE_BATTLE_CRY_LINES = {
			"Brave Battle Cry Line 1",
			"Brave Battle Cry Line 2",
			"Brave Battle Cry Line 3",
			"Brave Battle Cry Line 4",
			"Brave Battle Cry Line 5"
	};
	
	public BraveBattleCry() {}
	
	public void shout() {
		for(String line: BRAVE_BATTLE_CRY_LINES)
			System.out.println(line);
	}

}
