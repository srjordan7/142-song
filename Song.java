public class Song {

   // main prints the song 
    public static void main(String[] args) {
      Fly();
      Spider();
      Bird();
      Cat();
      Dog();
      Cow();
      Horse();
    }
    
    // creates fly verse 
    public static void Fly() {
      System.out.println("There was an old woman who swallowed a fly.");
      End();
    }
    
    // creates verse endings
    public static void End() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
    }
    
    // creates spider verse
    public static void Spider() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      SpiderEnd();
    }
    
    // creates spider end
    public static void SpiderEnd() {
      System.out.println("She swallowed the spider to catch the fly,");
      End();
    }
    
    // creates bird verse
    public static void Bird() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      BirdEnd();
    }
    
    // creates bird ending
    public static void BirdEnd() {
      System.out.println("She swallowed the bird to catch the spider,");
      SpiderEnd();
    }
    
    // creates cat verse 
    public static void Cat() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      CatEnd();
    }
    
    // creates cat ending
    public static void CatEnd() {
      System.out.println("She swallowed the cat to catch the bird,");
      BirdEnd();
    }
    
    // creates dog verse
    public static void Dog() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      DogEnd();
    }
    
    // creates dog ending
    public static void DogEnd() {
      System.out.println("She swallowed the dog to catch the cat,");
      CatEnd();
    }
    
    // creates cow verse
    public static void Cow() {
      System.out.println("There was an old woman who swallowed a cow,");
      System.out.println("It raises a brow to swallow a cow.");
      CowEnd();
    }
    
    // creates cow ending
    public static void CowEnd() {
      System.out.println("She swallowed the cow to catch the dog,");
      DogEnd();
    }
    
    // creates horse verse
    public static void Horse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
    }
}