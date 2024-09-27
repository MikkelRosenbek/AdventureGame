//Creator - Klassen, som opretter rummene og kæder dem sammen
public class Map {

    private Room startingRoom;

    public Map() {
        createRoom();
    }

    public void createRoom() {

        //Her opretter jeg de forskellige rum og giver dem et nummer og en beskrivelse
        Room room1 = new Room("The Whispering Gallery", "A long, arched hallway decorated with colorful paintings that seem to come alive with soft whispers. The gentle echoes of past conversations fill the air, while glowing orbs cast a warm light, creating an inviting and mysterious atmosphere." + "\n");
        Room room2 = new Room("The Enchanted Library", "A cozy, dimly lit room filled with towering shelves of ancient books, their spines glimmering with magic. Whispers of spells and secrets fill the air, while enchanted lanterns float gently above, casting a warm glow over the room." + "\n");
        Room room3 = new Room("The Great Hall", "The Great Hall is a majestic space with high ceilings and an enchanted ceiling reflecting the sky, filled with long wooden tables. Floating candles illuminate the room, creating a warm atmosphere as laughter and chatter fill the air." + "\n");
        Room room4 = new Room("The Dark Forest", "A shadowy, mysterious forest filled with towering trees and thick underbrush, where the sounds of rustling leaves and distant creatures echo. Moonlight filters through the branches, creating an eerie yet enchanting atmosphere, inviting adventurers to explore its secrets." + "\n");
        Room room5 = new Room("The Room of Requirement", "A magical room that changes to fit your need, appearing only when you truly needs it. Shadows play on the walls as it becomes a cozy sanctuary, a training area, or a hidden treasure room, all lit by a soft, mysterious glow." + "\n");
        Room room6 = new Room("The Quidditch arena", "A vast, open field surrounded by empty stands, where the echoes of past matches linger in the air. A few abandoned broomsticks rest on the ground, and scattered Quidditch balls lie around, hinting at the excitement that once filled the pitch." + "\n");
        Room room7 = new Room("The Potion Master’s Sanctum", "A dimly lit chamber filled with shelves of rare ingredients and bubbling cauldrons, each emitting mysterious vapors. The air is rich with the scent of herbs and potions, while intricate spell diagrams adorn the walls, hinting at the secrets of potion-making within." + "\n");
        Room room8 = new Room("The Enchanted Corridors", "A long, winding corridor adorned with shimmering tapestries and portraits that seem to whisper as you pass by. Soft, flickering lights illuminate the path, and the walls occasionally shift, creating a sense of wonder and mystery as you navigate through the enchanted space." + "\n");
        Room room9 = new Room("The Chamber of secrets", "A hidden, ancient chamber filled with stone walls covered in serpentine carvings and a large, ominous statue of a basilisk at its center. The air is thick with an unsettling silence, and the faint echo of dripping water adds to the atmosphere of mystery and danger." + "\n");

        // Herunder bliver alle rum passet op mod hinanden i de forskellige mulige retninger, som spilleren kan gå
        room1.setNorth(null);
        room1.setSouth(room4);
        room1.setEast(room2);
        room1.setWest(null);

        room2.setNorth(null);
        room2.setSouth(null);
        room2.setEast(room3);
        room2.setWest(room1);

        room3.setNorth(null);
        room3.setSouth(room6);
        room3.setEast(null);
        room3.setWest(room2);

        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.setEast(null);
        room4.setWest(null);

        room5.setNorth(null);
        room5.setSouth(room8);
        room5.setEast(null);
        room5.setWest(null);

        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.setEast(null);
        room6.setWest(null);

        room7.setNorth(room4);
        room7.setSouth(null);
        room7.setEast(room8);
        room7.setWest(null);

        room8.setNorth(room5);
        room8.setSouth(null);
        room8.setEast(room9);
        room8.setWest(room7);

        room9.setNorth(room6);
        room9.setSouth(null);
        room9.setEast(null);
        room9.setWest(room8);

        startingRoom = room1;
    }
    public Room getStartingRoom() {
        return startingRoom;
    }
}
