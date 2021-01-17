package items;

public class Spell extends Item{

    private SpellType spellType;

    public Spell(SpellType spellType) {
        this.spellType = spellType;
    }

    public SpellType getSpell() {
        return this.spellType;
    }

    public String getItemName() {
        return this.spellType.name();
    }

}
