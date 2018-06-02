package org.ebook.trade.repository;

import org.ebook.trade.model.Trade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeRepository extends CrudRepository<Trade,Integer>  {
    public Trade findById(Integer tradeID);
    
}
