package stevens;

public class Main {

    private void sayHelloPublic() {
        System.out.println("Hello, my name is Kara\n");
        System.out.println("Hello Kara! my name is Paul!\n");
    }

        // Main method
        public static void main(String[] args) {
            //public method first
            Main hello = new Main(); //create an object of Main
            hello.sayHelloPublic(); // call the public method on the object
        }


}
