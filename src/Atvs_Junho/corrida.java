class Produto {
    private nome: string;
    private preco: number;
    private quantidadeEstoque: number;


    constructor(nome: string, preco: number, quantidadeEstoque: number) {
        this.nome = nome;
        this.preco = preco >= 0 ? preco : 0;
        this.quantidadeEstoque = quantidadeEstoque >= 0 ? quantidadeEstoque : 0;
    }


    public exibirDetalhes(): void {
        console.log(`Produto: ${this.nome} | Preço: R$ ${this.preco.toFixed(2)} | Estoque: ${this.quantidadeEstoque} un.`);
    }

    public calcTotalEst(): number {
        return this.preco * this.quantidadeEstoque;
    }
}

const prod01 = new Produto("Teclado Mecânico", 250.00, 15);
const prod02 = new Produto("Mouse Gamer", 120.00, 30);

prod01.exibirDetalhes();
console.log(`Valor total em estoque (${prod01.getNome?.() || 'Produto'}): R$ ${prod01.calcTotalEst().toFixed(2)}');

prod02.exibirDetalhes();
console.log(`Valor total em estoque: R$ ${prod02.calcTotalEst().toFixed(2)}`);
