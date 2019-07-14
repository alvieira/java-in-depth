package assignment3;

public class MoneyTransferService {

	public static void main(String[] args) {

		MoneyTransferService transferService = new MoneyTransferService();

		double transferAmount = transferService.computeTransferAmount(0, 1000);

		double transferFee = transferService.computeTransferFee(0, 1000);

		System.out.println("Transfer Amount: " + transferAmount);

		System.out.println("Transfer Fee: " + transferFee);

	}

	private double computeTransferFee(int countryIndex, double amount) {
		
		double theFee;

		theFee = computeTransferAmount(countryIndex, amount) * 0.02;

		return theFee;
	}

	private double computeTransferAmount(int countryIndex, double amount) {
		
		double theAmount;
		CurrencyConverter currencyConverter = new CurrencyConverter();

		theAmount = currencyConverter.computeTransferAmount(countryIndex, amount);

		return theAmount;
	}

}
