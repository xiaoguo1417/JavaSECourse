public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public Item(String title, int playingTime){
        this.title = title;
        this.playingTime = playingTime;
        gotIt = false;
        comment = "<no comment>";
    }

    public void setOwn(boolean gotIt){
        this.gotIt = gotIt;
    }

    public boolean find(String name){
        return false;
    }

    public void print(){
        System.out.print(title + " (" + playingTime + " mins)");
        if (gotIt) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + comment);
    }
}
