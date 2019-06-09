package src.com.wzxdm.demo12;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);
        Weapon weapon = new Weapon("多兰剑");
        hero.setWeapon(weapon);
//        hero.setSkill(new SkillImpl());
        Skill skill2 = new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~");
            }
        };
        hero.setSkill(skill2);
        hero.attack();
    }
}
