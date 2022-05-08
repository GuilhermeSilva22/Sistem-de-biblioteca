package model;

import javax.swing.JOptionPane;

public class LivroModel {

    private Integer id;

    private String titulo;

    private Integer quantidade;

    private String estante;

    private String prateleira;

    public LivroModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.isEmpty() || titulo == null) {
            JOptionPane.showMessageDialog(null, "O campo Titulo não pode ser vazio e nem nulo!");
        } else {
            this.titulo = titulo;
        }
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        if (quantidade == null) {
            JOptionPane.showMessageDialog(null, "O campo quantidade não pode ser nulo!");
        } else if (quantidade == 0) {
            JOptionPane.showMessageDialog(null, "O campo quantidade não pode zero!");
        } else {
            this.quantidade = quantidade;
        }
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        if (estante == null) {
            JOptionPane.showMessageDialog(null, "O campo estante não pode ser nulo!!");
        } else if (estante.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo estante não pode ser vazio!!");
        } else if (estante.equals("0")) {
            JOptionPane.showMessageDialog(null, "O campo estante não pode ser zero!!");
        } else if (estante.contains(".") || estante.contains(",")) {
            JOptionPane.showMessageDialog(null, "O campo estante não pode ser decimal!!");
        } else {
            this.estante = estante;
        }
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        if (prateleira == null || prateleira.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo prateleira não pode ser nulo e nem vazio!");
        } else if (prateleira.contains(".") || prateleira.contains(",")) {
            JOptionPane.showMessageDialog(null, "O número da prateleira não pode ser decimal!");
        } else if (prateleira.equals("0")) {
            JOptionPane.showMessageDialog(null, "O campo prateleira não pode ser zero!");
        } else {
            this.prateleira = prateleira;
        }
    }
}
