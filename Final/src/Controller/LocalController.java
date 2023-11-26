/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Local;
import model.Obra;
import model.Personagem;
import model.Termo;

/**
 *
 * @author Samsung
 */
public class LocalController {

   

    private static final String FILE_PATH = "local.csv";
    public ArrayList<Local> locais = new ArrayList<>();
    public ObraController obraController = new ObraController();

    public LocalController() {
        carregarLocaisDoArquivo();
    }
    

    public void Removerlocal(String nome) {
        Local local = this.VerlocaisPorNome(nome);
        try {
            if (!locais.contains(local)) {
                throw new IllegalArgumentException("local não existe na coleção");
            }
            locais.remove(local);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public Local VerlocaisPorNome(String nome) {
        try {
            return locais.stream()
                    .filter(x -> x.getNome().equals(nome))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("local com nome: " + nome + " não encontrado!"));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Local> PegarTodoslocais() {
        try {
            if (locais.isEmpty()) {
                throw new IllegalArgumentException("Não há locais cadastradas no sistema!");
            }
            return new ArrayList<>(locais); 
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }

  

    public void AdicionarLocal(String nome, String descricao, Obra obra, String descricaoHistorica) {
        try {
            Local local = new Local(nome, descricao, obra, descricaoHistorica);

            if (locais.stream().anyMatch(x -> x.getNome().equals(nome))) {
                throw new IllegalArgumentException("Local com o mesmo nome já existe na coleção!");
            }

            locais.add(local);
            atualizarArquivo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private void carregarLocaisDoArquivo() {
        locais.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String nome = values[0];
                String descricao = values[1];
                String obraTitulo = values[2];
                String descricaoHistoria = values[3];
                Obra obra = obraController.VerObraPorTitulo(obraTitulo);
                Local local = new Local(nome, descricao, obra,descricaoHistoria); 
                locais.add(local);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void atualizarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Local local : this.locais) {
                String line = local.getNome() + "," + local.getDescricao() + "," + local.getObras().get(0).getTitulo()+","+ local.getDescricaoHistoria(); 
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
