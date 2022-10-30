package Pract2;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Sofia", "sofia@asd.com", 'F');
        Author a2 = new Author("Mike", "mike232@asd1.com", 'M');
        Author a3 = new Author("Derek", "eqweqeqw@asd.com", 'M');
        a3.setEmail("qwerty@gmail.com");
        System.out.println(a3.getEmail());
        System.out.println(a2);
        System.out.println(a1);
        System.out.println(a3);
    }
}
