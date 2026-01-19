package curriculum.k;

/**********************************************************************************
* [概要] 課題 22.7 「オブジェクト指向の設計原則」の課題にて使用する「Mainクラス」
* [詳細] 
* ① 「SalaryReporter」のインスタンスを用意する
* ② 具体的な社員データを用意する
* ③ 「SalaryReporter」のインスタンスにデータを渡して計算と出力をさせる
**********************************************************************************/

public class Main {

	public static void main(String[] args) {
        // ①
        SalaryReporter reporter = new SalaryReporter();

        // ② （ とりあえずの勤務時間を設定 ）
        Payable p001 = new FullTimeEmployee("田中", 160);
        Payable p002 = new ContractEmployee("佐藤", 160);

        // ③
        System.out.println("--- 給与レポート ---");
        System.out.println("--- 出力開始 ---");
        reporter.report(p001);
        reporter.report(p002);
        System.out.println("--- 出力終了 ---");
    }

}
