package provapoo2;



public class pessoa {

public String nome;

public String sobrenome;

public int idade;

public pessoa() {



}

public pessoa(String nome, String sobrenome, int idade) {

this.nome = nome;

this.sobrenome = sobrenome;

this.idade = idade;

}



public pessoa(String nome, String sobrenome) {

super();

this.nome = nome;

this.sobrenome = sobrenome;

}

public String nomeCompleto() {

return this.nome + " " + this.sobrenome;

}



public pessoa(String nome) {

this.nome = nome;

}

public void exibeInfo() {

System.out.println("Nome......:" + this.nome);

System.out.println("Sobrenome.:" + this.sobrenome);

System.out.println("Sobrenome.:" + this.idade);

}

}

package provapoo2;



public class funcionario extends pessoa {

public String dataAdmissao;

public String matricula;

public funcionario(String nome, String sobrenome, int idade, String dataAdmissao, String matricula) {

super(nome, sobrenome, idade);

this.dataAdmissao = dataAdmissao;

this.matricula = matricula;

}

public funcionario(String nome, String sobrenome, String dataAdmissao, String matricula) {

super(nome, sobrenome);

this.dataAdmissao = dataAdmissao;

this.matricula = matricula;

}

public funcionario(String nome, String dataAdmissao, String matricula) {

super(nome);

this.dataAdmissao = dataAdmissao;

this.matricula = matricula;

}

@Override

public void exibeInfo() {

System.out.println("Dados de Funcionario: " + super.nomeCompleto());

super.exibeInfo();

System.out.println("Data de admissao:...:" + this.dataAdmissao);

System.out.println("Matricula...........:" + this.matricula);

}





}

package provapoo2;



public class medico extends funcionario {

public String crm;

public medico(String nome, String sobrenome, int idade, String dataAdmissao, String matricula, String crm) {

super(nome, sobrenome, idade, dataAdmissao, matricula);

this.crm = crm;

}

@Override

public void exibeInfo() {

// TODO Auto-generated method stub

super.exibeInfo();

System.out.println("CRM......: " + this.crm);

}





}

package provapoo2;



public class paciente extends pessoa{

protected String dataInternacao;



public paciente(String nome, String sobrenome, int idade, String dataInternacao) {

super(nome, sobrenome, idade);

this.dataInternacao = dataInternacao;

}



public paciente(String nome, String sobrenome, String dataInternacao) {

super(nome, sobrenome);

this.dataInternacao = dataInternacao;

}



public paciente(String dataInternacao) {

super();

this.dataInternacao = dataInternacao;

}



public paciente() {

}



@Override

public void exibeInfo() {

System.out.println("Dados de: " + super.nomeCompleto());

super.exibeInfo();

System.out.println("Data da Internação...:" + this.dataInternacao);

}



 

}

package provapoo2;



public class testapaciente {



public static void main(String[] args) {

paciente p1 = new paciente("john", "Snow", 34, "11/11/2022");

p1.exibeInfo();



pessoa p2 = new paciente("Daenerys", "Targaryen", 28, "11/11/2022");

System.out.println("");

p2.exibeInfo();



funcionario f1 = new funcionario("John","textor", "11/11/2022","A2022");

System.out.println("");

f1.exibeInfo();



funcionario m1 = new medico("drouseo" , "variola", 72, "11/11/2022", "A24513", "00a121");

System.out.println();

m1.exibeInfo();

}





}
