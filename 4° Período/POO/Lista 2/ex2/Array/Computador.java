public class Computador {

    private int tamRAM;
    private int tamHD;
    private int numProcessadores;
    private String fabricante;
    public static int MaxRAM = 512;
    private boolean ligado;

    public Computador(int tamHD, int tamRAM, int numProcessadores, String Fabricante){
        this.tamHD = tamHD;
        this.tamRAM = tamRAM;
        this.numProcessadores = numProcessadores;
        this.fabricante = Fabricante;
        this.ligado = false;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public double getTamHD(){
        return tamHD;
    }

    public void setTamHD(double tamHD){
        if (tamHD <= 0)
            return;

        this.tamHD = tamHD;
    }

    public double getTamRAM(){
        return tamRAM;
    }

    public void setTamRAM(double tamRAM){
        if (tamRAM <= 0)
            return;

        this.tamRAM = tamRAM;
    }

    public int getNumProcessadores(){
        return numProcessadores;
    }

    public void setNumProcessadores(int numProcessadores){
        if (numProcessadores <= 0)
        return;
        this.numProcessadores = numProcessadores;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String Fabricante){
        this.fabricante = Fabricante;
    }

    public String toString(){
        return "Computador: Fabricante =" + fabricante + ", Num de Processadores =" + numProcessadores + ", Tamanho HD ="
        + tamHD + ", Tamanho Ram =" + tamRAM + ".";
    }

    public String estado(){
        if(ligado){
        return "Computador está ligado.";
        }else{
            return "Computador está desligado.";
        }
    }
}