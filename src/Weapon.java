public class Weapon {
    private String weapon;
    private WeaponType type;

    public WeaponType getType(){
        return type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weaponName) {
        this.weapon = weaponName;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }
}
