# Number generator

The program generates and compares numbers according to the generator settings

## Getting Started

* [generator.jar](https://github.com/SergejJerma/numbers-generator/tree/master/numbers-generator/generator.jar) 
```
java -jar generator.jar
```

### Back-end
```
Java SE 11
Spring Boot 2.2.1
Maven 3.6.1
Lombok v1.18.10
```

### Front-end
```
FreeMarker
Bootstrap
```

### Example

Launching the application opens an interface (http://localhost:8080/), where the user can enter numbers, view current generator parameters and update them.

input:
```
Enter a first number: 65
Enter a first number: 8921

```
result:
```
Matches:
3 868
```

## Algorithm/Default generator settings

The application uses two number generators (A and B) that work according to the following principles:
* Initial numbers of the generators are application parameters (generator A starts with the first parameter, generator B starts with the second); 
* The number is multiplied by a factor;  (Generator A factor = 16807, generator B factor = 48271); 
* This result of multiplication is divided by 2147483647; 
* Result of division is a remainder; 
* This remainder becomes the starting number of the next iteration. 

Resulting numbers are checked according to the following principles:
* Take one number from each generator and compare whether their last 8 bits match.

Application derivation:  
* the number of times a comparison gave a positive result after 1'000'000 (1 million) comparisons 

## Testing

The program includes simple integration and unit tests