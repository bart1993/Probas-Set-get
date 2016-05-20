
/**
 * Created by bart on 15.05.16.
 */
public class AccountTest {
    public static void main(String[] args) {
        Account [] akki = new Account[2];
        int d = 0;

        while (d < 2){
            akki[d] = new Account();
            if (d == 0) {
                akki[d].setBalance(5214.25);
                akki[d].setName("Barton");
                akki[d].setAddress("632 hervate st");
                akki[d].display();
                akki[d].vizovPerevoda();
                akki[d].display();


            } else {
                akki[d].setBalance(635.52);
                akki[d].setName("Lumberg");
                akki[d].setAddress("412 kellys Rd");
                akki[d].display();
                akki[d].vizovPerevoda();
                akki[d].display();
            }
            d++;


        }


    }
}
