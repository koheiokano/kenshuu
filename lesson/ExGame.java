package jp.co.tafs.lesson;

import java.util.ArrayList;
import java.util.List;

public class ExGame extends Game { //Gameクラスを継承する
	void inGame() {
		List<String> gamesoft = new ArrayList<>();
		gamesoft.add("ダークソウル");
		gamesoft.add("ダークソウル2");
		gamesoft.add("ダークソウル3");
		gamesoft.add("フォートナイト");
		gamesoft.add("マインクラフト");

		for (String DLGame : gamesoft) { //拡張for文 (型 変数名 : 配列名)
			System.out.println(DLGame + "をインストールしました。");
		}

		//インストールしたものを表示
		//ランダムとか
	}

	void outGame() {
		gamesoft = null; //ゲームソフトを取り出す
		System.out.println("ゲームソフトを取り出しました。");
	}

}
