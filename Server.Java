public class Server{

    private HashMap<String, Account> map;
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] encodedhash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));

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
        String hashedPw = GenerateHash.toHexString(getSHA(pw));
        if (hashedPw == acc.getPassHash()){
            return true;
        }
    }
}