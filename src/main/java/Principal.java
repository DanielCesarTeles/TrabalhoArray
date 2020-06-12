import java.util.Scanner;

/**
 * @author Daiel Teles
 * @version 1.0
 * @since 06/06/2020 - 15:33
 * @category View
 */
public class Principal {
    public static void main(String[] args) {

        System.out.println("\f");

        Scanner scanner = new Scanner(System.in);
        BandaArray banda = new BandaArray();
        MembroDaBanda membroDaBanda = null;

        int opcao = 0;

        do{
            System.out.println("\n1-Cadastrar." +
                               "\n2-Ver Banda." +
                               "\n3-Deletar." +
                               "\n4-Filtar." +
                               "\n5-Ver quantidade." +
                               "\n6-Esvaziar." +
                               "\n7_Alterar. " +
                               "\n0-Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do musico: ");
                    String nome = scanner.next();
                    System.out.println("Digite o instrumento tocado pelo musico: ");
                    String instrumento = scanner.next();
                    System.out.println("Digite o tempo de banda: ");
                    int tempoDeBanda = scanner.nextInt();
                    System.out.println("Digite o tempo de instrumento: ");
                    int tempoDeInstrumento = scanner.nextInt();
                    System.out.println("Digite o salario inicial");
                    double salarioBase = scanner.nextDouble();

                    membroDaBanda = new MembroDaBanda(nome, instrumento, tempoDeBanda, tempoDeInstrumento,
                                        salarioBase);
                    banda.cadastrar(membroDaBanda);

                    System.out.println("Cadastro efetuado com sucesso");
                    break;
                case 2:
                    if(banda.verificarQuantidade() >=1) {
                        banda.buscar().forEach(System.out::println);

                    } else{
                    System.out.println("Nenhum membro na banda");
                }
                    break;
                case 3:
                    if(banda.verificarQuantidade() >=1) {
                        for(int indice = 0; indice < banda.verificarQuantidade(); indice++)

                            System.out.println(indice + ":" + banda.buscar());

                        System.out.println("Digite uma posição para excluir");
                        int index = scanner.nextInt();
                        banda.excluir(index);
                        System.out.println("Excluido com sucesso");
                    } else{
                    System.out.println("Nenhum membro na banda");
                }

                    break;
                case 4:

                    System.out.println("\n1-Filtrar por nome." +
                                       "\n2-Filtar  por tempo de banda ." +
                                       "\n3-Filtar por instrumento.");
                    System.out.println("Digite a opção desejada");
                    opcao = scanner.nextInt();

                    switch (opcao){
                        case 1:
                            membroDaBanda = new MembroDaBanda();
                            System.out.println("Digite o nome do musico: ");
                            membroDaBanda.setNome(scanner.next());

                            membroDaBanda = banda.filtrar(1, membroDaBanda);

                            System.out.println(membroDaBanda != null ? membroDaBanda : "Membro não encontrado");

                            break;
                        case 2:
                            membroDaBanda = new MembroDaBanda();
                            System.out.println("Digite o tempo de banda do musico: ");
                            membroDaBanda.setTempoDeBanda(scanner.nextInt());

                            membroDaBanda = banda.filtrar(2, membroDaBanda);

                            System.out.println(membroDaBanda != null ? membroDaBanda : "Membro não encontrado");
                            break;
                        case 3:
                            membroDaBanda = new MembroDaBanda();
                            System.out.println("Digite o instrumento do musico: ");
                            membroDaBanda.setInstrumento(scanner.next());

                            membroDaBanda = banda.filtrar(3, membroDaBanda);

                            System.out.println(membroDaBanda != null ? membroDaBanda : "Membro não encontrado");
                            break;
                        default:
                            break;
                    }

                    break;
                case 5:
                    System.out.println("Tem " + banda.verificarQuantidade() +" musicos na banda" );
                    break;
                case 6:
                    System.out.println("Banda zerada");
                    banda.apagrBanda();
                    break;
                case 7:
                    if(banda.verificarQuantidade() >=1) {
                        for(int indice = 0; indice < banda.verificarQuantidade(); indice++)

                            System.out.println(indice + ":" + banda.buscar());

                        System.out.println("Digite uma posição para alterar");
                        int index = scanner.nextInt();
                        banda.excluir(index);
                        System.out.println("Selecionado com sucesso com sucesso");

                        System.out.println("Digite o nome do novo musico: ");
                        String nome1 = scanner.next();
                        System.out.println("Digite o instrumento tocado pelo musico: ");
                        String instrumento1 = scanner.next();
                        System.out.println("Digite o tempo de banda: ");
                        int tempoDeBanda1 = scanner.nextInt();
                        System.out.println("Digite o tempo de instrumento: ");
                        int tempoDeInstrumento1 = scanner.nextInt();
                        System.out.println("Digite o salario inicial");
                        double salarioBase1 = scanner.nextDouble();

                        membroDaBanda = new MembroDaBanda(nome1, instrumento1, tempoDeBanda1,
                                tempoDeInstrumento1,
                                salarioBase1);
                        banda.cadastrar(membroDaBanda);

                        System.out.println("Alterado com sucesso");

                    } else{
                        System.out.println("Nenhum membro na banda");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;


            }

        }while(opcao!= 0);

    }
}
