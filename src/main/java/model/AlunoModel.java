package model;

import javax.swing.JOptionPane;

public class AlunoModel {

    private Integer id;

    private String nome;

    private String cpf;

    private String telefone;

    private String turno;

    private String turma;

    private String email;

    public AlunoModel() {
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
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo nome não pode ser vazio!!");
        } else {
            this.nome = nome;
        }
        this.nome = nome;
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
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo E-MAIL não pode ser vazio e nem nulo!");
        } else if (!email.contains("@") || email.contains(".com")) {
            JOptionPane.showMessageDialog(null, "O E-MAIL digitado é inválido, por favor digite novamente!");
        }
        this.email = email;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo TELEFONE não pode ser vazio e nem nulo!");
        } else if (telefone.length() != 11) {
            JOptionPane.showMessageDialog(null, "O campo TELEFONE deve conter 11 digitos, Por favor tente novamente");
        } else {
            this.cpf = cpf;
        }
        this.telefone = telefone;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno == null || turno.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo turno não pode ser vazio e nem nulo!");
        }
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        if (turma == null || turma.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo turma não pode ser vazio e nem nulo!");
        }
        this.turma = turma;
    }

}
