package model;

import javax.swing.JOptionPane;

public class FuncionarioModel {

    private int id;

    private String nome;

    private String cpf;

    private String senha;

    public FuncionarioModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            JOptionPane.showMessageDialog(null, "O campo nome não pode ser nulo!!");
        } else if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo nome não pode ser vazio!!");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo CPF não pode ser vazio e nem nulo!");
        } else if (cpf.length() != 11) {
            JOptionPane.showMessageDialog(null, "O campo CPF deve conter 11 digitos, Por favor tente novamente");
        } else {
            this.cpf = cpf;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Senha não pode ser vazio e nem nulo!");
        } else if (senha.length() > 10) {
            JOptionPane.showMessageDialog(null, "O campo Senha não pode conter mais de 10 caracteres!");
        } else {
            this.senha = senha;
        }
    }
}
