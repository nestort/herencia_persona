package varios;


public class Alimentorapido {
private String pan;
private String lechuga;
private int quesoamarillo;
private byte quesoblanco;
private byte tomate;
private int tocino=0;
private String carne="";
private boolean pepinillo;
private boolean mayonesa;
private char chile;


  public Alimentorapido() {
      
    }

  public Alimentorapido() {
      
    }



    public Alimentorapido(String pan, String lechuga, byte quesoblanco, byte tomate, int tocino, String carne) {
        this.pan = pan;
        this.lechuga = lechuga;
        this.quesoblanco = quesoblanco;
        this.tomate = tomate;
        this.tocino = tocino;
        this.carne = carne;
    }

public String getPan(){
        return pan;
    
}    

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getLechuga() {
        return lechuga;
    }

    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }

    public int getQuesoamarillo() {
        return quesoamarillo;
    }

    public void setQuesoamarillo(int quesoamarillo) {
        this.quesoamarillo = quesoamarillo;
    }

    public byte getQuesoblanco() {
        return quesoblanco;
    }

    public void setQuesoblanco(byte quesoblanco) {
        this.quesoblanco = quesoblanco;
    }

    public byte getTomate() {
        return tomate;
    }

    public void setTomate(byte tomate) {
        this.tomate = tomate;
    }

    public boolean isPepinillo() {
        return pepinillo;
    }

    public void setPepinillo(boolean pepinillo) {
        this.pepinillo = pepinillo;
    }

    public boolean isMayonesa() {
        return mayonesa;
    }

//constructor
    public void setMayonesa(boolean mayonesa) {
        this.mayonesa = mayonesa;
    }

    //metodo getter y setter
    public void preparar() {
    }
public void calentar(){
    
}    
public void servir(){
    
}    
public void envolver(){
    
}    

}