class Estudante {
    private matricula: string;
    private nome: string;
    private nota1: number;
    private nota2: number;



    constructor(matricula: string, nome: string, nota1: number, nota2: number) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }

    


    public calcularMedia(): number {
        return (this.nota01 + this.nota02) / 2;
    }

    


    public verificarSituacao(): string {
        const media = this.calcularMedia();
        if (media >= 6.0) {
            return "Aprovado(a)";
        } else {
            return "Reprovado(a)";
        }
    }

    public gerarBoletim(): void {
        console.log('Boletim: ${this.nome} (Matrícula: ${this.matricula})');
        console.log(`Notas: ${this.nota01} e ${this.nota02}`);
        console.log(`Média Final: ${this.calcularMedia().toFixed(1)}`);
        console.log(`Situação: ${this.verificarSituacao()}`);
    }
}




const alunoA = new Estudante("2026001", "Mariana Silva", 7.5, 8.0);
const alunoB = new Estudante("2026002", "João Pedro", 4.0, 5.5);

alunoA.gerarBoletim();
alunoB.gerarBoletim();
