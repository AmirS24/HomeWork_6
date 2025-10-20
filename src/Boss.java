public class Boss extends GameEntity {
    Weapon weaponBoss;
    private String name;
    public Weapon getWeaponBoss(){
return weaponBoss; }
    public void setWeaponBoss(Weapon weaponBoss){
   this.weaponBoss = weaponBoss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println(name +" Heal: " + getHeal());
        System.out.println(name +" Damage: "+  getDamage());
        System.out.println(name + " Weapon: " + getWeaponBoss().getWeapon() + " Weapon type: " + getWeaponBoss().getType());
    }
}
