public class LibraryRoyaltyCalculator {

    void main(){

        Title Harry_p = new PrintedBook("Harry Potter ","skøn",150,300);
        Title alice = new AudioBook("Alice in wonderland","SKØN",200,140);

        Author john = new Author( "John");

        john.addTitle(alice);
        john.addTitle(Harry_p);

        Title titanic = new EAudioBook("Titanic", "TE", 30,28,72,140);

        john.addTitle(titanic);

        System.out.println("Johns royalties: "+ john.calculateRoyalties()+"kr");

    }

}
