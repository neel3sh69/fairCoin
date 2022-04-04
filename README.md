# fairCoin
Program(s) for a fair coin (toss)


## Algorithm for a fair coin

### foo: 
Randomly generate either 0 or 1

### toss:

Step 1: Start

Step 2: vResult = foo

Step 3: vCheck = foo

Step 4: If vResult not equal to vCheck, return vResult

Else, go to Step 1
  
Step 5: End


## Math:

  Let’s assume that the probability of foo returning 0 is x and for 1 y
  y = 1-x
  
  E1 = vResult being 0
  
  E1’ = vResult being 1
  
  E2 = vCheck being 0
  
  E2’ = vCheck being 1
  
  
  E1 and E2 are independent events
  
  
  P(E1) = x
  
  P(E2’)=y
  
  P(heads) = P(E1∩E2’)
  
  = x*y
    
  = x*(1-x)


P(E1’) = y

P(E2) = x

P(tails) = P(E1’∩E2)

= y*x

=(1-x)x


P(heads) = P(tails)

