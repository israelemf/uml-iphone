package iphone.model;

public class Iphone {
    AppsNativos apps;
    String versao;
    String modelo;

    public Iphone(String versao, String modelo) {
        this.versao = versao;
        this.modelo = modelo;
    }

    public void acessarApp(String app) {
        if ("ipod".equalsIgnoreCase(app)) {
            apps.acessarIpod();
        } else if ("telefone".equalsIgnoreCase(app)){
            apps.acessarChamadaTelefonica();
        } else if ("safari".equalsIgnoreCase(app)) {
            apps.acessarNavegador();
        }
    }
}
