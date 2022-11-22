public class Routine
{
    //instance variables
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;
    
    //constructor
    public Routine(){
        school = 0;
        sleep = 0;
        friends = 0;
        hobbies = 0;
    }
    
    //getSchool
    public double getSchool(){
        return school;
    }
    
    //getSleep
    public double getSleep(){
        return sleep;
    }
    
    //getFriends
    public double getFriends(){
        return friends;
    }
    
    //getHobbies
    public double getHobbies(){
        return hobbies;
    }
    
    //set
    public void setSchool(double newSchool){
        school = newSchool;
    }
    public void setSleep(double newSleep){
        sleep = newSleep;
    }
    public void setFriends(double newFriends){
        friends = newFriends;
    }
    public void setHobbies(double newHobbies){
        hobbies = newHobbies;
    }
    
    //printTotal method. 
    public void printTotal(){
        double schoolWeek =school *7;
        double sleepWeek= sleep *7;
        double friendsWeek= friends *7;
        double hobbiesWeek= hobbies *7;
        double total= schoolWeek + sleepWeek + friendsWeek + hobbiesWeek;
        //prints out stats above. 
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + schoolWeek);
        System.out.println("Sleeping: " + sleepWeek);
        System.out.println("With Friends: " + friendsWeek);
        System.out.println("Doing fun stuff: " + hobbiesWeek);
        System.out.println("You're busy " + total + " hours a week!");
    }
    
}