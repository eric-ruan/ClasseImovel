public class Principal {
    public static void main(String[] args) {
        Imovel i = new Imovel();
        Novo n = new Novo();
        Velho v = new Velho();

        i.setEndereco("Rua Barry Allen, 22 - Centro - Central City");
        i.setPreco(500000);
        n.setPrecoAdicional(i.getPreco() + 100000);
        v.setPrecoVelho(i.getPreco() - 10000);

        System.out.println("Endereço do imovel: " + i.getEndereco());
        System.out.println("Preço do imovel: " + i.getPreco());
        System.out.println("Preço adicional do imovel: " + n.getPrecoAdicional());
        System.out.println("Preço antigo do imovel: " + v.getPrecoVelho());
    }
}
