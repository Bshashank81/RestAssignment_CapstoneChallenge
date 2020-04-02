package com.example.sharingapp;

import android.content.Context;

/**
 * Command to add a bid
 */
public class AddBidCommand extends Command {


    private Bid bid;
    private Context context;

    public AddBidCommand(Bid bid, Context context) {
        this.bid = bid;
        this.context = context;
    }

    // Save bid remotely
    public void execute(){
        ElasticSearchManager.AddBidTask addBidTask = new ElasticSearchManager.AddBidTask();

        addBidTask.addBid(bid);
        super.setIsExecuted(addBidTask.saveBids(context));
    }
}
