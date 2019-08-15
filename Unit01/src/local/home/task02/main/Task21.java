package local.home.task02.main;

/*
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В
зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */
public class Task21 {
	public static void main(String[] args) {

		char x = 'м';

		System.out.println("Кто ты: мальчик или девочка?");
		switch (x) {
		case 'д':
			System.out.println("Мне нравятся девочки!");
			break;
		case 'м':
			System.out.println("Мне нравятся мальчики!");

		}

	}

}
