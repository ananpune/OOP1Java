package assign4;
import java.util.Scanner;
import java.io.File;
import java.util.Random;

public class NerdleEngine {
    
    private int guessNumber;
    private String secretWord;

    public NerdleEngine(){

        try {
            //selects our secret word
            this.secretWord=selectSecretWordFromFile();
        } catch (Exception e) {
            System.out.println("File Error");
        }
        //initial guess set to 0
        this.guessNumber=0;
    }

    private String selectSecretWordFromFile() throws Exception{
        //picking a file and setting our scanner and return string
        File file = new File("words.txt");
        Scanner scanner = null;
        String stringToReturn ="";
        //try catch to check if the file even exists (has a next line)
        try {
            //going through the file and counting up lines
            scanner = new Scanner(file);
            int lineCount = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
            //close current instance of scanner, don't tneed it right now 
            scanner.close();
            Random random = new Random();
            //pick a random int between 0 and lineCount
            int randomNumber = random.nextInt(lineCount);
            //reopen to the start of the file
            scanner = new Scanner(file);
            //go the random number that we established
            for (int i = 0; i < randomNumber; i++) {
                scanner.nextLine();
            }
            //set the string to that line
            stringToReturn = scanner.nextLine();     

        } catch (Exception e) {
            System.out.println("File not found");
        }
        //return string
        return stringToReturn;

    }

    public GuessResponse makeGuess(String userGuess){
        boolean winLose = false;
        int guessNum = this.guessNumber;
        String guess = userGuess;
        int letterStatus[] = new int[5];
        //initialize all values to 0 to start
        letterStatus[0]=0;
        letterStatus[1]=0;
        letterStatus[2]=0;
        letterStatus[3]=0;
        letterStatus[4]=0;
        //make sure the guess is atleast 5 letters long
        if(userGuess.length() < 5){
            System.out.println("Guess must be 5 letters");
            return new GuessResponse(guessNum, winLose, guess, letterStatus);
        }
        else{
            //checking if the guess had a char that is the same in both positions
            for(int i = 0; i < 5; i++){
                if(this.secretWord.charAt(i) == userGuess.charAt(i)){
                    //update our letterStatus array
                    letterStatus[i] = 2;
                }
                else{
                    //checking if the guess had a char that is the same in the secret word, diff position
                    for(int j = 0; j < 5; j++){
                        if(this.secretWord.charAt(i) == userGuess.charAt(j)){
                            //update our letterStatus array
                            letterStatus[i] = 1;
                        }
                    }
                }
            }
        }
        //increment our guess number
        guessNum++;
        //check if the guess is the same as our secret word
        if(guess.equals(this.secretWord)){
            winLose = true;
        }
        GuessResponse returnVal = new GuessResponse(guessNum, winLose, guess, letterStatus);
        return returnVal;





       

    }

}
