package characterSheetManager;

public class characterSheetManagerImpl implements CharacterSheetManager{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// character
		public String characterName;
		public String characterClass;
		public int level;
		public String race;
		public String alignment;
		public String background;
		public String playername;
		public long exp;
		
		// stats
		public int strength;
		public int strengthBonus;
		
		public int dexterity;
		public int dexterityBonus;
		
		public int constitution;
		public int constitutionBonus;
		
		public int intelligence;
		public int intBonus;
		
		public int wisdom;
		public int wisdomBonus;
		
		public int charisma;
		public int charismaBonus;
		
		// proficiency
		public int proficiencyBonus;
		
		//saving throws
		public boolean strengthST;
		public boolean dexterityST;
		public boolean constitutionST;
		public boolean intelligenceST;
		public boolean wisdomST;
		public boolean charismaST;
		
		
		// skills
		public boolean acrobatics;// dex
		public boolean animalHandling;// wis
		public boolean arcana;// int
		public boolean athletics;// str
		public boolean deception;// cha
		public boolean history;// int
		public boolean insight;// wis
		public boolean intimidation;// cha
		public boolean investigation;// int
		public boolean medicine;// wis
		public boolean nature;//int
		public boolean perception;//wis
		public boolean performance;//cha
		public boolean persuasion;//cha
		public boolean religion;//int
		public boolean sleightOfHand;//dex
		public boolean stealth;//dex
		public boolean survival;//wis
		
		
		
		// hit points
		public int maxHP;
		public int currentHP;
		
		// temp hit points
		public int maxTempHP;
		public int currentTempHP;
		
		
		// armor class
		public int armorClass;
		
		//initiative
		public int initiative;
		
		//speed
		public int speed;
		
		
		
		// inventory (map, item:description)
		
		// money (map, currency:amount) cp,sp,ep,gp,pp
		
		// character description (little paragraph)
		
		// languages (list)
		
		// other proficiencies (woodworking etc.)

}
