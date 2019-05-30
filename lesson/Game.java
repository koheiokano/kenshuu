package jp.co.tafs.lesson; //パッケージの指定

public class Game { //Gameというクラスの作成
	//↓属性
	private String gameMachineName = "PS4"; //ゲーム機の名前
	private String gameMaker = "SONY"; //メーカーの名前
	private boolean gameNet = true; //ネット接続環境有無（有はtrue、無はfalse)
	private String gameRelease = "2013/11/15"; //発売日 Dateを使いたい
	private int gamePrice = 41979; //価格

	//メソッド作成
	public String getMachineName() {
		return gameMachineName; //gameMachineNameをgetMachineNameメソッドに
	}

	public String getMaker() {
		return gameMaker; //gameMakerをgetMakerメソッドに
	}

	public boolean getNet() {
		return gameNet; //gameNetをgetNetメソッドに
	}

	public String getRelease() {
		return gameRelease; //gameReleaseをgetReleaseメソッドに
	}

	public int getPrice() {
		return gamePrice; //gamePriceをgetPriceメソッドに
	}

	String gamesoft;

	public void playGame() { //playGameというメソッドを作成
		System.out.println("ゲームで遊んでいます。"); //playGameの中身
	}

	void onPower() {
		String Power = "on"; //電源をONにする
		System.out.println("電源をONにしました。");
	}

	void offPower() {
		String Power = "off"; //電源をOFFにする
		System.out.println("電源をOFFにしました。");
	}

	void inGame(String gamesoft) { //gamesoftの引数をStringで指定
		gamesoft = "デモンズソウル";
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
		System.out.println("感想:難しい");
	}
}
