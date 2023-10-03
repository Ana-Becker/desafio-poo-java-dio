package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }

    public Curso(int cargaHoraria, String titulo) {
        this.cargaHoraria = cargaHoraria;
        super.setTitulo(titulo);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
