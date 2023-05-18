public enum tailleEnclos {

    P("Petit"),
    M("Môyen"),
    G("Grand");

    String msg;
    tailleEnclos(String taille) { this.msg = taille; }

    public String getMsg(){
        return msg;
    }
}
