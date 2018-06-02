package org.ebook.trade.controllers;


import org.ebook.trade.model.Trade;
import org.ebook.trade.services.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/trade")
public class TradeServiceController {
    @Autowired
    private TradeService tradeService;
    private static final Logger logger = LoggerFactory.getLogger(TradeServiceController.class);

    @RequestMapping(value="/{tradeId}",method = RequestMethod.GET)
    public Trade getTrade( @PathVariable("tradeId") Integer tradeId) {

        Trade trade = tradeService.getTrade(tradeId);
        
        return trade;
    }

    @RequestMapping(value="/{tradeId}",method = RequestMethod.PUT)
    public void updateTrade( @PathVariable("tradeId") Integer tradeId, @RequestBody Trade trade) {
        tradeService.updateTrade( trade );

    }

    @RequestMapping(value="/{tradeId}",method = RequestMethod.POST)
    public void saveTrade(@RequestBody Trade trade) {
       tradeService.saveTrade( trade );
    }
 
    @RequestMapping(value="/{tradeId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrade( @RequestBody Trade trade) {
        tradeService.deleteTrade( trade );
    }
    
    
}
