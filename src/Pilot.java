public class Pilot {

    private String kod;
    private String planeta;
    private int rokNarozeni;
    private String lod;
    private int pocetVytezstvi;

    public Pilot(String kod, String planeta, int rokNarozeni, String lod, int pocetVytezstvi) {
        this.kod = kod;
        this.planeta = planeta;
        this.rokNarozeni = rokNarozeni;
        this.lod = lod;
        this.pocetVytezstvi = pocetVytezstvi;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public void setRokNarozeni(int rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
    }

    public void setLod(String lod) {
        this.lod = lod;
    }

    public void setPocetVytezstvi(int pocetVytezstvi) {
        this.pocetVytezstvi = pocetVytezstvi;
    }

    public String getKod() {
        return kod;
    }

    public String getPlaneta() {
        return planeta;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }

    public String getLod() {
        return lod;
    }

    public int getPocetVytezstvi() {
        return pocetVytezstvi;
    }
    @Override
    public String toString() {
        return "Kód pilota: "+kod+", Planeta: "+planeta+", Rok narození: "+rokNarozeni+", Loď: "+lod+", Počet vítězství: "+pocetVytezstvi;
    }
}
