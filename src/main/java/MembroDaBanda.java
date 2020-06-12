/**
 * @author Daniel
 * @version 1.0
 * @since 05/06/2020 - 01:35
 * @category Model
 *
 */
public class MembroDaBanda {

    private String nome;
    private String instrumento;
    private int tempoDeBanda;
    private int tempoDeInstrumento;
    private double salarioBase;

    public MembroDaBanda() {
    }

    /**
     *
     * @param nome
     * @param instrumento
     * @param tempoDeBanda
     * @param tempoDeInstrumento
     * @param salarioBase
     */
    public MembroDaBanda(String nome, String instrumento, int tempoDeBanda, int tempoDeInstrumento, double salarioBase) {
        this.nome = nome;
        this.instrumento = instrumento;
        this.tempoDeBanda = tempoDeBanda;
        this.tempoDeInstrumento = tempoDeInstrumento;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getTempoDeBanda() {
        return tempoDeBanda;
    }

    public void setTempoDeBanda(int tempoDeBanda) {
        this.tempoDeBanda = tempoDeBanda;
    }

    public int getTempoDeInstrumento() {
        return tempoDeInstrumento;
    }

    public void setTempoDeInstrumento(int tempoDeInstrumento) {
        this.tempoDeInstrumento = tempoDeInstrumento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     *
     * @return Retorna se o musico pode entrar na banda
     */
    public String verificarHabilidade() {
        if(this.tempoDeInstrumento <2) {
            return "Experiencia muito baixa para a banda";
        } {
            return "Aceito na banda";
        }
       
    }

    /**
     *
     * @return Retorna se o musico vai receber um bonus no salário, recebe se tiver 3 anos ou mais de instrumento
     *
     */
    public double calcularSalario() {
        if(this.tempoDeInstrumento >=3){
            this.salarioBase = this.salarioBase + this.salarioBase * this.tempoDeInstrumento /100;
            return salarioBase;
        } {
            return salarioBase;
        }
    }

    @Override
    public String toString() {
        return  "\nNome: '" + nome +
                "\nInstrumento tocado: '" + instrumento +
                "\nTempo de banda: " + tempoDeBanda +
                "\nTempo de instrumento :" + tempoDeInstrumento +
                "\nSalario : " + salarioBase;
    }
}
