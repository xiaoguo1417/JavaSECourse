public class Main{
    public static void main(String[] args) {
        CD cd1 = new CD("cd1 title",60,"artist1",12);
        cd1.setOwn(true);
        CD cd2 = new CD("cd2 title",60,"artist2",12);
        CD cd3 = new CD("cd3 title",60,"artist3",12);

        DVD dvd1 = new DVD("dvd1 title",90, "director1");
        DVD dvd2 = new DVD("dvd2 title",90, "director2");

        Database database = new Database();
        database.addItem(cd1);
        database.addItem(cd2);
        database.addItem(cd3);
        database.addItem(dvd1);
        database.addItem(dvd2);
        database.findItem("artist1");
        database.findItem("director1");

        database.list();

    }
}
