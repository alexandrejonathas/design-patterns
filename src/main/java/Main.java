public class Main {
    public static void main(String[] args) {
        var brazilianFactory = new BrazilianFactoryImpl();
        var americanFactory = new AmericanFactoryImpl();

        var morgana = brazilianFactory.getPerson("Morgana");
        morgana.say("Olá Jonathas!");

        var jonathas = brazilianFactory.getPerson("Jonathas");
        jonathas.say("Oi Morgana!");

        var patrick = americanFactory.getPerson("Patrick");
        patrick.say("Hi Jonathas! How are you?");

        jonathas.say("Hi Patrick! I'm fine thanks!");
    }
}
