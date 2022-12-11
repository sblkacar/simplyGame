public abstract class GameChar {
   private int ıd;
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



    public GameChar(int ıd, int damage, int healty, int money,String name) {
        this.ıd = ıd;
        this.damage = damage;
        this.healty = healty;
        this.money = money;
        this.name=name;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

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
}
