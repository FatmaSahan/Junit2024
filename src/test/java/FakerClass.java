import com.github.javafaker.Faker;
import org.junit.Test;

public class FakerClass {
    @Test
    public void javaFakerTest(){
        Faker faker =new Faker();
      String firstName=  faker.name().firstName();
        System.out.println(firstName);

        String userName=faker.name().username();
        System.out.println(userName);

      String title=  faker.name().title();
        System.out.println(title);

       String city= faker.address().city();
        System.out.println(city);

        String satate=faker.address().state();
        System.out.println(satate);

      String fullAdress=  faker.address().fullAddress();
        System.out.println(fullAdress);

        String cellPhone=faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

       String email= faker.internet().emailAddress();
        System.out.println(email);

        //roundum digit number
        String roundumDigits=faker.number().digits(10);
        System.out.println(roundumDigits);
    }
}
