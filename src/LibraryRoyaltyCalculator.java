public class LibraryRoyaltyCalculator {

    void main(){

        Title Harry_p = new PrintedBook("Harry Potter ","skøn",150,300);
        Title alice = new AudioBook("Alice in wonderland","SKØN",200,140);

        Author john = new Author( "John");

        john.addTitle(alice);
        john.addTitle(Harry_p);

        Title titanic = new EAudioBook("Titanic", "TE", 30,28,72,140);
        EBook ebook = new EBook("Titanic", "FAG",97,50,205,360000,false);

        System.out.println("points: "+ebook.calculatePoints());
        System.out.println("Royalties : "+ebook.calculateRoyalty());

        john.addTitle(titanic);

        System.out.println(john.getName()+"'s royalties: "+ john.calculateRoyalties()+"kr");

    }

}
