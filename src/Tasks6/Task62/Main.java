package Tasks6.Task62;

/**
 * Created by pavlo.balyuk on 10/3/2017.
 */
public class Main {
    public static void main(String args[]){
        Email customEmail = new Email.Builder(1)
        .to("pavlo.balyuk@eleks.com")
        .cc("pavlo.balyuk@eleks.com")
        .subject("Test")
        .body("Body")
        .attachment(false)
        .build();
        System.out.println(customEmail);
    }
}
