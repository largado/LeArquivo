import java.io.*;

public class GeraArquivoDesativacao {
    public static void main (String[] args) throws IOException {

        // arquivo de entrada - padrão de projeto java decorator

        FileInputStream arquivo = new FileInputStream("/Users/alex/Documents/workspace/ExemploDeIO/src/entrada");
        InputStreamReader leitor = new InputStreamReader(arquivo);
        BufferedReader leitorbuffer = new BufferedReader(leitor);

        String linha = leitorbuffer.readLine();

        while (linha != null){

            System.out.println(linha);
            linha = leitorbuffer.readLine();
        }





        leitorbuffer.close();



    }

}
