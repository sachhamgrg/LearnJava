import java.util.Scanner;

class Pokedex
{
    public static void main(String[] args)
    {
        Pokemon pikachu = new Pokemon(32, "Thunder", "Male");
        pikachu.setLevel(46);
        System.out.println("Level: "+ pikachu.getLevel() + "\nType: "+ pikachu.getType() + "\nGender: "+ pikachu.getGender());

        Pokemon pokemon = new Pokemon();
        System.out.println("\nEnter details of a new pokemon: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Level: ");
        pokemon.setLevel( Integer.parseInt(scanner.nextLine()) );
        System.out.println("Type: ");
        pokemon.setType(scanner.nextLine());
        System.out.println("Gender: ");
        pokemon.setGender(scanner.nextLine());

        System.out.println("Level: "+ pokemon.getLevel() + "\nType: "+ pokemon.getType() + "\nGender: "+ pokemon.getGender());
    }
}

class Pokemon
{
    // Encapsulation
    static int level;
    private String type;
    private String gender;

    //Default constructor
    Pokemon() {
        this.level = 5;
        this.type = "Unknown";
        this.gender = "Unknown";
    }

    // Parameterised constructor
    Pokemon(int level, String type, String gender) {
        this.level = level;
        this.type = type;
        this.gender = gender;
    }

    // Getter methods
    public int getLevel() {return level;}
    public String getType() {return type;}
    public String getGender() {return gender;}

    // Setter method
    public void setLevel(int level) {this.level = level;}
    public void setType(String type) {this.type = type;}
    public void setGender(String gender) {this.gender = gender;}
}