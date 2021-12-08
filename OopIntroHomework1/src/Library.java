public class Library {
    public Library(){
        System.out.println("Ben çalıştım");
    }
    public Library(String type, int averagePageCount, double marketPrice, int bookCount){
        this();
        this.type = type;
        this.averagePageCount= averagePageCount;
        this.marketPrice= marketPrice;
        this.bookCount=bookCount;
    }
        String type;
        int averagePageCount;
        double marketPrice;
        int bookCount;
}

