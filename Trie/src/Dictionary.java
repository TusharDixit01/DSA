import java.util.Scanner;

// we are using trie data Structure for storing all the elements in the root 
// we can search the string in time complexity of O(Maximum Length of String)        --------->Time complexity
// we can see searching is efficient in Trie Data Structure
public class Dictionary {
     
    // Alphabet size (# of symbols)
    static final int ALPHABET_SIZE = 26;
     
    // trie node
    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
      
        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;
         
        TrieNode(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };
      
    static TrieNode root;
     
    // If not present, inserts key into trie
    // If the key is prefix of trie node,
    // just marks leaf node
    static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
      
        TrieNode pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();
      
            pCrawl = pCrawl.children[index];
        }
      
        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }
      
    // Returns true if key presents in trie, else false
   public static boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.children[index] == null)
                return false;
      
            pCrawl = pCrawl.children[index];
        }
      
        return (pCrawl.isEndOfWord);
    }
      
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
    	//dummy Dictionary
        // Input keys (use only 'a' through 'z' and lower case)        
        String dictionary[] = {"apple","app","bucket","cat","dog","elephant","fish","goat","girl"};
      
//        String output[] = {"Not present in dictionary", "Present in dictionary"};
         String input=sc.next();
      
        root = new TrieNode();
      
        // Construct trie
        int i;
        for (i = 0; i < dictionary.length ; i++)
            insert(dictionary[i]);
        
        //search is the method to tell if that element is present in the dictionary
        if(search(input) == true)
          System.out.println(true);
      else System.out.println(false);
        
    }
}