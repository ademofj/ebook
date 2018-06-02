package org.ebook.trade.services;

import org.ebook.trade.model.Trade;
import org.ebook.trade.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
public class TradeService {
    @Autowired
    private TradeRepository tradeRepository;

 
    public Trade getTrade(Integer tradeId) {
        return tradeRepository.findById(tradeId);
    }

    public void saveTrade(Trade trade){

    	tradeRepository.save(trade);
     }

    public void updateTrade(Trade trade){
    	tradeRepository.save(trade);
 
    }

    public void deleteTrade(Trade trade){
    	tradeRepository.delete(trade);	  
    }
 
}
