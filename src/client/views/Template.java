package client.views;

public class Template {
    public static void header(String str) {
        System.out.println(str);
    }

    public static void menu() {
        System.out.println(
                """
                         Opções:\s
                        1 - Inserir
                        2 - Listar
                        3 - Remover
                        4 - Atualizar
                        5 - Sair
                        6 - Total cadastrados
                        7 - Busque por renavam
                        8 - Busque por placa"""
        );
    }

    public static void footer() {
        System.out.println("Volte sempre!");
    }
}