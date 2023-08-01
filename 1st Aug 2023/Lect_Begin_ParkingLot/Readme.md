Input to controller

Q1. One parameter or many parameters?

Ans1. One request dto (which has all inputs as fields inside it)

Q2. Instead of DTO can't we use models for input in controllers?

Ans2.

2.1 Necessary Information => No model has all 3 inputs together

2.2 Sufficient Information => Models which have extra information will confuse the client while making a request

2.3 Models have a single responsibility of representing schema of problem


Q3. Instead of DTO can't we use models for output in controllers?

Ans3. No, the reasons are same as Q2.
Also, ResponseDTO help us give better response in case of an exception