public class  CD extends Item{
    private String artist;
    private int numberOfTracks;

    public CD(String theTitle, int thePlayingTime, String theArtist, int theNumberOfTracks){
        super(theTitle, thePlayingTime);
        artist = theArtist;
        numberOfTracks = theNumberOfTracks;
    }

    @Override
    public boolean find(String name){
        if(artist.equals(name)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void print(){
        System.out.print("CD ");
        super.print();
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);
    }
}
