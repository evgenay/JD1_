package local.home09task01.main;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		Sentence title = new Sentence();
		title.add(new Word("Сказка"));

		Sentence sent1 = new Sentence();

		sent1.add(new Word("Жили"));
		sent1.add(new Word("были"));
		sent1.add(new Word("у"));
		sent1.add(new Word("бабуси"));
		sent1.add(new Word("три"));
		sent1.add(new Word("веселых"));
		sent1.add(new Word("гуся"));

		Sentence sent2 = new Sentence();

		sent2.add(new Word("Один"));
		sent2.add(new Word("белый"));
		sent2.add(new Word("другой"));
		sent2.add(new Word("серый"));
		sent2.add(new Word("три"));
		sent2.add(new Word("веселых"));
		sent2.add(new Word("гуся"));

		Text text = new Text();

		text.addTitle(title);
		text.addText(sent1);
		text.addText(sent2);

		print(text.getTitle());
		System.out.println();
		print(text.getText());

	}

	public static void print(List<Sentence> text) {
		for (Sentence sen : text) {
			List<Word> wrd = sen.getSentence();

			for (Word w : wrd) {
				System.out.print(w.getWord());
			}
			System.out.print(".");
		}
	}

}
