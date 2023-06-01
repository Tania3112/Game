import java.util.Random;

public abstract class People {
 public  final String name;
public  int life;
public int number;


    Random rand = new Random();
    int max = 20, min = 1;
    int rand_num = rand.nextInt(max - min + 1) + min;


public People (String name, int life) {
    this.name = name;
    this.life = life;

}
    public abstract void attack();


}
