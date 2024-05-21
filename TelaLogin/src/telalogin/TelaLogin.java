package telalogin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;

/**
 * Classe TelaLogin fornece funcionalidades básicas de autenticação.
 */
public class TelaLogin {

    private Map<String, String> userDatabase;

    /**
     * Constrói uma nova instância de TelaLogin e inicializa o banco de dados de
     * usuários. Para fins de exemplo, pré-carrega o banco de dados com alguns
     * usuários de exemplo.
     */
    public TelaLogin() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Tenta autenticar um usuário com base em seu nome de usuário e senha.
     *
     * @param username O nome de usuário do usuário tentando fazer login.
     * @param password A senha inserida pelo usuário.
     * @return {@code true} se a autenticação for bem-sucedida, {@code false}
     * caso contrário.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            return storedPassword.equals(password);
        }
        return false;
    }

    /**
     * Adiciona um novo usuário ao banco de dados de usuários. Nota: Este método
     * não é recomendado para uso em um ambiente de produção devido à falta de
     * medidas de segurança adequadas.
     *
     * @param username O nome de usuário do novo usuário.
     * @param password A senha do novo usuário.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
