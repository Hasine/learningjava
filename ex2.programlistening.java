class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private int    length;
    
   // // Constructor of the class...
   // public Person(String aName, int anAge, int aLength) {
   //    name = aName;
   //    age  = anAge;
   //    length = aLength;
   // }

   // Methods of the class...
   public void age(){
         System.out.println("just " + age);
      }

   public void talk() {
      System.out.println("Hi, my name's " + name + ",");
      System.out.println("my age is " + age);
      commentAboutAge();
      System.out.println("and my length is " + length);
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60){
         System.out.println("Old person");
      }
   }

   public void growOlder(){
      age = age + 1;
      System.out.println("New age is " + age);
   }

   public void giveKnighthood(){
      name = "Sir " + name;
   }

   public void growOlderBy(int years){
      age = age + years;
      System.out.println("Grow older by " + age); 
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person(); 
      Person wp = new Person(); 
      
      ls.age();
      ls.talk();
      ls.growOlderBy(10);
      wp.giveKnighthood();
      wp.talk();
      wp.growOlder();
   }

}