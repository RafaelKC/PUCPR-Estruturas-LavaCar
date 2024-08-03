package System;

import java.util.Scanner;
import java.util.function.Function;

public class Menu {

    private void MainMenu() {
        System.out.println("------------------------------------");
        System.out.println("Ver Pedidos- - - - - - - - - - - (1)");
        System.out.println("Ver Clientes- - - - - - - - - - -(2)");
        System.out.println("Adicionar Itens- - - - - - - - - (3)");
        System.out.println("Sair- - - - - - - - - - - - - - -(4)");
        System.out.println("------------------------------------");


    }

    private void AdicionarMenu() {
        System.out.println("------------------------------------");
        System.out.println("Adicionar Pedido- - - - - - - - -(1)");
        System.out.println("Adicionar Serviço- - -  - - - - -(2)");
        System.out.println("Adicionar Carro- - - - - - - - - (3)");
        System.out.println("Adicionar Cliente- - - - - - - - (4)");
        System.out.println("Adicionar Empresa- - - - - - - - (5)");
        System.out.println("Adicionar Pessoa- - - - - - - - -(6)");
        System.out.println("Adicionar Funcionario- - - - - - (7)");
        System.out.println("Adicionar Marca- - - - - - - - -(10)");
        System.out.println("Principal- - - - - - - - - - - -(11)");
        System.out.println("------------------------------------");

        int op = GetOption(AdicionarMenu);
    }

    private int GetOption(Function<any, void> func) {
        int op;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Opção: ");
            op = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Valor inválido");
            func();
        }

        return op;
    }

    private void Sair() {
        System.exit(0);
    }
}
