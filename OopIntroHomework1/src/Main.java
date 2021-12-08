public class Main {

    public static void main(String[] args) {
        Library library1 = new Library("comedy",321,15.5,25 );
        Library library2 =new Library("finction",245,25.50,55);

        Library [] libraries ={library1,library2};
        for (Library library: libraries){
            System.out.println(library.type);
        }

        LibraryManager libraryManager = new LibraryManager();
        libraryManager.comedyBookCount(library1);
        libraryManager.finctionBookCount(library2);
    }

}
