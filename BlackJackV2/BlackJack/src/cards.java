public class  cards {


    String[] numbers = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
    String[] symbols = {"CLOVERS", "HEARTS", "SPADES", "DIAMONDS"};

    String randomNumbers = numbers[(int) Math.floor(Math.random() * numbers.length)];
    String randomSymbols = symbols[(int) Math.floor(Math.random() * symbols.length)];


     String cardGenerator = randomNumbers + " OF " + randomSymbols;



    public String getCardGenerator() {
        return cardGenerator;
    }

    public void setCardGenerator(String cardGenerator) {
        this.cardGenerator = cardGenerator;
    }

    public String toString() {
        return cardGenerator;
    }
}

