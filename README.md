# ees-devops-desenvolvimento-web

Essa aplicação permite tanto o cadastro de novos livros quanto a listagem desses livros,contendo as seguintes propriedades:

- Título
- Autor
- Resumo
- Ano de lançamento

### Procedimentos para subir a aplicação:

  - O banco de dados utilizado no projeto foi o Postgresql versão 12 e o pgAdmin 4. 
  - Crie um banco de dados chamado dbbooks através do pgAdmim
Obs: As tabelas serão criadas pela a aplicação,pois a camada de persistencia do projeto esta configurado pela JPA/Hibernate 
  - Importe o projeto no eclipse, após feito o clone ou o download da aplicação através do GitHub  - Para a criação da tabela basta setar o valor da propriedade values como "create" no arquivo persistence.xml o qual se encontra
na pasta META-INF -> ```<property name="hibernate.hbm2ddl.auto" value="create" />```, depois de criadas as tabelas altere o valor para update
  - Baixe a versão 9 do Apache Tomcat e configure na aba Servers do eclipse
  - Em seguida adicione o projeto no servidor de aplicação Apache Tomcat no eclipse
  - Start o Apache e depois cole o seguinte link no navegador : http://localhost:8080/introducao-java-web/adiciona-livros.html

