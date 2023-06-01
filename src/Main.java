import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Enemy enemy = new Enemy("Jack", 40);
        Player main = new Player("Tom",40);



while (enemy.life != 0 && main.life != 0) {
    enemy.attack();

    if (enemy.number == enemy.rand_num)
    {
        main.life = main.life-10;
        System.out.println("Вы угадали!  У " + main.name +" осталось " + main.life + "  жизней");

        enemy.rand_num = new Random().nextInt(enemy.max - enemy.min + 1) + enemy.min;
    }


    main.attack();

    if (main.number == main.rand_num)
    {
        enemy.life = enemy.life-10;
        System.out.println( main.name + " угадал! У вас осталось " + enemy.life + "  жизней" );
    }

}

if (enemy.life == 0){
    System.out.println("ВРАГ ВЫИГРАЛ");
}

else {
    System.out.println("ВЫ ВЫИГРАЛИ");


}
    }
}