public class Skeleton extends Boss {
    private int arrow;;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }
    @Override
    public void printInfo(){
       super.printInfo();
        System.out.println("Number of arrows: "+ arrow);

    }

}
