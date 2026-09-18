
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
         return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
      birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            } 
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int osszeg=0;
        if (numberOfDays > birdsPerDay.length) {
        numberOfDays = birdsPerDay.length;
    }
        for(int i=0; i<numberOfDays;i++ ){
            osszeg=osszeg+birdsPerDay[i];
        }
        return osszeg;
    }

    public int getBusyDays() {
        int seged=0;
        for( int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                seged++;
            }
        }
        return seged;
    }
}
