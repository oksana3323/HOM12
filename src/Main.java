public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        country.setCountry("kYRGYZSTAN");

        Country country1 = new Country();
        country1.setCountry("USA");

        Country country2 = new Country();
        country2.setCountry("ROSSIA");
        System.out.println();
        Country[] countries = new Country[]{country, country1, country2};
        for (Country country3 : countries) {
            System.out.println(country3.getCountry());

        }

        City city = new City();
        city.setCity("Bishkek");

        City city1 = new City();
        city1.setCity("Los angeles");

        City city2 = new City();
        city2.setCity("Moscow");
        City[] cities = new City[]{city, city1, city2};
        for (City city3 : cities) {
            System.out.println(city3.getCity());
        }

        Adress adress = new Adress();
        adress.setAdress("Tunguch 67/3 kv60");

        Adress adress1 = new Adress();
        adress1.setAdress("Monica BIvd Art 202,CA 900067");

        Adress adress2 = new Adress();
        adress2.setAdress("Lermentova 65/2 kv 18");

        Adress[] adresses = {adress, adress1, adress2};
        for (int i = 0; i < adresses.length; i++) {
            System.out.println(adresses[i].getAdress());
        }

        Person person = new Person();
        person.setFirstName("Azamat");
        person.setLastName("Nurbekov");
        person.setAge(25);
        person.setGender("M");
        person.setProfession("programmer");


        Person person1 = new Person();
        person1.setFirstName("Joe");
        person1.setLastName("Dispenza");
        person1.setAge(50);
        person1.setGender("M");
        person1.setProfession("Doctor");


        Person person2 = new Person();
        person2.setFirstName("Andrei");
        person2.setLastName("Malaxov");
        person2.setAge(45);
        person2.setGender("M");
        person2.setProfession("TV journalist");


        Person[] people = {person, person1, person2};
        for (Person a : people) {


            System.out.println(a.getFirstName() + " " + a.getLastName() + " " + a.getAge() + " " + a.getGender() + "" +
                    a.getProfession() + " ");
        }
    }
}


           /* System.out.println("1)");
            System.out.println(" " + " The country lives: " + country.getCountry()+ "\n" + "City :" + city.getCity() + "\n" + " adress : " + adress.getAdress() +

                    "\n" + " Name: " + person.getFirstName() + "\n" + "Last Name: " + person.getLastName() + "\n" +
                    " Age: " + person.getAge() + "\n" + "Gender: " + person.getGender() + "\n" + "profession :"
                    + person.getProfession());

            System.out.println("\n\n\n" + "2)");


            System.out.println(" " + " The country lives: " + country1.getCountry() + "\n" + "City :" + city1.getCity() + "\n" + " adress : " + adress1.getAdress() +

                    "\n" + " Name: " + person1.getFirstName() + "\n" + "Last Name: " + person1.getLastName() + "\n" +
                    " Age: " + person1.getAge() + "\n" + "Gender: " + person1.getGender() + "\n" + "profession :"
                    + person1.getProfession());

            System.out.println("\n\n\n3)");
            System.out.println(" " + " The country lives: " + country2.getCountry() + "\n" + "City :" + city2.getCity() + "\n" + " adress : " + adress2.getAdress() +

                    "\n" + " Name: " + person2.getFirstName() + "\n" + "Last Name: " + person2.getLastName() + "\n" +
                    " Age: " + person2.getAge() + "\n" + "Gender: " + person2.getGender() + "\n" + "profession :"
                    + person2.getProfession());*/







