public class HelloWorld {

    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String name) {
        String firstLetter = name.substring(0,1).toUpperCase();
        String remainLetters = name.substring(1);
        return "Hello " + firstLetter + remainLetters ;
    }

}
