public class HomeWork_6 {
    void main() {

        Weapon weapon = new Weapon();
        weapon.setWeapon("Claw");
        weapon.setType(WeaponType.HAND_TO_HAND_WEAPONS);
        Boss boss = new Boss();// Создаем как по условию задания, через дефолтный конструктор(т.к. не было сказано про создание конструктора,я и подумал сдеалть через дефолнтрый.
        boss.setHeal(700);
        boss.setDamage(50);
        boss.setWeaponBoss(weapon);
        Weapon bow = new Weapon();
        bow.setWeapon("Bow");
        bow.setType(WeaponType.LONG_RANGE);
        Skeleton skeleton = new Skeleton();// создаем скелетора.
        skeleton.setName("SkeletonOne");   // создал переменную String name для того что бы было красивее, было понятно какой из них кто, добавил сеттеры и геттеры. и в клас Skeleton и в класс Boss.
        skeleton.setHeal(400);
        skeleton.setDamage(35);
        skeleton.setWeaponBoss(bow);
        skeleton.setArrow(10);
        Skeleton skeleton2 = new Skeleton();// создаем второй экземпляр скелетона.
        skeleton2.setName("SkeletonTwo");
        skeleton2.setHeal(350);
        skeleton2.setDamage(35);
        skeleton2.setWeaponBoss(bow);
        skeleton2.setArrow(7);
        skeleton.printInfo();
        System.out.println("--------------------------");
        skeleton2.printInfo();
    }
}