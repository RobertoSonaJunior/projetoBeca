import java.util.Scanner;

public class Sis1 {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		{
			logica();
			Scanner ler = new Scanner(System.in);
			System.out.println("+-----------------------+\n" + "| Vc quer qual o sabor?\n" + "| 1. Mussarela\n"
					+ "| 2. Calabresa\n" + "| 3. Frango Catupiry\n" + "| 4. Voltar ao início" + "| \n" + "| 0 - Sair\n"
					+ "+-----------------------+");
			int num = ler.nextInt();

			switch (num) {
			case 1:
				System.out.println("Mussarela | R$ 35,00");
				pagar();
				pagoComSucesso();
				break;
			case 2:
				System.out.println("De calabresa | R$ 33,00");
				pagar();
				pagoComSucesso();
				break;
			case 3:
				System.out.println("De frango | R$ 38,00");
				pagar();
				pagoComSucesso();
				break;
			case 4:
				menu();
				break;
			case 0:
				sair();
			default:
				System.out.println("Não temos esta pizza.");
				num = 0;
			}
		}
	}
	
	public static void sair() {
		System.out.println("****** FIM DA PIZZARIA JR! ON-LINE ******");
		System.exit(0);
	}
	
	public static void pagoComSucesso() {
		System.out.println("Pago com sucesso!");
		System.out.println("****** FIM DA PIZZARIA JR! ON-LINE ******");
		System.exit(0);
	}

	public static boolean logica() {
		Scanner in = new Scanner(System.in);
		System.out.println("+-------------------------+");
		System.out.println("| Bem-vindo a Pizzaria Jr!");
		System.out.println("| Informe o seu login: ");
		String login = in.nextLine();
		System.out.println("| Informe à sua senha: ");
		String senha = in.nextLine();

		if (login.equals("rob") && senha.equals("123")) {
			System.out.printf("| Usuário ' %s ' logado com sucesso.\n", login);
			System.out.printf("---------------------");

			return true;
		} else {
			System.out.println("| Login ou senha inválidos!");
			return false;
		}
	}
	public static void pagar() {
		System.out.println("Por favor, insira o cartão.");
		Scanner ler = new Scanner(System.in);
		int cartao = ler.nextInt();

	}
}
