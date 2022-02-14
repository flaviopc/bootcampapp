import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitulo("HTML 5");
        curso.setDescricao("Curso de desenvolvimento web");
        curso.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("CSS 3");
        curso2.setDescricao("Curso de desenvolvimento web");
        curso2.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria HTML");
        mentoria.setDescricao("descricao ");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp WEB DEV");
        bootcamp.setDescricao("Aprenda desenvolvimento web");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Vini");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("Inscritos: " + dev1.getConteudosInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Mayli");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("Inscritos: " + dev2.getConteudosInscritos());

        bootcamp.getDevsInscritos()
                .forEach((dev) -> System.out.println("Aluno: " + dev.getNome() + "| XP: " + dev.calcularTotalXp()));
    }
}
