# Specification One

## [Search Google for KFC](- "expected to fail Test c:status=expectedToFail")
Given I a user Matt has a [50] cent piece(- "amountTotal(#TEXT)")
When I Matt buys [50] cents of candy[kfc](- "amountSPent(#TEXT)")
Then Matt has [1](- "#remaining") [cents left](- "c:assertTrue=calculateRemaining(#remaining)")

