FROM mariadb
# Add a database
ENV MYSQL_DATABASE testdb
ENV MYSQL_ROOT_PASSWORD Password@123
ENV MYSQL_DATABASE library
ENV MYSQL_USER lamya
ENV MYSQL_PASSWORD UserPass@123
COPY ./sql /docker-entrypoint-initdb.d
EXPOSE 3306