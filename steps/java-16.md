#Records
Introduced in Java 14
Since 15:
Non-private constructors
Annotations
Local Types
Since 16:
Can have static members
IntelliJ:
- create
- generate constructors
- refactor
- convert to and from classes
- run inspection over whole codebase   

#Pattern matching for instanceof
Since 16:
- no longer implicitly final
IntelliJ
   - simple example
   - add final
   - refactor - inline/extract
   - combine with other inspections
    
#New methods on stream
toList, map
IntelliJ
- suggests using toList (StreamsAPI)
- also suggests using toUnmodifiableList which has been available since Java 10
  
#Warnings for Value based classes
IntelliJ
- Wrapper constructors show warnings

#Local Types
#Static methods on inner classes

#Preview: Sealed types
 - New in 15, second preview in 16 with some refinements
This is STANDARD in 17, with NO CHANGES

Older:
 - Text blocks
 - Switch expressions
 - LVTI
 - Convenience methods for collections
 - New methods on Optional