package respondeai;

public class App {
    public static void main(String[] args) throws Exception {

    User user = new User();

    user.name = "Anna";
    user.adress.city = "Rio de Janeiro";
    user.adress.district = "Centro";
    user.adress.state = "Rio de Janeiro";
    user.adress.number = 30;
    user.adress.street = "Rua Brasília";
    user.setEmail("annajesus.nave@gmail.com");
    user.setPassword("novasenha123");
    User carol = new User();
    carol.name = "Carolina Braga";

    carol.adress.city = "Unaí";

    System.out.println(user.adress.city);

    System.out.println(user.getEmail());
    System.out.println(user.getPassword());
    System.out.println(user.name + ": " + user.adress.city);
    System.out.println(carol.name + ": " + carol.adress.city);

    }
}
