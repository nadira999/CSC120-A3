
import java.util.Scanner;


class Conversation { // creates a class called "Conversation"
    public static void main(String[] arguments) {
        // You will start the conversation here.
        String[] canned_phrases = {   // creates a list of canned_phrases for when the scanner can't find words to reflect.
            "Hmmm",
            "Great",
            "Tell me more!",
            "What else?"
        };
        int count = 0;  // starts the count with zero
        Scanner input = new Scanner(System.in);
      // Starts the conversation with asking the number of rounds in a conversation from the user.
        System.out.println("Wellcome to chatbot! how many rounds of conversation would you like?");
        int numRounds = input.nextInt();
        input.nextLine(); // next line always used with nextInt-used to clear out the return key
        System.out.println("what is on your mind?");
        for (int r = 0; r < numRounds; r++) {
            String response = input.nextLine();
        // Splits the user's conversation by spaces between each word.
            String[] userConversationStrings = response.split(" ");
            String result = "";
            for (int N = 0; N < userConversationStrings.length; N++) {

        // replaces every mirrored word with another canner words.
                String compare = userConversationStrings[N];
                if (compare.toLowerCase().equals("you")) {
                    userConversationStrings[N] = "I";
                    result += userConversationStrings[N];
                } else if (compare.toLowerCase().equals("am")) {
                    userConversationStrings[N] = "are";
                    result += userConversationStrings[N];
                } else if (compare.toLowerCase().equals("me")) {
                    userConversationStrings[N] = "you";
                    result += userConversationStrings[N];
                } else if (compare.equals("I")) {
                    userConversationStrings[N] = "you";
                    result += userConversationStrings[N];
                } else if (compare.toLowerCase().equals("my")) {
                    userConversationStrings[N] = "your";
                    result += userConversationStrings[N];
                } else if (compare.toLowerCase().equals("your")) {
                    userConversationStrings[N] = "my";
                    result += userConversationStrings[N];
                } else if (compare.toLowerCase().equals("are")) {
                    userConversationStrings[N] = "am";
                    result += userConversationStrings[N];
                } else {
                    result += userConversationStrings[N];
                }
                    result += " ";
            }
            result = result.strip(); 
            if (result.equals(response)) {
                result = canned_phrases[count];
                count++;
                if (count == 4) {
                    count = 0;
                }
            } 
            System.out.println(result); 
        }
    }
}