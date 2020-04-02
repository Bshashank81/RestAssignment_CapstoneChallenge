package com.example.sharingapp;

import android.content.Context;

/**
 * Command to delete a bid
 */
public class DeleteBidCommand extends Command {

    private Bid bid;
    private Context context;

    public DeleteBidCommand(Bid bid, Context context){
        this.bid = bid;
        this.context = context;
    }


    // Delete bid remotely
    public void execute(){
        ElasticSearchManager.RemoveBidTask remove_bid_task = new ElasticSearchManager.RemoveBidTask();

        remove_bid_task.removeBid(bid);
        super.setIsExecuted(remove_bid_task.saveBids(context))
    }

}





