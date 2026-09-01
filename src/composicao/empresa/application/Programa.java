package composicao.empresa.application;

import composicao.empresa.entities.ContratoHora;
import composicao.empresa.entities.Departamento;
import composicao.empresa.entities.NivelTrabalho;
import composicao.empresa.entities.Trabalhador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Entre o nome do departamento: ");
        String departmentName = sc.nextLine();

        Departamento dept = new Departamento(departmentName);

        System.out.println("Entre os dados do trabalhador:");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nivel: ");
        NivelTrabalho workerLevel = NivelTrabalho.valueOf(sc.nextLine());
        System.out.print("Salario base: ");
        double baseSalary = sc.nextDouble();

        Trabalhador worker = new Trabalhador(workerName, workerLevel, baseSalary, dept);

        System.out.print("Quantos contratos esse trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao (horas): ");
            int hours = sc.nextInt();

            ContratoHora contract = new ContratoHora(contractDate, valuePerHour, hours);
            worker.addContrato(contract);
        }

        System.out.println();
        System.out.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getNome());
        System.out.println("Departamento: " + worker.getDepartamento().getNome());
        System.out.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", worker.renda(year, month)));

        sc.close();
    }
}