public class TheGame
    //Name of Game: The War Medic
    //Purpose: To test the cognitive skills of the user
    //Date Started: October 25th
{
	public static void main (String args[])
    {
	new TheGame ();
    }

//These are the globals that affect the entire game.
// if Moves equals to 0, then the user loses.	
    int Moves = 1;
    {
    if (Moves == 0)
    {
	Conclusionfail ();
    }
    }
 // This is the main method which dictates most of the game
    public TheGame ()
    {
	{
		char start = mainmenu ();
		if (start == 'a')
		{
		    Delay (25);
		    Background ();
		    Delay (25);
		    beginningstory ();
		    Delay (25);
		    GunTask ();
		    Delay (25);
		    TheShot ();
		    Delay (25);
		}
		else if (start == 'c')
		{
		    Delay (25);
		    Instructions ();
		    Delay (25);
		    mainmenu ();
		    Delay (25);
		    Background ();
		    Delay (25);
		    beginningstory ();
		    Delay (25);
		    GunTask ();
		    Delay (25);
		    TheShot ();
		    Delay (25);
		}
		else if (start == 'd')
		{
		    Delay (25);
		    Credits ();
		    Delay (25);
		    mainmenu ();
		    Delay (25);
		    Background ();
		    Delay (25);
		    beginningstory ();
		    Delay (25);
		    GunTask ();
		    Delay (25);
		    TheShot ();
		    Delay (25);
		}

		else
		{
		    System.out.println ("Oh well see you later!");
		}
		{
		}
	    }
	//Just a global for name, so the user's name stays constant
    name = friend;

    {

	{
	{
		}
	{
	}}
    }}


    public char mainmenu ()
    {
	//the basic menu, just the title, soldier art, and says where to quit and see the credits
	System.out.println (" _____ _           __        __           __  __          _ _      ");
	System.out.println ("|_   _| |__   ___  \\ \\      / /_ _ _ __  |  \\/  | ___  __| (_) ___ ");
	System.out.println ("  | | | '_ \\ / _ \\  \\ \\ /\\ / / _` | '__| | |\\/| |/ _ \\/ _` | |/ __|");
	System.out.println ("  | | | | | |  __/   \\ V  V / (_| | |    | |  | |  __/ (_| | | (__ ");
	System.out.println ("  |_| |_| |_|\\___|    \\_/\\_/ \\__,_|_|    |_|  |_|\\___|\\__,_|_|\\___|");
	Delay (25);
	System.out.println ("       .---.");
	System.out.println ("  ___ /_____\\");
	System.out.println (" /\\.-`( '.' )");
	System.out.println ("/ /    \\_-_/_");
	System.out.println ("\\ `-.-\"`'V'//-.");
	System.out.println (" `.__,   |//,\\ \\");
	System.out.println ("     |Ll //Ll|\\ \\");
	System.out.println ("     |__//   | \\_\\");
	System.out.println ("    /---|[]==| / /");
	System.out.println ("    \\__/ |   \\/\\/");
	System.out.println ("    /_   | Ll_\\|");
	System.out.println ("     |`^\"\"\"^`|");
	System.out.println ("     |   |   |");
	System.out.println ("     |   |   |");
	System.out.println ("     |   |   |");
	System.out.println ("     |   |   |");
	System.out.println ("     L___l___J");
	System.out.println ("      |_ | _|");
	System.out.println ("     (___|___)");
	System.out.println ("      ^^^ ^^^");
	Delay (20);
	System.out.println ("00000000000000000000000000000000");
	System.out.println ("00         ###                00");
	System.out.println ("00 Press \"a\" To Start         00");
	System.out.println ("00         ###                00");
	System.out.println ("00 Press \"q\" To Quit          00");
	System.out.println ("00         ###                00");
	System.out.println ("00 Press \"c\" For Instructions 00");
	System.out.println ("00         ###                00");
	System.out.println ("00 Press \"d\" For Credits      00");
	System.out.println ("00         ###                00");
	System.out.println ("00000000000000000000000000000000");
	char start = IBIO.inputChar ("\nWhich one do you choose: ");
	return start;
    }


    public void Credits ()
	//The Credits for the Game
    {
	printSlow ("Game made by Shreyansh Anand, Shredded Games (trademarked)", 60);
	printSlow ("Part of The Shredded Group", 60);
    }


    public void Instructions ()
    //Instructions and a bit of the back story
    {
	printSlow ("In the game you will be taken into a World War Scenario where you are ", 60);
	printSlow ("a soldier who is fighting for the allies in World War 1 when your friend is", 60);
	printSlow ("shot. Your goal will be to save your friend before you run out of moves, ", 60);
	printSlow ("moves will be determined by your answers and decisions on the challenge. ", 60);
	printSlow ("If you lose all your moves, your friend will die and you will have ", 65);
	printSlow ("to start all over again. Good Luck!", 65);
	Delay (40);
    }


    public void Background ()
    {
	//Give player some background and I can get their name
	printSlow ("Right now you....", 60);
	String name = IBIO.inputString ("Wait! What is your name? ");
	printSlow ("Ah yes, you're " + name + ", now where were we?", 30);
	printSlow ("Oh right! Right now it is the year 1914 and you are somewhere in France in a", 10);
	printSlow ("miserable trench with a lot of others trying to hold on to a defensive position", 300);
	printSlow ("for the Allies against the Germans", 1);
	printSlow ("\nWell lets get in there shall we?", 1);
    }


    public void beginningstory ()
	//beginning starts here with first bit of in-game story
    {
	printSlow (" ", 100);
	printSlow ("\"The battle is almost over! C'mon boys, make sure no German gets here!\"", 50);
	printSlow ("\"YES SIR\"", 70);
    }


    public void GunTask ()
	//The Gun challenge where they have to pick the gun, this is a history question (multiple choice)
    //Kind of like a tutorial/example of how to play the game
    {
	System.out.println ("                            ______");
	System.out.println ("         |\\_______________ (_____\\\\______________");
	System.out.println (" HH======#H###############H#######################");
	System.out.println ("         ' ~\"\"\"\"\"\"\"\"\"\"\"\"\"\"`##(_))#H\\\"\"\"\"\"Y########");
	System.out.println ("                           ))    \\#H\\       `\"Y###");
	System.out.println ("                           \"      }#H)");
	printSlow ("\na) Lee-Enfield", 30);
	printSlow ("b) Baker Rifle", 100);
	printSlow ("c) Mauser Gewehr", 16);
	char gun = IBIO.inputChar ("You keep on firing your gun, wait! What is your gun? (a/b/c) ");
	//Correct choice
	if (gun == 'a')
	    printSlow ("\nAhh the dependable British Gun, it really is a good gun!", 25);
	//Wrong choice
	else if (gun == 'b')
	{
	    printSlow ("\nWoah! Why are you using a 100 year old gun? Poor guy. (start again)", 44);
	    GunTask ();
	}
	//Wrong choice
	else
	{
	    printSlow ("\nWhere you get that gun soldier? Why do you have the enemy's weapon?(start again)", 55);
	    GunTask ();
	}
    }


    String friend = " ";
	private String name;
    public void TheShot ()
	//The friend gets shot in this part and the user will to pick a choice that will give a certain amount of moves to save him/her
    {
    printSlow (" ",75);
	printSlow ("Rat-a-tat BOOOM the battle seems to be drawing to an end with another victory", 40);
	printSlow ("to stop the enemies advance!", 100);
	printSlow ("BOOM! \"ARGGGH\" You look to your side and see your friend has been shot!", 10);
	printSlow (" ", 200);
	friend = IBIO.inputString ("NOOO...(name of friend) ");
	//Anatomy question (multiple choice)
	printSlow ("\na) Chest", 35);
	printSlow ("b) Knee", 15);
	printSlow ("c) Hand", 5);
	char shot = IBIO.inputChar ("You look at " + friend + " and see they have been shot in the (a/b/c) ");
	//If the player chooses a, they let the friend die and they lose
	if (shot == 'a')
	{
	    printSlow ("\n" + friend + ":\"Thank you for everything you have done for me *cough cough*, I wish ", 100);
	    printSlow ("I had someone you could say I love you too.\" ", 100);
	    printSlow ("You cannot believe he is dead after the war is over, you will remember him and not",75);
	    printSlow ("sleep in sadness.", 100);
	    printSlow ("(You lose as " + friend + " died :()", 250);
	    Delay (35);
	    printSlow (" ",75);
	    new TheGame ();
	}
	//If the player chooses b, they have only a few moves to save him/her
	else if (shot == 'b')
	{
	    printSlow ("\nYou have a certain amount of time to save him! \"Hey Sarg, I am gonna take him to ", 100);
	    printSlow ("the medic!\"\"WHAT ARE YOU WAITING FOR! WE HAVE ALREADY WON THE BATTLE, GO! GO! GO!\"", 100);
	    printSlow ("Oh thank god, it could have been a lot worse!\"Hey Sarg, I am gonna take him", 100);
	    printSlow ("to the medic!\" \"WHAT ARE YOU WAITING FOR, WE HAVE ALREADY WON THE BATTLE, GO! GO! GO!\"", 100);
	    Moves += 9;
	    printSlow ("You have " + Moves + " moves left", 70);
	    trenchchoice ();
	}
	//If the player chooses c, they will have a lot of moves to save the friend
	else
	{
	    printSlow ("\nThank god! It could've been a lot worse! He could however die from blood  ", 60);
	    printSlow ("loss if we spend too long! \"Hey Sarge, I am gonna take him to the medic\" \"WHAT ", 60);
	    printSlow ("ARE YOU WAITING FOR! WE HAVE ALREADY WON THE BATTLE, GO! GO! GO!\"", 60);
	    Moves += 14;
	    printSlow ("You have " + Moves + " moves left", 70);
	    trenchchoice ();
	}
    }


    public void trenchchoice ()
    //The user is given a decision on which game style they want to play and pick a trench
    {
	printSlow ("\nYou pick up " + friend + " and run toward the infirmary. Eventually you get to ", 90);
	printSlow ("a place where the trenches are split up into different trenches.", 60);
	printSlow ("One way is shorter but has difficult challenges, while the other one is longer  ", 60);
	printSlow ("but the challenges are easier", 60);
	printSlow (" ", 50);
	printSlow ("a (Easier but longer)", 60);
	printSlow ("b (Harder but shorter)", 60);
	char choice = IBIO.inputChar ("Which tunnel do you pick? (a/b) ");
	if (choice == 'a')
	{
	    Moves--;
	    printSlow ("You have " + Moves + " moves left", 70);
	    Delay (25);
	    tunnela ();

	}
	else
	{
	    Moves--;
	    printSlow ("You have " + Moves + " moves left", 70);
	    Delay (25);
	    tunnelb ();
	}
    }


    public void tunnela ()
    {
	// This trench is longer and easier than the below trench, same games and challenges, just easier
	System.out.println ("   ___________ ");
	System.out.println ("| |  _ _ _ _  | |");
	System.out.println ("| | | | | | | | |");
	System.out.println ("| | |-+-+-+-| | |");
	System.out.println ("| | |-+-+=+%| | |");
	System.out.println ("| | |_|_|_|_| | |");
	System.out.println ("| |    ___    | |");
	System.out.println ("| |   [___] ()| |");
	System.out.println ("| |         ||| |");
	System.out.println ("| |         ()| |");
	System.out.println ("| |           | |");
	System.out.println ("| |           | |");
	System.out.println ("| |           | |");
	System.out.println ("|_|___________|_|");
	printSlow (" ", 100);
	printSlow ("You keep walking feeling a bit tired but still with determination, ", 75);
	printSlow (friend + " must not die. You decide to choose the easier but longer trench", 100);
	printSlow (" ", 100);
	printSlow ("Almost immediately, you reach a door with a passcode you need to get through.", 100);
	printSlow ("You forgot the password but luckily it has a hint which only any Allies soldier", 100);
	printSlow ("can answer.", 100);
	Unscrambler ();
    }


    public void Unscrambler ()
    //The user has to unscramble the following letters to continue
    {
	System.out.println ("           _ _ ");
	System.out.println ("          | (_)");
	System.out.println ("   ___ ___| |_ ");
	System.out.println ("  / __/ _ \\ | |");
	System.out.println (" | (_|  __/ | |");
	System.out.println ("  \\___\\___|_|_|");
	printSlow ("Hint: This pest was commonly found in the trenches, it was thought", 75);
	printSlow ("upto 97% of soldiers were affected.", 75);
	String lice = IBIO.inputString ("Unscamble the letters above for the Password, each incorrect guess\nwill cost a move \n");
	if (!lice.equalsIgnoreCase ("lice"))
	{
	    printSlow (" ", 50);
	    printSlow ("That is Wrong Soldier!", 110);
	    Moves--;
	    printSlow ("You have " + Moves + " moves left", 70);
	    Unscrambler ();
	}
	else
	{
	    printSlow (" ", 50);
	    printSlow ("Welcome Back Soldier!", 75);
	    Moves--;
	    printSlow ("You have " + Moves + " moves left", 70);
	    Delay (35);
	    Trenchshots1 ();
	}


    }

    
    public void Trenchshots1 ()
    //The user will be given a series of math questions, to pass they will need to answer each correctly
    //It gets slightly harder each time
    {
	printSlow (" ",75);
	System.out.println ("    ,-'\"\"\"`-, ");   
	System.out.println ("  ,' \\ _|_ / `.");   
	System.out.println (" /`.,'\\ | /`.,'\\ "); 
	System.out.println ("(  /`. \\|/ ,'\\  )  ");     
	System.out.println ("|--|--;=@=:--|--|   "); 
	System.out.println ("(  \\,' /|\\ `./  )   "); 
	System.out.println (" \\,'`./ | \\,'`./    "); 
	System.out.println ("  `. / \"\"\" \\ ,'     "); 
	System.out.println ("    '-._|_,-`     "); 

	printSlow ("Congratulations, you are now in the second part of the tenches. Here the",60);
	printSlow ("shooting ranges are located and as a part of the new war effort, the officials ",60);
	printSlow ("have placed small shooting ranges in the trenches. To get passed you will need",60);
	printSlow ("to score two bull's eyes",60);
	Delay (30);
	Firsteasyshot ();
    }
    public void Firsteasyshot ()
    {   printSlow (" ",75);
	printSlow ("To shoot a bull's eye successfully, you will need to answer a series of math", 65);
	printSlow ("problems. If correct you get to go to the next one, if wrong, you start all over.",60);
	printSlow (" ",75);
	printSlow ("The first target is perpendicular to the ground and 20 meters away. This bullet ",65); 
	printSlow ("that you need to use falls 1 degree for every 1 meter. At which degree do you need ",65);
	printSlow ("to hold the gun to get a bull's eye? (Hint: remember to include 90 degrees since",75);
	printSlow ("the target is perpendicular to the ground).",65);
	printSlow (" ",75);     
	double firstshot = IBIO.inputDouble ("Your answer (Degrees): ");  
		if (firstshot==110)
		{
	printSlow ("Good shot soldier! Get going to the second target!",64);
		Moves--;
		printSlow ("You have " + Moves + " moves left", 70);
		Delay (35);
		secondshoteasy();
}
		else
		{
			printSlow ("Bad shot soldier! Shoot again!",75);
			Moves--;
			printSlow ("You have " + Moves + " moves left", 70);
			Firsteasyshot ();
		}
	
}
    public void secondshoteasy ()
    {
	printSlow (" ",75);
	printSlow ("For the second target there is a weaker gun that shoots the bullet innacurately.",75);
	printSlow (" ",75);
	printSlow ("With this gun, the bullet drops 2 degree every 1 meters and the target is 25 meters.",75);
	printSlow ("At which degree do you have to hold the gun up at to shoot the bull's eye? (Hint:",75);
	printSlow ("remember to include 90 degrees since the target is perpendicular to the ground).",75);
	printSlow ("",75);
	double secondshotez = IBIO.inputDouble ("Your answer (Degrees): ");  
		if (secondshotez== 140)
		{
	printSlow ("Good shot soldier! Get going to the second target!",64);
		Moves--;
		printSlow ("You have " + Moves + " moves left", 70);
		Delay (35);
		lastshoteasy ();
}
		else
		{
			printSlow ("Bad shot soldier! Shoot again!",75);
			Moves--;
			printSlow ("You have " + Moves + " moves left", 70);
			Delay (35);
			secondshoteasy ();
		}
	
}
    public void lastshoteasy ()
    {
	printSlow (" ",75);
	printSlow ("For the last target there is a stronger gun that shoots the bullet straighter.",75);
	printSlow (" ",75);
	printSlow ("With this gun, the bullet drops 1 degree every 2 meters and the target is 50 meters.",75);
	printSlow ("At which degree do you have to hold the gun up at to shoot the bull's eye? (Hint:",75);
	printSlow ("remember to include 90 degrees since the target is perpendicular to the ground).",75);
	printSlow ("",75);
	double lastshotez = IBIO.inputDouble ("Your answer (Degrees): ");  
		if (lastshotez== 115)
		{
	printSlow ("Good shot soldier! Get going to the next trench!",64);
		Moves--;
		printSlow ("You have " + Moves + " moves left", 70);
		Delay (35);
		newsoldierseasy ();
		
		
}
		else
		{
			printSlow ("Bad shot soldier! Shoot again!",75);
			Moves--;
			printSlow ("You have " + Moves + " moves left", 70);
			lastshoteasy ();
		}
	
}
    public void newsoldierseasy ()
    //Here they will be given a dual language test
    //They will have to translate to get the answers and go to the next part
    {
	printSlow ("In the third part and final part of the trench, you will be speaking to some French allies",65);
	printSlow ("Who will then let you go through if you speak right. Good Luck!",75);
	printSlow (" ",75);  
	Delay (35);
	frenchspeakeasy();
	
	
    }
    public void frenchspeakeasy ()
    {
	printSlow ("Soldier: Bonjour! Comment ca va?",75);
	String greet = IBIO.inputString ("______ __ __ ____ ____ (Hi, I am very well, \nplease type the words without puntuation): ");
	
	if (greet.equalsIgnoreCase ("Bonjour ca va tres bien"));
	{
	printSlow ("Soldier: Comment vous appelez-vous ?",65);
	printSlow (" __ _'______ (My name is) " + name +" et _'__ ______ (I need) aller a travers la _____",75);
	String first = IBIO.inputString ("First Blank (please type the words without puntuation): ");
	String second = IBIO.inputString ("Second Blank (please type the words without puntuation): ");
	String third = IBIO.inputString ("Third Blank: (please type the words without puntuation) ");
	if (first.equalsIgnoreCase ("Je m'appele"))
	{
		printSlow (" ",65);
		Delay(35);
		printSlow ("Correct on first word",65);
	}
		else
		{
			printSlow (" ",65);
			Delay(35);
			printSlow ("Mauvais, encore",65);
			Moves--;
			printSlow ("You have " + Moves + " left to save your friend",75);
			frenchspeakeasy ();
			
		}
		if (second.equalsIgnoreCase ("J'ai besoin"))
		{
			printSlow (" ",65);
		Delay(35);
			printSlow ("Correct on second word",65);
	}
		else
		{
			printSlow (" ",65);
			Delay(35);
			printSlow ("Mauvais, encore",65);
			Moves--;
			printSlow ("You have " + Moves + " left to save your friend",75);
			frenchspeakeasy ();
			
		}
		if (third.equalsIgnoreCase ("porte"))
		{
			printSlow (" ",65);
		Delay(35);
			printSlow ("Correct on third word",65);
			Conclusion ();
	}
		else
		{
			printSlow (" ",65);
			Delay(35);
			printSlow ("Mauvais, encore",65);
			Moves--;
			printSlow ("You have " + Moves + " left to save your friend",75);
			frenchspeakeasy ();
			
		}
	}
    
	
	 if (!greet.equalsIgnoreCase ("Bonjour"));
	
     {
	 printSlow (" ",65);
		Delay(35);
		printSlow ("Soldier: Mauvais, encore",75);
		Moves--;
		printSlow ("You have " + Moves + " left to save your friend",75);
		frenchspeakeasy ();
		
     }
    }

    public void tunnelb ()
	//This is the harder and shorter trench with harder models of the challenges from the above trench
    {
	System.out.println ("   ___________ ");
	System.out.println ("| |  _ _ _ _  | |");
	System.out.println ("| | | | | | | | |");
	System.out.println ("| | |-+-+-+-| | |");
	System.out.println ("| | |-+-+=+%| | |");
	System.out.println ("| | |_|_|_|_| | |");
	System.out.println ("| |    ___    | |");
	System.out.println ("| |   [___] ()| |");
	System.out.println ("| |         ||| |");
	System.out.println ("| |         ()| |");
	System.out.println ("| |           | |");
	System.out.println ("| |           | |");
	System.out.println ("| |           | |");
	System.out.println ("|_|___________|_|");
	printSlow (" ", 100);
	printSlow ("You keep walking feeling a bit tired but still with determination, ", 100);
	printSlow (friend + " must not die. You decide to choose the harder but shorter trench", 100);
	printSlow (" ", 100);
	pwgame ();
    }
	public void pwgame ()
	{
	printSlow ("Almost immediately, you reach a door with a passcode you need to get through.", 100);
	printSlow ("You forgot the password but luckily it has a hint which any Allies soldier", 100);
	printSlow ("can answer.", 100);
	System.out.println ("   _____ _                         _____                   ");
	System.out.println ("  |_   _| |                       |  ___|                  ");
	System.out.println (" _ __| | | |__   ___  ___ _ __    | |_ _ __ _____   _____  ");
	System.out.println ("| \'__| | | \'_ \\ / _ \\/ __| \'_ \\   |  _| \'__/ _ \\ \\ / / _ \\ ");
	System.out.println ("| |  | | | | | |  __/ (__| | | |  | | | | |  __/\\ V /  __/ ");
	System.out.println ("|_|  \\_/ |_| |_|\\___|\\___|_| |_|  \\_| |_|  \\___| \\_/ \\___| ");
	printSlow ("Hint: This disease was commonly found in the trenches, it was thought 800 000 Allies'", 75);
	printSlow ("soldiers were affected", 75);
	String lice = IBIO.inputString ("Unscamble the letters above for the Password, each incorrect guess\nwill cost a move \n ");
	if (!lice.equalsIgnoreCase ("Trench Fever"))
	{
	    printSlow (" ", 50);
	    printSlow ("That is Wrong Soldier!", 110);
	    Moves--;
	    printSlow ("You have " + Moves + " moves left", 70);
	    Delay (35);
	    pwgame ();
	}
	else
	{
	    printSlow (" ", 50);
	    printSlow ("Welcome Back Soldier!", 75);
	    Moves--;
	    printSlow ("You have " + Moves + " moves left", 70);
	    Delay (35);
	    Trenchshots ();
	}
	}
    
    
    
    public void Trenchshots ()
    //Same as before, math questions that get harder each time
    {

    System.out.println ("    ,-'\"\"\"`-, ");   
	System.out.println ("  ,' \\ _|_ / `.");   
    System.out.println (" /`.,'\\ | /`.,'\\ "); 
	System.out.println ("(  /`. \\|/ ,'\\  )  ");     
	System.out.println ("|--|--;=@=:--|--|   "); 
	System.out.println ("(  \\,' /|\\ `./  )   "); 
	System.out.println (" \\,'`./ | \\,'`./    "); 
	System.out.println ("  `. / \"\"\" \\ ,'     "); 
	System.out.println ("    '-._|_,-`     "); 

	printSlow ("Congratulations, you are now in the second part of the tenches. Here the",60);
	printSlow ("shooting ranges are located and as a part of the new war effort, the officials ",60);
	printSlow ("have placed small shooting ranges in the trenches. To get passed you will need",60);
	printSlow ("to score two bull's eyes",60);
	Delay (30);
	Firstshots ();
    }
    public void Firstshots ()
    {
	printSlow (" ",75);
	printSlow ("To shoot a bull's eye successfully, you will need to answer a series of math", 65);
	printSlow ("problems. If correct you get to go to the next one, if wrong, you start all over.",60);
	printSlow (" ",75);
	printSlow ("The first target is perpendicular to the ground and 20 meters away. This bullet ",65); 
	printSlow ("that you need to use falls 1 degree for every 1 meter. At which degree do you need ",65);
	printSlow ("to hold the gun to get a bull's eye? (Hint: remember to include 90 degrees since ",75);
	printSlow ("the target is perpendicular to the ground).",75);
	printSlow (" ",75);
	double firstshot = IBIO.inputDouble ("Your answer (Degrees): ");  
		if (firstshot==110)
		{
	printSlow ("Good shot soldier! Get going to the second target!",64);
		Moves--;
		printSlow ("You have " + Moves + " left",75);
		secondshot ();
    }
		else
		{
			printSlow ("Bad shot soldier! Shoot again!",75);
			Moves--;
			printSlow ("You have " + Moves + " left",75);
			Delay (35);
			printSlow (" ",75);
			Firstshots ();
		}
	
    }
    public void secondshot ()
    {
	printSlow ("For the second shot you need to shoot the same bullet 40 meters (it goes down 1 degree",75);
	printSlow ("every meter. However this time the bullet is faced with wind resistance making it go 1",65);
	printSlow ("degree to the right every 2 meters. (Hint: remember to include 90 degrees since ",75);
	printSlow ("the target is perpendicular to the ground).",75);
	Delay (25);
	String secondshot = IBIO.inputString ("Write your answer here (degrees up, then degrees left, ex.#1,#2):");
	if (secondshot.equals ("130"))
	{
		printSlow ("Nice Shot soldier!",65);
	Moves--;
	printSlow ("You have " + Moves + " left",75);
	Delay (35);
	newsoldiers ();
	}
	else
	{
		printSlow ("Bad shot soldier! Shoot again!",75);
			Moves--;
			printSlow ("You have " + Moves + " left",75);
			Delay (35);
			secondshot();
		}
    }
  
    public void newsoldiers ()
    //New soldiers that speak French and users need to translate correctly
    {
	printSlow (" ",75);
	printSlow ("In the third part and final part of the trench, you will be speaking to some French allies",65);
	printSlow ("Who will then let you go through if you speak right. Good Luck!",75);
	printSlow (" ",75);  
	Delay (35);
	frenchspeak();
	
	
    }
    public void frenchspeak ()
    {
	printSlow (" ",75);
	printSlow ("Soldier: Bonjour! Comment ca va?",75);
	String greet = IBIO.inputString ("______ ca va tres bien (please type the words without puntuation) ");
	
	if (greet.equalsIgnoreCase ("Bonjour"));
	{
	printSlow ("Soldier: Comment vous appelez-vous ?",65);
	printSlow ("Je m'______ " + name +" et J'ai besoin _____ a travers la _____",75);
	String first = IBIO.inputString ("First Word: ");
	String second = IBIO.inputString ("Second Word: ");
	String third = IBIO.inputString ("Third Word:");
	if (first.equalsIgnoreCase ("appele"))
	{
		printSlow (" ",65);
		Delay(35);
		printSlow ("Correct on first word",65);
	}
		else
		{
			printSlow (" ",65);
			Delay(35);
			printSlow ("Mauvais, encore",65);
			Moves--;
			printSlow ("You have " + Moves + " left to save your friend",75);
			frenchspeak ();
			
		}
		if (second.equalsIgnoreCase ("aller"))
		{
			printSlow (" ",65);
		Delay(35);
			printSlow ("Correct on second word",65);
	}
		else
		{
			printSlow (" ",65);
			Delay(35);
			printSlow ("Mauvais, encore",65);
			Moves--;
			printSlow ("You have " + Moves + " left to save your friend",75);
			frenchspeak ();
			
		}
		if (third.equalsIgnoreCase ("porte"))
		{
			printSlow (" ",65);
		Delay(35);
			printSlow ("Correct on third word",65);
			Conclusion ();
	}
		else
		{
			printSlow (" ",65);
			Delay(35);
			//This means wrong, again
			printSlow ("Mauvais, encore",65);
			Moves--;
			printSlow ("You have " + Moves + " left to save your friend",75);
			frenchspeak ();
			
		}
	}
    
	
	 if (!greet.equalsIgnoreCase ("Bonjour"));
	
     {
	 printSlow (" ",65);
		Delay(35);
		printSlow ("Soldier: Mauvais, encore",75);
		Moves--;
		printSlow ("You have " + Moves + " left to save your friend",75);
		frenchspeak ();
		
     }
    }
    public void Conclusion ()
    //If the win, they come here and after a few seconds they can play again
    {
	printSlow (" ",65);
	printSlow ("You rush through the doors and meet the medical",75);
	printSlow ("doctor who takes one look at your friend and quickly",75);
	printSlow ("starts preparing to do surgery and save his life. Thanks",75);
	printSlow ("to your bravery, you both survived the war!",75);
	Delay (35);
	System.out.println ("  _______ _            ______           _ ");
	System.out.println (" |__   __| |          |  ____|         | |");
		System.out.println ("    | |  | |__   ___  | |__   _ __   __| |");
		System.out.println ("    | |  | '_ \\ / _ \\ |  __| | '_ \\ / _` |");
	System.out.println ("    | |  | | | |  __/ | |____| | | | (_| |");
	System.out.println ("    |_|  |_| |_|\\___| |______|_| |_|\\__,_|");
	printSlow (" ",75);
	printSlow (" ",75);
	printSlow (" ",75);
	Delay (120);
	new TheGame ();
						  
    }
    public void Conclusionfail ()
    //If they fail, they can come here where they will be brought to the beginning to play again
    {
	printSlow ("Unfortunately your friend died.",75);
	Delay (75);
	new TheGame ();
    }
    public void printSlow (String s, int x)
	//This to make sure the words are printed slower, I tried to customize each line with the int x
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    //To type some lines to make it a bit slower
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter
	    try
	    {
		Thread.sleep (60);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
	System.out.println ();

    }


    public void Delay (int a)
    //To add a delay to make the game look better
    //(20) = 1 second, (40) = 2 seconds.
    {
	try
	{
	    Thread.sleep (a * 50);
	}
	catch (InterruptedException ex)
	{
	    Thread.currentThread ().interrupt ();
	}
    }
}


