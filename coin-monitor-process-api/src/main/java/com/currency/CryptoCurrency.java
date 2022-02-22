package com.currency;
import java.util.ArrayList;


public class CryptoCurrency implements java.io.Serializable, Comparable<CryptoCurrency> {
	/**
	 * POJO class CryptoCurrency
	 */
	private static final long serialVersionUID = 1L;

	String date;
	Data data;

	public CryptoCurrency() {}
	public CryptoCurrency(String date, Data data) {
		this.date = date;
		this.data = data;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public static class Data {
		static ArrayList <CurrencyType> currencyTypeArray;
		CurrencyType currencyType;

		public Data() {}
		public Data(CurrencyType currencyType) {
			currencyTypeArray = new ArrayList<CurrencyType>();
			this.currencyType = currencyType;
			currencyTypeArray.add(currencyType);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((currencyType == null) ? 0 : currencyType.hashCode());
			result = prime * result + ((currencyTypeArray == null) ? 0 : currencyTypeArray.hashCode());
			return result;
		}
		public static class CurrencyType {
			String name;
			String symbol;
			String supply;
			String coin_market_price;
			String coin_cap_price;
			String coin_market_volume; 
			String coin_cap_volume; 

			public CurrencyType() {}
			public CurrencyType(String name, String symbol, String supply, String coin_market_price, String coin_cap_price, String coin_market_volume, String coin_cap_volume) {
				this.name = name;
				this.symbol = symbol;
				this.supply = supply;
				this.coin_market_price = coin_market_price;
				this.coin_cap_price = coin_cap_price;
				this.coin_market_volume = coin_market_volume;
				this.coin_cap_volume = coin_cap_volume;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getSymbol() {
				return symbol;
			}
			public void setSymbol(String symbol) {
				this.symbol = symbol;
			}
			public String getSupply() {
				return supply;
			}
			public void setSupply(String supply) {
				this.supply = supply;
			}
			public String getCoin_market_price() {
				return coin_market_price;
			}
			public void setCoin_market_price(String coin_market_price) {
				this.coin_market_price = coin_market_price;
			}
			public String getCoin_cap_price() {
				return coin_cap_price;
			}
			public void setCoin_cap_price(String coin_cap_price) {
				this.coin_cap_price = coin_cap_price;
			}
			public String getCoin_market_volume() {
				return coin_market_volume;
			}
			public void setCoin_market_volume(String coin_market_volume) {
				this.coin_market_volume = coin_market_volume;
			}
			public String getCoin_cap_volume() {
				return coin_cap_volume;
			}
			public void setCoin_cap_volume(String coin_cap_volume) {
				this.coin_cap_volume = coin_cap_volume;
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((name == null) ? 0 : name.hashCode());
				result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
				result = 31 * result + supply.hashCode();
				result = prime * result + ((coin_market_price == null) ? 0 : coin_market_price.hashCode());
				result = prime * result + ((coin_cap_price == null) ? 0 : coin_cap_price.hashCode());
				result = prime * result + ((coin_market_volume == null) ? 0 : coin_market_volume.hashCode());
				result = prime * result + ((coin_cap_volume == null) ? 0 : coin_cap_volume.hashCode());
				return result;
			}
		}
	}

	@Override
	public int compareTo(CryptoCurrency o) {
		return this.date.compareTo(o.date);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}
	public static int getHashCode(Object o) {
		return o.hashCode();
	}
}

