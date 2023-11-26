package Controller;

import Controller.ObraController;
import java.io.*;
import java.util.ArrayList;
import model.Local;
import model.Obra;
import model.Personagem;
import model.Termo;

/**
 * Controlador de Obra, lida com adições, consultas, deletações e arquivco
 * 
 * 
 * @author Samsung
 */
public class TermoController {

    private static final String FILE_PATH = "temos.dat";
    public ArrayList<Termo> termos = new ArrayList<>();
    public ObraController obraController = new ObraController();

    public TermoController() {
        carregarTermosDoArquivo();
    }

  
    
    public void AdicionarTermo(String nome, String descricao, Obra obra) {
        try {
            Termo termo = new Termo(nome, descricao, obra);

            if (termos.stream().anyMatch(x -> x.getNome().equals(termo.getNome()))) {
                throw new IllegalArgumentException("Termo com o mesmo nome já existe na coleção!");
            }

            if (!obraController.obras.stream().anyMatch(x -> x.getTitulo().equals(obra.getTitulo()))) {
                throw new IllegalArgumentException("Obra não existe na coleção!");
            }

            termos.add(termo);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public void RemoverTermo(Termo termo) {
        try {
            if (!termos.contains(termo)) {
                throw new IllegalArgumentException("Termo não existe na coleção");
            }
            termos.remove(termo);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public Termo VerTermosPorNome(String nome) {
        try {
            return termos.stream()
                    .filter(x -> x.getNome().equals(nome))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Termo com nome: " + nome + " não encontrado!"));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Termo> PegarTodosTermos() {
        try {
            if (termos.isEmpty()) {
                throw new IllegalArgumentException("Não há termos cadastradas no sistema!");
            }
            return new ArrayList<>(termos); // Return a copy of the list to avoid external modifications
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public void AdicionarPersonagem(String nome, String descricao, Obra obra, String caracteristicas, String ator, String feitos) {
        try {
            Personagem personagem = new Personagem(nome, descricao, obra, caracteristicas, ator, feitos);

            if (termos.stream().anyMatch(x -> x.getNome().equals(nome))) {
                throw new IllegalArgumentException("Personagem com o mesmo nome já existe na coleção!");
            }

            termos.add(personagem);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public void AdicionarLocal(String nome, String descricao, Obra obra, String descricaoHistorica) {
        try {
            Local local = new Local(nome, descricao, obra, descricaoHistorica);

            if (termos.stream().anyMatch(x -> x.getNome().equals(nome))) {
                throw new IllegalArgumentException("Local com o mesmo nome já existe na coleção!");
            }

            termos.add(local);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private void carregarTermosDoArquivo() {
        termos.clear();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            termos.addAll((ArrayList<Termo>) inputStream.readObject());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private void atualizarArquivo() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            outputStream.writeObject(termos);
        } catch (Exception e) {
            System.err.println(e.getMessage()+"oi");
        }
    }
}
