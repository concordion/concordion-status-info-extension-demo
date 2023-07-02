# Specification Without ExpectedToFailInfoExtension


## [Matt Spends his 50 Cents](- "The specification is intentionally wrong... c:status=expectedToFail")
Given a person Matt has a [50](- "#amount") [cent piece](- "amountTotal(#amount)")
When Matt buys [50](- "#bought") [cents worth of candy](- "amountSpent(#bought)")
Then Matt has [1](- "?=calculateRemaining()") cents left


## [Matt Spends his 50 Cents](- "The specification is intentionally ignored... c:status=ignored")
Given a person Matt has a [50](- "#amount") [cent piece](- "amountTotal(#amount)")
When Matt buys [50](- "#bought") [cents worth of candy](- "amountSpent(#bought)")
Then Matt has [1](- "?=calculateRemaining()") cents left


## [Matt Spends his 50 Cents](- "The specification is intentionally unimplemented... c:status=unimplemented")


## [Matt has 50 cents](- )
Given a person Matt has a [50](- "#amount") [cent piece](- "amountTotal(#amount)")
When Matt buys [0](- "#bought") [cents worth of candy](- "amountSpent(#bought)")
Then Matt has [50](- "?=calculateRemaining()") cents left

