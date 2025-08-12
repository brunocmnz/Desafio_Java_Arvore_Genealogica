package com.CE_TP;

public class Familia {

    private Pessoa[] pessoas;
    private int nPessoas = 0;

    public Familia() {
        this.pessoas = new Pessoa[20];
    }

    public boolean adicionaPessoa(Pessoa pessoa) {
        if (pessoa != null){
            this.pessoas[nPessoas] = pessoa;
            pessoa.setId(nPessoas);
            nPessoas++;
            return true;
        }
        return false;
    }

    public Pessoa removePessoa(Pessoa pessoa) {
        if (pessoa != null){
            Pessoa pessoaRemovida = pessoas[pessoa.getId()];
            return pessoaRemovida;
        }
        return null;
    }

    public Pessoa removePessoa(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                return removePessoa(pessoas[i]);
            }
        }
        return null;
    }

    public Pessoa getPessoa(String nome) {
        for (int i = 0; i < nPessoas; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                return pessoas[i];
            }
        }
        return null;
    }

    public String getNomeFamiliar(Pessoa pessoa, GrauFamiliar grauParentesco){
        if(pessoa == null){
            return "ERRO: Pessoa nula";
        }
        if(grauParentesco == null){
            return "ERRO: Grau parentesco nulo";
        }
        Pessoa pai = getPessoa(pessoa.getNomePai());
        Pessoa avo = getPessoa(pai.getNomePai());
        if (grauParentesco == GrauFamiliar.AVO){
            return "O avô de " + pessoa.getNome() + " é: " + avo.getNome();
        }else if (grauParentesco == GrauFamiliar.TATARAVO){
            Pessoa tataravo = getPessoa(avo.getNomePai());
            return "O tataravô de " + pessoa.getNome() + " é: " +tataravo.getNome();
        }
        return "ERRO no grau de parentesco";
    }

}
