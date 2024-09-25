public abstract class Armas {
    protected Integer dano;

    public abstract void ataca();

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

}
