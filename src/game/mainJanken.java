package game;

public class mainJanken {
//じゃんけんゲーム
	public static void main(String[] args) {
		int plyerhand;
		int cphand;
		String[] hand = {"グー", "チョキ", "パー"};//手の種類
		boolean game = true;//勝敗 true勝ち
		
		System.out.println("じゃんけんゲームをはじめます。");
		
		while (true) {//あいこなら繰り返す
			System.out.print("出したい手を選んでください。(1：" + hand[0] + "2：" + hand[1] + "3：" + hand[2] + ")>>");
			plyerhand = new java.util.Scanner(System.in).nextInt() -1;//プレイヤーの手の入力
			cphand = new java.util.Random().nextInt(3);//CPランダム手
			
			if (plyerhand == 0 && cphand == 1) {
				game = true;
				break;
			}else if (plyerhand == 0 && cphand == 2) {
				game = false;
				break;
			}else if (plyerhand == 1 && cphand == 0){
				game = false;
				break;
			}else if (plyerhand == 1 && cphand == 2){
				game = true;
				break;
			}else if (plyerhand == 2 && cphand == 0){
				game = true;
				break;
			}else if (plyerhand == 2 && cphand == 1){
				game = false;
				break;
			}else {
				System.out.println("あいこです。もう一回！");
			}
			
		}//while終了 あいこ繰り返す
		
		System.out.println("あなた：" + hand[plyerhand] + "  わたし：" + hand[cphand]);//両者の手
		
		if (game) {//勝敗の結果
			System.out.println("あなたの勝ちです！");
		}else{
			System.out.println("あなたの負けです。");
		}		
		
	}

}
