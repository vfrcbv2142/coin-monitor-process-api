fun unifyData(obj) = do {
	var changedData = obj.data map ((item, index) -> {
    	name: item.name,
    	symbol: item.symbol,
    	supply: item.supply as Number,
    	(description: item.description) if(item.description != null),
    	(dStatus: item.developmentStatus) if(item.developmentStatus != null),
    	(proofT: item.proofType) if(item.proofType != null),
    	(orgStr: item.orgStructure) if(item.orgStructure != null),
    	(cmPrice: trim(item.'coin_market_price' replace "\$" with "") as Number) if (item.'coin_market_price' != null),
    	(ccPrice: trim(item.'coin_cap_price' replace "\$" with "") as Number) if (item.'coin_cap_price' != null),
    	(cmOldPrice: trim(item.'coin_market_oldPriceUSD' replace "\$" with "") as Number) if (item.'coin_market_oldPriceUSD' != null),
    	(cmNewPrice: trim(item.'coin_market_newPriceUSD' replace "\$" with "") as Number) if (item.'coin_market_newPriceUSD' != null),
    	(cmPD: trim(item.'coin_market_priceDifference' replace "\$" with "") as Number) if (item.'coin_market_priceDifference' != null),
    	(ccOldPrice: trim(item.'coin_cap_oldPriceUSD' replace "\$" with "") as Number) if (item.'coin_cap_oldPriceUSD' != null),
    	(ccNewPrice: trim(item.'coin_cap_newPriceUSD' replace "\$" with "") as Number) if (item.'coin_cap_newPriceUSD' != null),
    	(ccPD: trim(item.'coin_cap_priceDifference' replace "\$" with "") as Number) if (item.'coin_cap_priceDifference' != null),
    	(cmVolume24h: trim(item.'coin_market_volume24h' replace "\$" with "") as Number) if (item.'coin_market_volume24h' != null),
    	(ccVolume24h: trim(item.'coin_cap_volume24h' replace "\$" with "") as Number) if (item.'coin_cap_volume24h' != null)
	})
	---
	changedData
}