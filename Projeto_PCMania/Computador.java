package Projeto_PCMania;

public class Computador {
    SistemaOperacional sistemaOperacional;
    HardwareBasico hardwareBasico[] = new HardwareBasico[3];
    MemoriaUSB memoriaUSB;
    private String marca;
    private float preco;

    Computador(int preco, String marca){
        this.marca = marca;
        this.preco = preco;
    }
    
    public void addHardwareBasico(HardwareBasico hardware) {
        for (int i = 0; i < hardwareBasico.length; i++) {
            if (hardwareBasico[i] == null) {
                hardwareBasico[i] = hardware;
                break;
            }
        }
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }

    public void mostraPCConfigs(){  
        System.out.println("Marca: " + this.marca);
        System.out.println("Sistema operacional: " + sistemaOperacional.getNome() + " de " + sistemaOperacional.getTipo() + " bits");

        for (HardwareBasico hardwareBasico2 : hardwareBasico) {
            System.out.print(hardwareBasico2.getNome() + " ");
            System.out.printf("%.0f ", hardwareBasico2.getCapacidade()); 
        
            if (hardwareBasico2.getCapacidade() == 16 || hardwareBasico2.getCapacidade() == 32 || hardwareBasico2.getCapacidade() == 500 || hardwareBasico2.getCapacidade() == 8) {
                System.out.println("Gb");
            } else if (hardwareBasico2.getCapacidade() == 1 || hardwareBasico2.getCapacidade() == 2) {
                System.out.println("Tb");
            } else {
                System.out.println("Mhz");
            }
        }               
        
        System.out.printf("Preço: R$" + "%.2f ", this.preco); 
        System.out.println();
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

}