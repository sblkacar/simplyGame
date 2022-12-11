import java.util.Scanner;

public class Game {
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int damage;
    private int healty;
    private int money;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Scanner input=new Scanner(System.in);


    public void start()
    {
        System.out.println("Mecaraya Hazır mısınız?");
        System.out.print("Lütfen Bir isim Giriniz ");
        String playerName=input.nextLine();
        player Player=new player(playerName);
        System.out.println("Sayın "+Player.getName()+" Bu Sisli Dünyaya Hoşgeldiniz! Burada yaşanaların tamamı gerçek! ");

        GameChar[] gamelist= {new Samurai(),new Knight(),new Archer()};
        System.out.println("Karakterler ");
        System.out.println("-----------------------------");
        for (GameChar gameChar: gamelist)
        {System.out.println("\t \tKarakter : "+gameChar.getName()+
                "\t \tID:"+ gameChar.getId()+
        "\t \t Hasar : "+gameChar.getDamage()
        +"\t \tSağlık : "+gameChar.getHealty()
        +"\t \tPara : "+gameChar.getMoney());
        }
        System.out.println("-----------------------------");
        System.out.println("Lütfen Bir Karakter ID seçiniz ");
        int CharSelectId=input.nextInt();
        switch (CharSelectId)
        {
            case 1:
                initset(new Samurai());
                break;
            case 2:
                initset(new Archer());
                break;
            case 3:
                initset(new Knight());
                break;
            default:
                System.out.println("-----------------------------------------------------------");
                System.out.println("Uygun seçim yapmadığınız için seçimi sizin yerinize biz yaptık.");
                System.out.println("-----------------------------------------------------------");
                initset(new Samurai());
                break;

        }
        System.out.println("Seçtiğiniz Karakter :");
        System.out.println("--------------------------");
        System.out.println("\t \tKarakter : "+this.getName()+

                "\t \t Hasar : "+this.getDamage()
                +"\t \tSağlık : "+this.getHealty()
                +"\t \tPara : "+this.getMoney());
        System.out.println("--------------------------");
    }
        public void initset(GameChar gameChar)
        {
            this.setName(gameChar.getName());
            this.setDamage(gameChar.getDamage());
            this.setHealty(gameChar.getHealty());
            this.setMoney(gameChar.getMoney());
        }
    }

