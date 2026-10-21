import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author( String name) {
        this.titles = new ArrayList<>();
        this.name = name;
    }

    public void addTitle(Title title){
        titles.add(title);
    }

    public double calculateRoyalties(){
        double totalRoyalties = 0;
        for (Title t : titles){
            totalRoyalties += t.calculateRoyalty();
        }
        return totalRoyalties;
    }

    public String getName() {
        return name;
    }
}
