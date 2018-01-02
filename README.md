# backend2017


Problem przy uruchomianiu aplikacji z którym nie mogłam sobie poradzić, przez co nie miałam możliwości przetestowania aplikacji oraz sprawdzenia jej poprawności:

uruchomienie ze środowiska InteliJ:

WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.springframework.cglib.core.ReflectUtils$1 (file:/C:/Users/Róża/.m2/repository/org/springframework/spring-core/4.3.13.RELEASE/spring-core-4.3.13.RELEASE.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of org.springframework.cglib.core.ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release

uruchomienie poprzez wiersz poleceń i Maven również nie przynosiły efektów:
Error: Unable to access jarfile target/gs-spring-boot-0.1.0.jar

Aplikacja powinna otwierać się poprzez wpisanie adresu url http://localhost:8080/ 
(http://localhost:8080/cars http://localhost:8080/clients) w przeglądarce na komputerze lokalnym. 

Po odwarzaniu powyższych adresów w przeglądarkach:

Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Tue Jan 02 21:01:19 CET 2018
There was an unexpected error (type=Not Found, status=404).
No message available

Również brak połączenia poprzez aplikację Advanced REST client.


