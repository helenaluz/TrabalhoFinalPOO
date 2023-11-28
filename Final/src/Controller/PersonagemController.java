package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Obra;
import model.Personagem;


/**
 *
 * @author Samsung
 */
public class PersonagemController {
    
    private static final String FILE_PATH = "personagem.csv";
    public ArrayList<Personagem> personagens = new ArrayList<>();
    public ObraController obraController = new ObraController();

    public PersonagemController() {
        carregarpersonagensDoArquivo();
    }    

    public void Removerpersonagem(String nome) {
        Personagem personagem = this.VerpersonagensPorNome(nome);
        try {
            if (!personagens.contains(personagem)) {
                throw new IllegalArgumentException("personagem não existe na coleção");
            }
            personagens.remove(personagem);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public Personagem VerpersonagensPorNome(String nome) {
        try {
            return personagens.stream()
                    .filter(x -> x.getNome().equals(nome))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("personagem com nome: " + nome + " não encontrado!"));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Personagem> PegarTodospersonagens() {
        try {
            if (personagens.isEmpty()) {
                throw new IllegalArgumentException("Não há personagens cadastradas no sistema!");
            }
            return new ArrayList<>(personagens); 
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }

  

    public void Adicionarpersonagem(String nome, String descricao, Obra obra, String caracteristicas, String ator, String feitos) {
        try {
            Personagem personagem = new Personagem(nome, descricao, obra, caracteristicas, ator, feitos);

            if (personagens.stream().anyMatch(x -> x.getNome().equals(nome))) {
                throw new IllegalArgumentException("personagem com o mesmo nome já existe na coleção!");
            }

            personagens.add(personagem);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private void carregarpersonagensDoArquivo() {
        personagens.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String nome = values[0];
                String descricao = values[1];
                String obraTitulo = values[2];
                String caracteristicas = values[3];
                String ator = values[4];
                String feitos = values[5];
                Obra obra = obraController.VerObraPorTitulo(obraTitulo);
                Personagem personagem = new Personagem(nome, descricao, obra,caracteristicas, ator, feitos); 
                personagens.add(personagem);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void atualizarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Personagem personagem : this.personagens) {
                String line = personagem.getNome() + "," + personagem.getDescricao() + "," + personagem.getObras().get(0).getTitulo()+","+ personagem.getCaracteristicas()+","+personagem.getAtores()+","+personagem.getFeitos(); 
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}