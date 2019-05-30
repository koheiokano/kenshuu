package jp.co.tafs.lesson;

public class Game { //Gameというクラスの作成

	String gamesoft;

	public void playGame() { //playGameというメソッドを作成
		System.out.println("ゲームで遊んでいます。"); //playGameの中身
	}

	//メソッド追加
	void onPower() {
		String Power = "on"; //電源をONにする
		System.out.println("電源をONにしました。");
	}

	void offPower() {
		String Power = "off"; //電源をOFFにする
		System.out.println("電源をOFFにしました。");
	}

	void inGame(String gamesoft) { //gamesoftの引数をStringで指定
		gamesoft = "ダークソウル";
		System.out.println(gamesoft + "が挿入されました。"); //ゲームソフトを入れる
	}

	void outGame() {
		gamesoft = null; //ゲームソフトを取り出す
		System.out.println("ゲームソフトを取り出しました。");
	}

	public boolean isPower() {
		return false;//電源のオンオフのチェック
	}

	public String activeSoftCheck() {
		String str = null; //アクティブなゲームソフト名を返す
		return str;
	}

	void Impression() {
		System.out.println("感想を入力してください。");
	}
}

class SuperGameMachine { //SuperGameMachineというクラス（ゲーム機クラス）の作成（publicは1ソースファイルに一つだけ）
	//↓属性の追加
	private String gameMachine = "PS4"; //ゲーム機の名前
	private String gameMaker = "SONY"; //メーカーの名前
	private String gameNet = "有り"; //ネット接続環境有無
	private String gameRelease = "2013/11/15"; //発売日
	private int gamePrice = 41979; //価格

	public String getMachine() {
		return gameMachine;
	}

	public String getMaker() {
		return gameMaker;
	}

	public String getNet() {
		return gameNet;
	}

	public String getRelease() {
		return gameRelease;
	}

	public int getPrice() {
		return gamePrice;
	}

}
