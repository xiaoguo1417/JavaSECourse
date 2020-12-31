import java.util.ArrayList;

public class MyNotebook {

    private int count;
    ArrayList<String> notes = new ArrayList<String>();

    public void addNote(String note){
        notes.add(note);
    }

    public String getNote(int number){
        return notes.get(number);
    }

    public void showAll(){
        for(String note : notes){
            System.out.println(note);
        }
    }

    public int getCount(){
        return notes.size();
    }

    public void removeNote(int number){
        notes.remove(number);
    }

    public static void main(String[] args){

        MyNotebook notebook = new MyNotebook();
        notebook.addNote("AAAAAAAAA");
        notebook.addNote("BBBBBBBBB");
        notebook.addNote("CCCCCCCCC");

        notebook.showAll();
        System.out.println("The Size of notebook is " + notebook.getCount());

        int number = 1;
        notebook.getNote(number);

        notebook.removeNote(number);

        notebook.showAll();
        System.out.println("The Size of notebook is " + notebook.getCount());
    }
}
