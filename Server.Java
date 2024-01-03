public class Server{

    private HashMap<String, Account> map;

    public Server(){
        this.map = new HashMap<String, Account>();
    }

    public boolean hasUsername(String un){
        return map.containsKey(un);
    }

    public boolean addAccount(String un, String pw){
        if (map.containsKey(un))
            return false;
        map.put(un, new Account(un, pw));
    }

    public boolean login(String un, String pw){
        Account acc = map.get(un);
    }

}