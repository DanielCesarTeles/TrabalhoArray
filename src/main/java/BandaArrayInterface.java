import java.util.List;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 06/06/2020 - 15:02
 * @caegory interface
 */
public interface BandaArrayInterface {

    public void cadastrar(MembroDaBanda membroDaBanda);
    public List<MembroDaBanda> buscar();
    public void excluir(int index);
    public void alterar(int index, MembroDaBanda membroDaBanda);
    public MembroDaBanda filtrar (int filtro, MembroDaBanda membroDaBanda);
    public int verificarQuantidade();
    public void apagrBanda();
    public void alterar(MembroDaBanda membroDaBanda, int indece);
}
