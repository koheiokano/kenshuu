package jp.co.tafs.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExGame extends Game { //Gameクラスを継承する
	void inGame() {
		List<String> gamesoft = new ArrayList<String>();
		gamesoft.add("ダークソウル");
		gamesoft.add("ダークソウル2");
		gamesoft.add("ダークソウル3");
		gamesoft.add("フォートナイト");
		gamesoft.add("マインクラフト");

		for (String DLGame : gamesoft) { //拡張for文 (型 変数名 : 配列名)
			System.out.println(DLGame + "をインストールしました。");
		}

		System.out.println("インストール済み一覧\n" + gamesoft); //インストールしたものの一覧を表示
		Random r = new Random();
		System.out.println("今回は" + gamesoft.get(r.nextInt(5)) + "で遊びます。");
	}

	void outGame() {
		gamesoft = null; //ゲームソフトを取り出す
		System.out.println("ゲームソフトを取り出しました。");
	}

}
