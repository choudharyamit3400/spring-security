<div id="header" >
  <img src="https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExOGlsam5hZDZidzc2OG15eXgyYnBkOHhjdzE0Z2VjczBqenY4OGU3biZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9cw/igRW3jH2LcCVzMqi5F/giphy.gif" width="100"/>
</div>

<div id="badges" style="margin-left:35%">
 <a href="https://www.linkedin.com/in/amitkumarusa/"> <img src="https://img.shields.io/badge/LinkedIn-blue?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn Badge"/></a>
  
<a href="https://www.youtube.com/@DontKnowHowToCode">
    <img src="https://img.shields.io/badge/YouTube-red?style=for-the-badge&logo=youtube&logoColor=white" alt="Youtube Badge"/>
  </a>
  <a href="https://x.com/choudharyamit34"><img src="https://img.shields.io/badge/Twitter-blue?style=for-the-badge&logo=twitter&logoColor=white" 
alt="Twitter Badge"/></a>
</div>
<img src="https://komarev.com/ghpvc/?username=choudharyamit3400&style=flat-square&color=blue" alt=""/>

<h1>
  hey there
  <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"/>
</h1>

<div align="center">
  <img src="https://media.giphy.com/media/dWesBcTLavkZuG35MI/giphy.gif" width="600" height="300"/>
</div>

---

### :technologist: About Me :

I am a Full Stack Developer <img src="https://media.giphy.com/media/WUlplcMpOCEmTGBtBW/giphy.gif" width="30"> from Sterling , Virginia.

- :telescope: I’m working as a Software Engineer and contributing to frontend and backend for building web applications.

- :seedling: Exploring Technical Content Writing , always learning something new .

- :zap: In my free time, I read latest tech articles to keep myself updated with latest technologies.

- :mailbox:How to reach me: [![Linkedin Badge](https://img.shields.io/badge/Amit%20Kumar-blue?style=flat&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/amitkumarusa/)

<!--
Here are some ideas to get you started:

- 🔭 I’m currently working on ...
- 🌱 I’m currently learning ...
- 👯 I’m looking to collaborate on ...
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->

:zzz: Enough about me lets dive into this repository to gather some understanding . 

This is a  work in progress  Spring Security  architecture that could be followed to learn SpringBoot Security for Rest Api's at one place .
There is ongoing work to add  a lot of other capabilities and modules needed to create a real world application like system.


Please discard indentation and formatting  of this readme file as it's not as per the standard what we generally have . 
This readme is intended  for my personal use as  quick refer doc for any module .
Once all the modules are covered then it would be updated accordingly 

Below-mentioned modules are used to create these microservices .

1. Spring Security
2. Spring Boot Starter Web
3. Spring Boot Starter Oauth
4. Spring Cloud Dev Tools
5. Spring Boot Data Jpa
6. Spring Boot JDBC
7. Spring Boot Starter Test
8. Spring Security Test
9. H2 database

Core Concepts you would learn from here are listed below 
1. SpringSecurityFilter Chain(WebSecurity Adaptor is depreciated with Spring Security 6)
2. Using in memory H2 Database
3. Basic user -password authentication - By UserDetailsService
4. Jwt based user authentication - By Oauth
5. JWT  validation (Integrity & Expiry) - By Oauth(JwtEncoder , JwtDecoder)

This application would start on  port 8087
# Get token
- Hit authenticate resource as a post 
- select basic auth as the authentication type
- enter your configured username & password in BasicAuthSecurityConfiguration.java
- hit send and you should see a token generated in response
use below curl to get your token 
```json
curl --location --request POST 'http://localhost:8087/authenticate' \
--header 'Authorization: Basic YW1pdDphbWl0'
```
once token is received then you can use hit the /todos resource to get all the configured todos 

get--> http://localhost:8087/todos
with auth as  beater token 

To get a specific todo for user hit
http://localhost:8087/users/{username}/todos

- 📫 if you run into  any issue then please reach to me on [Linkedin](https://www.linkedin.com/in/amitkumarusa/) or you can email me at amit.kumar.
  usa35@gmail.com



