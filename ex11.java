class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hello");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      // a.fly();       This line is outcommented because fly is not defined in Animal.

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      // System.out.println(b.numberOfKills);    numOfKills is not defined in Bird Animal
      b.fly();
      // b.attack();         numOfKills is not defined in Bird nor Animal

      Eagle e = new Eagle();
      // System.out.println(e.numberOfKills);     numOfKills is private so it can't be obtained 
      System.out.println(e.numberOfLegs);
      // answer to 1d, numOfLegs has been set in bird and bird inherits Eagle so it's also the same value for eagle.
      System.out.println(e.hasWings);
      e.talk();
      e.attack();

      a = b;
      a.talk(); 
      // a.fly();  // this one gives the error because a is of type animal and fly is not defined in animal.

      // b = a;   // this line gives the error because an animal(superclass) isn't necessary a bird(subclass), 
      b.talk(); 
      b.fly();  

   }
}

