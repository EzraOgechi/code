 class Animal{
   
        public void makeSound(){
            System.out.println("Animal Sound");
        }
    }
    
public class AnimalMain{
    public static void main(String[] args) {
        AnimalMain myAnimal=new AnimalMain(){
            public void makeSound(){
                System.out.println("Woof Woof");
            }
        };
        myAnimal.makeSound();
    }

}
