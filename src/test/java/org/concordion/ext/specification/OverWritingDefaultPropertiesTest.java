package org.concordion.ext.specification;

import org.concordion.api.extension.Extension;
import org.concordion.ext.statusinfo.StatusInfo;
import org.concordion.ext.statusinfo.StatusInfoExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;


@RunWith(ConcordionRunner.class)
public class OverWritingDefaultPropertiesTest {

    private int totalAmount = 0;
    private int totalSpent = 0;

    private StatusInfo statusInfoConfig = new StatusInfo()
            .withMessageSize("h1")
            .withTitleTextPrefix("New Note")
            .withReasonPrefixMessage("New Reason")
            .withStyle("font-weight: normal; text-decoration: none; color: #FFFF00;");

    @Extension
    StatusInfoExtension statusInfo = new StatusInfoExtension().setStatusInfo(statusInfoConfig);

    public void amountTotal(String amount) {
        totalAmount = Integer.parseInt(amount.trim());
    }

    public void amountSpent(String spent) {
        totalSpent = Integer.parseInt(spent.trim());
    }

    public int calculateRemaining() {
        return (totalAmount - totalSpent);
    }

}
