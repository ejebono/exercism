public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int y){
        return expectedMinutesInOven()-y;
    }

    public int preparationTimeInMinutes(int a){
        return a*2;
    }
    

    public int totalTimeInMinutes(int a, int y){
        return preparationTimeInMinutes(a)+y;
    }
}
