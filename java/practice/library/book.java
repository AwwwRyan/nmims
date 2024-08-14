class books{
    String title;
    String author;
    books(String title,String author){
        this.title=title;
        this.author=author;
    }

    void display(){
        System.out.println(title);
        System.out.println(author);
    }
}

class ebook extends books{
    double file_size;
    String format;

    ebook(String title,String author,double file_size, String format){
        super(title,author);
        this.file_size=file_size;
        this.format=format;
    }
    void display(){
        super.display();
        System.out.println(file_size);
        System.out.println(format);
    }
}

class printedbooks extends books{
    double edition;
    String numberofbooksold;

    printedbooks(String title,String author, double edition,String numberofbooksold){
        super(title,author);
        this.edition=edition;
        this.numberofbooksold=numberofbooksold;
    }
    void display(){
        super.display();
        System.out.println(edition);
        System.out.println(numberofbooksold);
    }
}


class book{
    public static void main(String[] args){
        ebook eb = new ebook("book one","author one",2.5,"png");
        eb.display();
    }
}