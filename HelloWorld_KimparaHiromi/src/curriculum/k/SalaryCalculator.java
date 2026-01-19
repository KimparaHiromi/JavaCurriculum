package curriculum.k;

//社員の給与を計算し、レポートを出力するクラス
class SalaryCalculator {
public void calculateSalary(Employee e) {
//社員タイプごとに if で分岐
if (e.getType().equals("FullTime")) {
System.out.println(e.getName() + " の給料は " + (e.getHours() * 1200) + " 円");
} else if (e.getType().equals("Contract")) {
System.out.println(e.getName() + " の給料は " + (e.getHours() * 1000) + " 円");
}
}
}










/* メモ : 着眼点
 
 ・「給料計算」という名前でありながら出力もこのクラスで行う
 → 「給料計算」のみにし、「出力」を別クラスへ移行する？
 ・（学習した点を活かすなら）if文でいちいち全部書かずに、どんな社員タイプでも計算できるクラスにしたい
 
 */








/* 保存 : 課題提示段階でのコード

//社員の給与を計算し、レポートを出力するクラス
class SalaryCalculator {
public void calculateSalary(Employee e) {
//社員タイプごとに if で分岐
if (e.getType().equals("FullTime")) {
System.out.println(e.getName() + " の給料は " + (e.getHours() * 1200) + " 円");
} else if (e.getType().equals("Contract")) {
System.out.println(e.getName() + " の給料は " + (e.getHours() * 1000) + " 円");
}
}
}

*/



