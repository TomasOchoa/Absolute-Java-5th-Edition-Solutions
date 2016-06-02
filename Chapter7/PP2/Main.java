package tomas.ochoa;

/**
 * - Create several sample objects of type
    - Email
    - File

 - Test by passing them to the followiung subroutine that returns true if the
 object contains the specified keyword in the text property

 public static boolean ContainsKeyword(Document docObject,String keyword)
 {
 if (docObject.toString().indexOf(keyword,0) >= 0)
 return true;
 return false;
 }
 * */

public class Main
{
// Tester
    public static boolean ContainsKeyword(Document docObject,String keyword)
    {
        if (docObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }
// Main method
    public static void main(String[] args)
    {
    // Create several sample objects
        File file1 = new File("C:users/documents/folder1","Hello my lady hello my darling\n" +
                                                          "Hello my big time gaaaaaal\n" +
                                                          "I love you michaela <3");
        File file2 = new File("C:users/documents/folder2","Tell me what anybody wouldnt give \n" +
                                                          "for a life like this, something something\n" +
                                                          "take a knife like this, smoke around like a \n" +
                                                          "kite like this, somehting this, i might just\n" +
                                                          "might just i dont know......\n" +
                                                          "Reinvention thats my intention worth so mcuh more\n" +
                                                          "than this third dimension thats not to mention \n" +
                                                          "my true ascenstion is the bigger picture no metaphor");
        Email email1 = new Email("Hello baby how are you?","Tomas Ochoa","Michaela Finnegan","I love you");
        Email email2 = new Email("Hello is it me your looking for?","Adele","Lover","Hello from the other side");

        System.out.println(file1.toString());
        System.out.println(file2.toString());

        System.out.println(email1.toString());
        System.out.println(email2.toString());

        System.out.println(ContainsKeyword(email1, "Hello"));
        System.out.println(ContainsKeyword(email2, "Logic"));

        System.out.println(ContainsKeyword(file1, "michaela"));
        System.out.println(ContainsKeyword(file2, "michaela"));

    }


}
