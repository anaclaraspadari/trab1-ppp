public abstract class Personagem {
    protected Integer hp;
    protected Integer forca;
    protected Arma arma;
    protected AtaqueBehavior ataqueBehavior;

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public AtaqueBehavior getAtaqueBehavior() {
        return ataqueBehavior;
    }

    public void setAtaqueBehavior(AtaqueBehavior ataqueBehavior) {
        this.ataqueBehavior = ataqueBehavior;
    }

    @Override
    public String toString() {
        return "Personagem [hp=" + hp + ", forca=" + forca + ", arma=" + arma + ", ataqueBehavior=" + ataqueBehavior
                + "]";
    }

}
