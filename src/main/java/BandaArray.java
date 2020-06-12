import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 06/06/2020 - 15:10
 * @category Model
 */
public class BandaArray implements BandaArrayInterface{

    List<MembroDaBanda> banda;

    public BandaArray() {
        banda = new ArrayList<>();
    }

    /**
     *
     * @param membroDaBanda
     */
    @Override
    public void cadastrar(MembroDaBanda membroDaBanda) {
        this.banda.add(membroDaBanda);
    }

    /**
     *
     */
    @Override
    public List<MembroDaBanda> buscar() {
        return this.banda;
    }

    /**
     *
     * @param
     */
    @Override
    public void excluir(int index) {
        this.banda.remove(index);
    }

    /**
     *
     * @param membroDaBanda
     */
    @Override
    public void alterar(int index, MembroDaBanda membroDaBanda) {
        this.banda.add(index, membroDaBanda);
    }

    /**
     *
     * @param membroDaBanda
     */
    @Override
    public MembroDaBanda filtrar(int filtro, MembroDaBanda membroDaBanda) {
        switch(filtro) {
            case 1: //Nome
                for(MembroDaBanda membroAuxiliar : this.banda){
                    if(membroAuxiliar.getNome().contains(membroDaBanda.getNome())){
                        return membroAuxiliar;
                    }
                }
                break;
            case 2: //Tempo de banda
                for(MembroDaBanda membroAuxiliar : this.banda) {
                    if (membroAuxiliar.getTempoDeBanda() == membroDaBanda.getTempoDeBanda()) {
                        return membroAuxiliar;
                    }
                }
                break;
            case 3: //Instrumento
                for(MembroDaBanda membroAuxiliar : this.banda){
                    if(membroAuxiliar.getInstrumento().contains(membroDaBanda.getInstrumento())){
                        return membroAuxiliar;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    /**
     *
     */
    @Override
    public int verificarQuantidade() {
        return this.banda.size();
    }

    /**
     *
     */
    @Override
    public void apagrBanda() {
        this.banda.clear();
    }

    @Override
    public void alterar(MembroDaBanda membroDaBanda, int index) {
        for(int indece =0; indece >= this.banda.size(); indece ++) {
            if(indece == index) {
                this.excluir(index);
                this.banda.add(index, membroDaBanda);
            } {

            }
        }
    }
}
