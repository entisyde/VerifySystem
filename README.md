
# Verification System


## Usage/Examples

```java
Verify verification = new Verify();

verification.setLength(9);
verification.generateNew();
        
System.out.println(verification.getVerificationCode());

String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        
System.out.println(verification.verify(input));
```

