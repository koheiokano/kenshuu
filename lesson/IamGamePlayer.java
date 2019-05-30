package jp.co.tafs.lesson;

public class IamGamePlayer {
	public static void main(String[] args) {

		String gamesoft; //型

		String gameMachine = new SuperGameMachine().getMachine(); //privateの中のものを呼び出す
		System.out.println(gameMachine);

		String gameMaker = new SuperGameMachine().getMaker();
		System.out.println(gameMaker);

		String gameNet = new SuperGameMachine().getNet();
		System.out.println(gameNet);

		String gameRelease = new SuperGameMachine().getRelease();
		System.out.println(gameRelease);

		int gamePrice = new SuperGameMachine().getPrice();
		System.out.println(gamePrice);

		System.out.println("\nゲームで遊びましょう！");

		boolean Power;
		Power = new Game().isPower();
		if (Power == false) {
			System.out.println("電源をONにしましょう。");
			new Game().onPower();
		} else {
			System.out.println("既に電源はONです。");
		}

		gamesoft = new Game().activeSoftCheck();//アクティブなゲームソフトを確認し、gamesoftに代入
		if (gamesoft == null) { //ゲームソフトが入ってない場合
			new Game().inGame(gamesoft); //ゲームソフトを入れるメソッドを呼び出す
		} else { //ゲームソフトが入っている場合
			System.out.println("既にゲームソフトが入っています。");
		}

		new Game().playGame(); //Gameクラスをインスタンス化してplayGameを呼び出す
		System.out.println("遊び終えました。");

		new Game().outGame(); //ゲームソフトを取り出す

		new Game().offPower(); //電源を切る
		//感想を出力
	}
}
