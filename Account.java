import java.util.LinkedList;

public class Account{
    
    private String username;
    private String passHash;
    private LinkedList<String> notes;


    public Account(String un, String ph){
        this.username = un;
        this.passHash = ph;
    }

    public void setUsername(String un){
        this.username = un;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassHash(String ph){
        this.passHash = ph;
    }

    public String getPassHash(){
        return this.passHash;
    }
    
    public String notesToString(){
        if (notes.isEmpty()){
            return null;
        }

        String result = "";
        int count = 1;
        for (String s : notes){
            result += count + ". " + s + "\n";
        }
        return result;
    }

    public void removeNote(int idx){
        notes.remove(idx);
    }

    public void addNote(String note){
        notes.add(note);
    }

}