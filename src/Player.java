public class Player extends People {
    public Player(String name, int life) {
        super(name,life);
    }


    @Override
    public void attack() {
        number = rand.nextInt(max - min + 1) + min;
      if (number != rand_num) {
          System.out.println("Враг не угодал число!");
      }
    }}
