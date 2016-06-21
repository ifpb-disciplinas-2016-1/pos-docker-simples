FROM payara/server-web
ENV DOMAIN domain1
ENV DEPLOY ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/autodeploy/

ENV LIB ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/lib/
ADD target/exemplo-docker/WEB-INF/lib ${LIB}

ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
WORKDIR /opt/payara41/glassfish/bin

ADD target/exemplo-docker.war ${DEPLOY}
