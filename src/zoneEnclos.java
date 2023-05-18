public enum zoneEnclos {

    H("Herbivore"),
    C("Carnivore"),
    O("Omnivore");

    String msg;
    zoneEnclos(String zone) { this.msg = zone; }

    public String getMsg(){
        return msg;
    }
}
