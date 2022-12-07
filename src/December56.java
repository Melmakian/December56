import java.io.*;

public class December56 {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));

        PrintStream realStream= System.out;

        ByteArrayOutputStream fakeText = new ByteArrayOutputStream();

        PrintStream fakeStream = new PrintStream(fakeText);
        System.setOut(fakeStream);

        testString.printSomething();

        FileOutputStream fileOutputStream = new FileOutputStream(rb.readLine());
        String fake = fakeText.toString();

        fileOutputStream.write(fake.getBytes());

        System.setOut(realStream);
        System.out.println(fake);
        rb.close();
        fileOutputStream.close();
    }
    public static class TestString{
        public void printSomething(){
            System.out.println("it's a text for testing");
        }
    }
}
