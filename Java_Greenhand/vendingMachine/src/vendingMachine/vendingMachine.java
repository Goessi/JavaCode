package vendingMachine;

public class vendingMachine {
	int price = 4;
	int balance;
	int total;
	
	vendingMachine(){ //���캯��
		total = 0;
	}
	
	vendingMachine(int price){ //���أ�����ֻ�����ڹ��캯��
		
		this(); //����û�в����Ĺ��캯��
		this.price = price;
		System.out.println("int");
	}
	
	void haha(double price){
		System.out.println("double");
	}
	void haha(int price) {
		System.out.println("int");
	}
	void showPrompt(){
		System.out.println("welcome");
	}
	
	void insertMoney(int amount){
		balance = balance + amount;
	}
	
	void showBalance() {
		System.out.println(balance);
	}
	
	void getFood() {
		if(balance>=price)
		{
			System.out.println("this is your food");
			balance = balance - price;
			total = total + price;
		}
	}

	public static void main(String[] args) {
		vendingMachine vm = new vendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		vm.haha(100);
		vm.haha(100.0);

	}

}
