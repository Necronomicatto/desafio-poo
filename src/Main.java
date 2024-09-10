import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devC = new Dev();
        devC.setNome("California");
        devC.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Cali:" + devC.getConteudosInscritos());
        devC.progredir();
        System.out.println("Conteudos inscritos Cali:" + devC.getConteudosInscritos());
        System.out.println("Conteudos concluidos Cali:" + devC.getConteudosConcluidos());
        System.out.println("XP: " + devC.calcularTotalXp());

        Dev devJ = new Dev();
        devJ.setNome("Case");
        devJ.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos case :" + devJ.getConteudosInscritos());
        devJ.progredir();
        System.out.println("Conteudos inscritos case :" + devJ.getConteudosInscritos());
        System.out.println("Conteudos Concludios case :" + devJ.getConteudosConcluidos());
        System.out.println("XP: " + devJ.calcularTotalXp());

    }
}
