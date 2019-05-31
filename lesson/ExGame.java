package jp.co.tafs.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExGame extends Game { //Gameクラスを継承する
	List<String> gamesoft = new ArrayList<String>();

	void inGame() {
		gamesoft.add("ダークソウル");
		gamesoft.add("ダークソウル2");
		gamesoft.add("ダークソウル3");
		gamesoft.add("フォートナイト");
		gamesoft.add("マインクラフト");

		for (String DLGame : gamesoft) { //拡張for文 (型 変数名 : 配列名)
			System.out.println(DLGame + "をインストールしました。");
		}
	}

	void ViewGame() {
		System.out.println("インストールしたゲームの一覧\n" + gamesoft);
	}

	void ChoiceGame() {
		Random r = new Random();
		System.out.println("今回は" + gamesoft.get(r.nextInt(5)) + "で遊びます。");
	}

	void outGame() {
		System.out.println(gamesoft.get(0) + "を削除しました。");
		gamesoft.remove(0);
	}
}
