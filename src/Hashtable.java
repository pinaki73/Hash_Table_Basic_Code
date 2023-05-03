import java.util.Map;

public class Hashtable {
    public static void main(String[] args) {
        java.util.Hashtable<Integer,String> player = new java.util.Hashtable<Integer,String>();
        player.put(18,"virat");
        player.put(45,"rohit");
        player.put(7,"dhoni");
        System.out.println(player);
        for (Map.Entry m: player.entrySet()
             ) {
            System.out.println("jersey no is"+m.getKey()+"player name is"+ m.getValue());

        }
    }
}
