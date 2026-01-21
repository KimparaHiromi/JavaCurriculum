package curriculum.d;

/**********************************************************************************
* [概要] 課題 7.25 「プログラム作成２」の課題にて使用する「『キャラクター』クラス」
* （抽象クラス/「Player」や「Daemon」の親となるクラス）
* [詳細] 
* ① インターフェース「Participant」の適用
* ② プロテクテッド変数：「名前（String name）」、「体力/HP（int hp）」、「攻撃力/AT（int at）」、「素早さ/ST（int sp）」を所持
* ③ コンストラクタ：「名前/name」、「体力/hp」、「攻撃力/at」、「素早さ/sp」を初期設定
* ④ メソッド：「getter」→ 名前/name、体力/hp、素早さ/sp を取得する 
* ⑤ メソッド：「setter」→ 体力/hp をセットする 
* ⑥ メソッド：「生存確認（boolean isAlive）」→ hp が 0 以上なら true を返す
* ⑦ メソッド：「攻撃（void attack）」→ 相手の receiveDamage を呼び出す
* ⑧ メソッド：「ダメージ（void receiveDamage）」→ 自身の hp を damage の数値分減らし、残り体力/HPを表示する
**********************************************************************************/

public abstract  class Character { // ①

	/*-------------------------------------------------------------------------
	[概要]② プロテクテッド変数：「名前（String name）」、「体力/HP（int hp）」、「攻撃力/AT（int at）」、「素早さ/ST（int sp）」を所持
	-------------------------------------------------------------------------*/
	protected String name; 
	protected int hp; 
	protected int at; 
	protected int sp; 
	
	/*-------------------------------------------------------------------------
	[概要]③ コンストラクタ：「名前/name」、「体力/hp」、「攻撃力/at」、「素早さ/sp」を初期設定
	-------------------------------------------------------------------------*/
	public Character(String name,int hp,int at,int sp) { 
	 this.name = name; 
	 this.hp = hp; 
	 this.at = at; 
	 this.sp = sp; 
	} 
	
	/*-------------------------------------------------------------------------
	[概要]④ メソッド：「getter」→ 名前/name、体力/hp、攻撃力/at、素早さ/sp
	-------------------------------------------------------------------------*/
	public String getName() { 
	 return name; 
	} 
	
	public int getHp() { 
	 return hp; 
	} 
	
	public int getAt() { 
	 return at; 
	} 
	
    public int getSp() { 
     return sp; 
    } 
    
    /*-------------------------------------------------------------------------
	[概要]⑤ メソッド：「setter」→ 体力/hp 
	-------------------------------------------------------------------------*/
    public void setHp(int hp) { 
     this.hp = hp; 
     if (this.hp < 0) this.hp = 0; 
    } 
    
    /*-------------------------------------------------------------------------
	[概要]⑥ メソッド：「生存確認（boolean isAlive）」※ hp が 0 以上なら true を返す
	-------------------------------------------------------------------------*/
	public boolean isAlive() { 
	 return this.hp > 0; 
	} 
    
    /*-------------------------------------------------------------------------
	[概要]⑦ メソッド：「攻撃（void attack）」
	-------------------------------------------------------------------------*/
    public String attack(Character target) {
     String logMessage = this.name + " の攻撃！ ";
     logMessage += target.receiveDamage(this.at);
     return logMessage;
    } 
    
    // 修正 : 当初はここで画面に出力する処理もしていたが、記録に残す関係でその機能は「BattleManager」へ移行
	
    /*-------------------------------------------------------------------------
	[概要]⑧ メソッド：「ダメージ（void receiveDamage）」
	-------------------------------------------------------------------------*/
    public String receiveDamage(int damage) {
     this.hp -= damage;
     if (this.hp < 0) this.hp = 0;
     return this.name + " は " + damage + " のダメージを受けた！ (残りHP: " + this.hp + ")";
    }
    
 // 修正 : 当初はここで画面に出力する処理もしていたが、記録に残す関係でその機能は「BattleManager」へ移行
	
}
