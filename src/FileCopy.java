import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static  void main(String[]args){
        try(FileInputStream inputFile = new FileInputStream("");
            FileOutputStream outputFile = new FileOutputStream("C:")){

            int character;
            while ((character = inputFile.read())!=-1)
            {
                if (character == ' '){
                    character ='-';
                }
                outputFile.write(character);
            }
            System.out.println("File copied successfully!");

        }catch (IOException e){
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
