package respondeai;

public class App {
    public static void main(String[] args) throws Exception {

    User user = new User();

    user.name = "Anna";
    Adress userAdress = new Adress();
    userAdress.city = "Rio de Janeiro";
    userAdress.district = "Centro";
    userAdress.state = "Rio de Janeiro";
    userAdress.number = 30;
    userAdress.street = "Rua Brasília";
    user.setEmail("annajesus.nave@gmail.com");

    user.adress = userAdress;
    System.out.println(user.adress.city);
    System.out.println(user.getEmail());

    }
}
