# Specification With ExpectedToFailInfoExtension

## [Matt Spends his 50 Cents](- "Reason my specification is failing... c:status=expectedToFail")
Given a person Matt has a [50](- "#amount") [cent piece](- "amountTotal(#amount)")
When Matt buys [50](- "#bought") [cents worth of candy](- "amountSpent(#bought)")
Then Matt has [1](- "?=calculateRemaining()") cents left

## [Matt has 50 cents](- )
Given a person Matt has a [50](- "#amount") [cent piece](- "amountTotal(#amount)")
When Matt buys [0](- "#bought") [cents worth of candy](- "amountSpent(#bought)")
Then Matt has [50](- "?=calculateRemaining()") cents left