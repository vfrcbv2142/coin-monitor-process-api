package com.currency;

import java.util.ArrayList;



public class CryptoCurrency implements java.io.Serializable, Comparable<CryptoCurrency> {
	/**
	 * CryptoCurrency POJO class
	 */
	private static final long serialVersionUID = 1L;
	
	String oldDate;
	String newDate;
	String dateDifference;
	String date;
	Data data;
	
	public CryptoCurrency() {}
	
	public CryptoCurrency(String date) {
		this.date = date;
	}
	
	public CryptoCurrency(String date, Data data) {
		this.date = date;
		this.data = data;
	}
	public CryptoCurrency(String oldDate, String newDate, String dateDifference) {
		this.oldDate = oldDate;
		this.newDate = newDate;
		this.dateDifference = dateDifference;
	}
	public CryptoCurrency(String oldDate, String newDate, String dateDifference, Data data) {
		this.oldDate = oldDate;
		this.newDate = newDate;
		this.dateDifference = dateDifference;
		this.data = data;
	}
	
	public String getOldDate() {
		return oldDate;
	}
	public void setOldDate(String oldDate) {
		this.oldDate = oldDate;
	}
	public String getNewDate() {
		return newDate;
	}
	public void setNewDate(String newDate) {
		this.newDate = newDate;
	}
	public String getDateDifference() {
		return dateDifference;
	}
	public void setDateDifference(String dateDifference) {
		this.dateDifference = dateDifference;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((oldDate == null) ? 0 : oldDate.hashCode());
		result = prime * result + ((newDate == null) ? 0 : newDate.hashCode());
		result = prime * result + ((dateDifference == null) ? 0 : dateDifference.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}
	
	@Override
	public int compareTo(CryptoCurrency o) {
		return this.data.compareTo(o.data);
	}
	
	public static int getHashCode(Object o) {
		return o.hashCode();
	}

	public class Data {
		ArrayList <Coin> coinList = new ArrayList<Coin>();
		Coin coin;
	
		public Data() {}
		
		public Data(Coin coin) {
			this.coin = coin;
			this.coinList.add(coin);
			if (this.coin == new Coin())
				this.coinList.add(coin);
		}
		
		public Coin getCoin() {
			return coin;
		}
		public void setCoin(Coin coin) {
			this.coin = coin;
		}
		public void addCoin(Coin coin) {
			coinList.add(coin);
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((coin == null) ? 0 : coin.hashCode());
			for (Coin coin : coinList)
				result = prime * result + ((coin == null) ? 0 : coin.hashCode());
			return result;
		}
		public int compareTo(CryptoCurrency.Data data) {
			return this.coin.compareTo(data.coin);
		}

		public class Coin {
			String name;
			String symbol;
			String supply;
			String description;
			String developmentStatus;
			String proofType;
			String orgStructure;
			String coin_market_price_oldPriceUSD;
			String coin_cap_price_oldPriceUSD;
			String coin_market_price_newPriceUSD;
			String coin_cap_price_newPriceUSD;
			String coin_market_price_priceDifference;
			String coin_cap_price_priceDifference;
			String coin_market_price;
			String coin_cap_price;
			String coin_market_volume24h; 
			String coin_cap_volume24h;

			public Coin() {}
			
			public Coin(String name, String symbol, String supply,
					String coin_market_price, String coin_cap_price, 
					String coin_market_volume24h, String coin_cap_volume24h) {
				this.name = name;
				this.symbol = symbol;
				this.supply = supply;
				this.coin_market_price = coin_market_price;
				this.coin_cap_price = coin_cap_price;
				this.coin_market_volume24h = coin_market_volume24h;
				this.coin_cap_volume24h = coin_cap_volume24h;
			}
			public Coin(String name, String symbol, String supply, String description,
					String developmentStatus, String proofType, String orgStructure, 
					String coin_market_price, String coin_cap_price, 
					String coin_market_volume24h, String coin_cap_volume24h) {
				this.name = name;
				this.symbol = symbol;
				this.supply = supply;
				this.description = description;
				this.developmentStatus = developmentStatus;
				this.proofType = proofType;
				this.orgStructure = orgStructure;
				this.coin_market_price = coin_market_price;
				this.coin_cap_price = coin_cap_price;
				this.coin_market_volume24h = coin_market_volume24h;
				this.coin_cap_volume24h = coin_cap_volume24h;
			}
			public Coin(String name, String symbol, String supply, String description,
					String developmentStatus, String proofType, String orgStructure, 
					String coin_market_price_oldPriceUSD, String coin_cap_price_oldPriceUSD, 
					String coin_market_price_newPriceUSD, String coin_cap_price_newPriceUSD, 
					String coin_market_price_priceDifference, String coin_cap_price_priceDifference,
					String coin_market_volume24h, String coin_cap_volume24h) {
				this.name = name;
				this.symbol = symbol;
				this.supply = supply;
				this.description = description;
				this.developmentStatus = developmentStatus;
				this.proofType = proofType;
				this.orgStructure = orgStructure;
				this.coin_market_price_oldPriceUSD = coin_market_price_oldPriceUSD;
				this.coin_cap_price_oldPriceUSD = coin_cap_price_oldPriceUSD;
				this.coin_market_price_newPriceUSD = coin_market_price_newPriceUSD;
				this.coin_cap_price_newPriceUSD = coin_cap_price_newPriceUSD;
				this.coin_market_price_priceDifference = coin_market_price_priceDifference;
				this.coin_cap_price_priceDifference = coin_cap_price_priceDifference;
				this.coin_market_volume24h = coin_market_volume24h;
				this.coin_cap_volume24h = coin_cap_volume24h;
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
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public String getDevelopmentStatus() {
				return developmentStatus;
			}
			public void setDevelopmentStatus(String developmentStatus) {
				this.developmentStatus = developmentStatus;
			}
			public String getProofType() {
				return proofType;
			}
			public void setProofType(String proofType) {
				this.proofType = proofType;
			}
			public String getOrgStructure() {
				return orgStructure;
			}
			public void setOrgStructure(String orgStructure) {
				this.orgStructure = orgStructure;
			}
			public String getCoin_market_price_oldPriceUSD() {
				return coin_market_price_oldPriceUSD;
			}
			public void setCoin_market_price_oldPriceUSD(String coin_market_price_oldPriceUSD) {
				this.coin_market_price_oldPriceUSD = coin_market_price_oldPriceUSD;
			}
			public String getCoin_cap_price_oldPriceUSD() {
				return coin_cap_price_oldPriceUSD;
			}
			public void setCoin_cap_price_oldPriceUSD(String coin_cap_price_oldPriceUSD) {
				this.coin_cap_price_oldPriceUSD = coin_cap_price_oldPriceUSD;
			}
			public String getCoin_market_price_newPriceUSD() {
				return coin_market_price_newPriceUSD;
			}
			public void setCoin_market_price_newPriceUSD(String coin_market_price_newPriceUSD) {
				this.coin_market_price_newPriceUSD = coin_market_price_newPriceUSD;
			}
			public String getCoin_cap_price_newPriceUSD() {
				return coin_cap_price_newPriceUSD;
			}
			public void setCoin_cap_price_newPriceUSD(String coin_cap_price_newPriceUSD) {
				this.coin_cap_price_newPriceUSD = coin_cap_price_newPriceUSD;
			}
			public String getCoin_market_price_priceDifference() {
				return coin_market_price_priceDifference;
			}
			public void setCoin_market_price_priceDifference(String coin_market_price_priceDifference) {
				this.coin_market_price_priceDifference = coin_market_price_priceDifference;
			}
			public String getCoin_cap_price_priceDifference() {
				return coin_cap_price_priceDifference;
			}
			public void setCoin_cap_price_priceDifference(String coin_cap_price_priceDifference) {
				this.coin_cap_price_priceDifference = coin_cap_price_priceDifference;
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
			public String getCoin_market_volume24h() {
				return coin_market_volume24h;
			}
			public void setCoin_market_volume24h(String coin_market_volume24h) {
				this.coin_market_volume24h = coin_market_volume24h;
			}
			public String getCoin_cap_volume24h() {
				return coin_cap_volume24h;
			}
			public void setCoin_cap_volume24h(String coin_cap_volume24h) {
				this.coin_cap_volume24h = coin_cap_volume24h;
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((name == null) ? 0 : name.hashCode());
				result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
				result = prime * result + ((supply == null) ? 0 : supply.hashCode());
				result = prime * result + ((description == null) ? 0 : description.hashCode());
				result = prime * result + ((developmentStatus == null) ? 0 : developmentStatus.hashCode());
				result = prime * result + ((proofType == null) ? 0 : proofType.hashCode());
				result = prime * result + ((orgStructure == null) ? 0 : orgStructure.hashCode());
				result = prime * result + ((coin_market_price_oldPriceUSD == null) ? 0 : coin_market_price_oldPriceUSD.hashCode());
				result = prime * result + ((coin_cap_price_oldPriceUSD == null) ? 0 : coin_cap_price_oldPriceUSD.hashCode());
				result = prime * result + ((coin_market_price_newPriceUSD == null) ? 0 : coin_market_price_newPriceUSD.hashCode());
				result = prime * result + ((coin_cap_price_newPriceUSD == null) ? 0 : coin_cap_price_newPriceUSD.hashCode());
				result = prime * result + ((coin_market_price_priceDifference == null) ? 0 : coin_market_price_priceDifference.hashCode());
				result = prime * result + ((coin_cap_price_priceDifference == null) ? 0 : coin_cap_price_priceDifference.hashCode());
				result = prime * result + ((coin_market_price == null) ? 0 : coin_market_price.hashCode());
				result = prime * result + ((coin_cap_price == null) ? 0 : coin_cap_price.hashCode());
				result = prime * result + ((coin_market_volume24h == null) ? 0 : coin_market_volume24h.hashCode());
				result = prime * result + ((coin_cap_volume24h == null) ? 0 : coin_cap_volume24h.hashCode());
				return result;
			}
			
			public int compareTo(CryptoCurrency.Data.Coin coin) {
				return this.supply.compareTo(coin.supply);
			}
		}
	}
}

