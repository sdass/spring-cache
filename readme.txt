
 caching and eviction with ehcache springboot 2.x. Tested with ttl=10 sec ehcache.xl and @CacheEvict method annot. Used h2, Jpa, web/rest api  

//https://stackoverflow.com/questions/55482051/spring-boot-native-cache-how-to-expire-remove-cache-data-by-individual-keys-el (for cache evict)
/*
https://www.youtube.com/watch?v=cWqNeANzEz0
https://howtodoinjava.com/spring-boot/ehcache2-config-example/
*/
Spring boot 2 and ehcache 3 example with h2, JPA and ehcache3

actually pom.xml below works
https://howtodoinjava.com/spring-boot2/ehcache3-config-example/

Log to prove caching works
---------------------------

invoking sequence:
curl http://localhost:8080/rest/search/ttt
curl http://localhost:8080/rest/search/ttt
curl http://localhost:8080/rest/search/ttt
curl http://localhost:8080/rest/search/mkc
curl http://localhost:8080/rest/search/mkc



corresponding oUtput sequence
Retrieving getUser at controller User [id=2, name=gev, teamName=Rad, salary=666.0]
Retrieving from database name =ttt
Retrieving getUser at controller User [id=4, name=ttt, teamName=Kiwi, salary=999.0]
Retrieving getUser at controller User [id=4, name=ttt, teamName=Kiwi, salary=999.0]
Retrieving getUser at controller User [id=4, name=ttt, teamName=Kiwi, salary=999.0]
Retrieving from database name =mkc
Retrieving getUser at controller User [id=3, name=mkc, teamName=Sony, salary=333.0]
Retrieving getUser at controller User [id=3, name=mkc, teamName=Sony, salary=333.0]