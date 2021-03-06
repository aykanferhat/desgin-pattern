
### Chain of Responsibility Design Pattern

Chain of responsibility pattern is used achieve loose coupling in software design where a request
from client is passed to a chain of objects to process them. Then the object in the chain will
decide themselves who will be processing the request and whether the request is required to be
sent the next object in the chain or not.

#### Important Points

- Client doesn't know which part of the chaing will be processing the request and it will send
the request to first object in the chain.

- Each object in the chain will have it's own implementation to process the request, either
full or partial or to send it to the next object in the chain.

- Every object in the chain should have reference to the next object in chain to forward
the request to, its achieved by java composition.

- Chain of Responsibility design pattern is good to achieve lose coupling but it comes
with the trade-off of having a lot of implementation class and maintenance problems
if most of the code is common all the implementations.