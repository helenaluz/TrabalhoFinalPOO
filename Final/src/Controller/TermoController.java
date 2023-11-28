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

    private static final String FILE_PATH = "termos.csv";
    public static ArrayList<Termo> termos = new ArrayList<>();
    public ObraController obraController = new ObraController();

    public TermoController() {
        carregarTermosDoArquivo();
    }

    /**
     * Adiciona termo no arquivo
     * @param nome
     * @param descricao
     * @param obra
     */
    public void AdicionarTermo(String nome, String descricao, Obra obra) {
        try {
            Termo termo = new Termo(nome, descricao, obra);
            if (termos.stream().anyMatch(x -> x.getNome().equals(termo.getNome()))) throw new IllegalArgumentException("Termo com o mesmo nome já existe na coleção!");
            if (!obraController.obras.stream().anyMatch(x -> x.getTitulo().equals(obra.getTitulo()))) throw new IllegalArgumentException("Obra não existe na coleção!");
            termos.add(termo);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Remove o termo com tal nome no aquivo
     * @param nome
     */
    public void RemoverTermo(String nome) {
        Termo termo = this.VerTermosPorNome(nome);
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

    /**
     * Ver o termo com tal nome no arquivo
     * @param nome
     * @return termo
     */
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

    /**
     * Retorna os termos do aqruivo
     * @return Lista de termos
     */
    public ArrayList<Termo> PegarTodosTermos() {
        try {
            if (termos.isEmpty()) {
                throw new IllegalArgumentException("Não há termos cadastradas no sistema!");
            }
            return new ArrayList<>(termos); 
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }


    private void carregarTermosDoArquivo() {
        termos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String nome = values[0];
                String descricao = values[1];
                String obraTitulo = values[2];
                Obra obra = obraController.VerObraPorTitulo(obraTitulo);
                Termo termo = new Termo(nome, descricao, obra); 
                termos.add(termo);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void atualizarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Termo termo : this.termos) {
                String line = termo.getNome() + "," + termo.getDescricao() + "," + termo.getObras().get(0).getTitulo(); 
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
