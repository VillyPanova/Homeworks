package homework5;

public class Cat extends Animal {
    //instance variable
    private String breed;
//default constructor
//    public Cat (){
//        breed = "persian";
//    }

    //constructor with params
    public Cat (int age, String name, float weight, boolean hasTail, String breed){
        super(age, name, weight, hasTail);
        setBreed(breed);
    }

    //copy constructor
    public Cat(Cat cat){
        super(cat.getAge(), cat.getName(), cat.getWeight(), cat.getHasTail());
        setBreed(cat.getBreed());
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        if (!breed.isEmpty() && !breed.isBlank()){
            this.breed = breed;
        }else {
            System.out.println("ERROR: Invalid input data for Breed.");
        }
    }

    //method
    public void miau(){
        System.out.println("miau miau");
    }

    public void printData(){
        System.out.printf("Name is: %s, breed is: %s, age is: %d, weight is: %.3f, address is: %s\n", super.getName(),
                breed, super.getAge(), super.getWeight(), super.getAddress().toString());
    }

    public static void main(String[] args) {
        Test.someTestMethod("Hello from Cat Class");
        Cat.eat(Cat.getCatFood(2));
    }

    public static void eat(String food){
        System.out.println("Eating " + food);
    }

    public static String getCatFood(int value){
        String result = "";

        switch (value){
            case 1:
                result = "granuli";
                break;
            case 2:
                result = "pastet";
                break;
            case 3:
                result = "milk";
                break;
            default:
                result = "Invalid entry";
        }

        return result;
    }

    public static int calculateAverage(int a, int b, int c){
        int result = (a + b + c) / 3;
        return result;
    }

    public static boolean checkEquals(int a, int b){
        return a == b;
    }

    public void suggestFood(WeekDays day){
        switch (day){
            case Monday:
                System.out.println("For today best food will be pork");
                break;
            //rest of the days
            case Sunday:
                System.out.println("For today best food will be poulet");
                break;
        }
    }
}