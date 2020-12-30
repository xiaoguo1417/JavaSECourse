public class DVD extends Item{
    private String director;

    public DVD(String theTitle, int thePlayingTime, String director){
        super(theTitle, thePlayingTime);
        this.director = director;
    }
    @Override
    public boolean find(String name){
        if(director.equals(name)){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void print(){
        System.out.print("DVD ");
        super.print();
        System.out.println("    " + director);
    }
}
