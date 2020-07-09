import java.io.File;

/**
 * Created by KPS on 7/9/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        System.out.println("the size of file is : "+path.length());
    }
}
